package com.capgemini.parallelprojecthibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.capgemini.parallelprojecthibernate.abstraction.IRequestDao;
import com.capgemini.parallelprojecthibernate.bean.Client;
import com.capgemini.parallelprojecthibernate.bean.Request;

public class RequestDao implements IRequestDao{
 EntityManagerFactory factory=Persistence.createEntityManagerFactory("Test");
		 
	@Override
	public boolean createRequest(Request request) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(request);
			manager.close();
		}catch(Exception e) {
			e.printStackTrace();
		}return false;
	}

	@Override
	public List<Request> getAllRequest() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from Request";
		TypedQuery<Request>query=manager.createQuery(jpql,Request.class);
		List<Request> list=query.getResultList();
		if(list!=null&&list.size()!=0) {
			return list;
		}return null;
	}

	@Override
	public boolean cancelOrder(int requestId) {
		EntityManager manager=factory.createEntityManager();
		 EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
		 Request request=manager.find(Request.class, requestId);
		 manager.remove(request);
		 transaction.commit();
		 return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean editProfile(String customerId, Client client) {
		// TODO Auto-generated method stub
		return false;
	}

}
