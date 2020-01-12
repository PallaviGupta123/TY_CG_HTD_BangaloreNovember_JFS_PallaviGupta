package com.capgemini.parallelprojecthibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transaction;

import com.capgemini.parallelprojecthibernate.abstraction.IContractDao;
import com.capgemini.parallelprojecthibernate.bean.Contract;

public class ContractDao implements IContractDao{
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("Test");

	@Override
	public boolean acceptRequest(Contract contract) {
		
			EntityManager manager=factory.createEntityManager();
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			try {
			manager.persist(contract);
			System.out.println("Order delivered successfully");
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
			return false;
	}

	@Override
	public boolean rejectRequest(int orderId) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			Contract contract=manager.find(Contract.class, orderId);
			manager.remove(contract);
			transaction.commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delieverProduct(Contract contract) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contract> getAllRequest() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from Contract";
		TypedQuery<Contract> query=manager.createQuery(jpql,Contract.class);
		List<Contract> list=query.getResultList();
		if(list!=null&&list.size()!=0) {
			return list;
		}
		return null;
	}

}
