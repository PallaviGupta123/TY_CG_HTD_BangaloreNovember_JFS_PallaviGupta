package com.cape.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicQuery {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		//String jpql="update Movie set mname=:nm where movie_id=:id";
		String jpql="delete from Movie where movie_id=:id";
		Query query= entityManager.createQuery(jpql);
		query.setParameter("id", 105);
		//query.setParameter("nm", "ABCD");
		int result=query.executeUpdate();
				transaction.commit();
		
		
		//string and object value
		
	}

}
