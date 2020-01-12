package com.capgemini.parallelprojecthibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.capgemini.parallelprojecthibernate.abstraction.IHaulierDao;
import com.capgemini.parallelprojecthibernate.bean.Haulier;

public class HaulierDao implements IHaulierDao{
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("Test");
	EntityManager manager;
	EntityTransaction transaction;

	@Override
	public boolean addHaulier(Haulier haulier) {
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(haulier);
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteHaulier(int haulierId) {
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
		transaction.begin();
		try {
		 Haulier haulier=manager.find(Haulier.class, haulierId);
		 manager.remove(haulier);
		 transaction.commit();
		 return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean editHaulier(int haulierId, Haulier haulier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Haulier> getAllHaulier() {
		manager=factory.createEntityManager();
		String jpql="from Haulier";
		TypedQuery<Haulier> query=manager.createQuery(jpql,Haulier.class);
		List<Haulier> list=query.getResultList();
		if(list!=null&&list.size()!=0) {
			return list;
		}return null;
	}

}
