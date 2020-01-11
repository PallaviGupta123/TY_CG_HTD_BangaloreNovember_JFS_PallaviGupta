package com.capgemini.retailermainteanancesystemapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermainteanancesystemapplication.dto.Order;
import com.capgemini.retailermainteanancesystemapplication.dto.Product;
import com.capgemini.retailermainteanancesystemapplication.exception.OrderException;
import com.capgemini.retailermainteanancesystemapplication.exception.ProductException;
@Repository
public class OrderDaoIpl implements OrderDao
{
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public Order searchOrder(int orderId) {
		String jpql="from Order where orderId=:orderId";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Order> query=manager.createQuery(jpql,Order.class);
		query.setParameter("custId", orderId);
		if(query!=null) 
			return query.getSingleResult();
			throw new OrderException("Order id dosenot exist");
		
	}

	@Override
	public boolean addOrder(Order order) {
		EntityManager manager=factory.createEntityManager();	
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(order);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			throw new ProductException("Order already exist");
		}
	}

	@Override
	public List<Order> getAllOrder() {
		String jpql="from Order";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Order> query=manager.createQuery(jpql,Order.class);
		return query.getResultList();
		
	}

}
