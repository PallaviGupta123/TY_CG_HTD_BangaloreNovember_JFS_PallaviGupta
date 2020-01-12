package com.capgemini.parallelprojecthibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.capgemini.parallelprojecthibernate.abstraction.IClientDao;
import com.capgemini.parallelprojecthibernate.bean.Client;
import com.capgemini.parallelprojecthibernate.exception.GlobalException;

public class ClientDao implements IClientDao{
	EntityManager entityManager = null;
	EntityTransaction transaction = null;
	

	@Override
	public Client clientLogin(Client client) {
		// TODO Auto-generated method stub
		return null;
		
	}
	EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("Test");

	@Override
	public boolean addCustomer(Client client) {
		try {
			//EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerfactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(client);
			System.out.println("Record sucessfully inserted");
			transaction.commit();
			return true;
			} catch (Exception e) {
			try {
			throw new Exception("Exception While Adding Product Details");
			} catch (Exception e1) {
			e1.printStackTrace();
			}
			transaction.rollback();
			}

			entityManager.close();
			return false;
	}

	@Override
	public List<Client> getAllCustomer() {
		EntityManager manager=entityManagerfactory.createEntityManager();
		String jpql="from Client";
		TypedQuery<Client> query=manager.createQuery(jpql,Client.class);
		List<Client> list=query.getResultList();
		if(list!=null && list.size()!=0) {
			return list;
		}
		return null;
	}

	@Override
	public Client getCustomerbyID(int custId) {
		Client client1=new Client();
		EntityManager manager=entityManagerfactory.createEntityManager();
		Client client=manager.find(Client.class, client1.getId());
		if(client1!=null) {
			return client1;
		}
		return null;
				
		
	}

	

	@Override
	public boolean updateCustomer(int custID,Client client) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(int id)  {
		EntityManager manager= entityManagerfactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			Client client=manager.find(Client.class,id);
			manager.remove(client);
			transaction.commit();
			return true;
		}catch(Exception e) {
			//throw new GlobalException("Customer Id Does not exist");
		}
		return false;
		
	}

}
