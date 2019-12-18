
package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reattaching {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		Movie record=entityManager.find(Movie.class,102);
		System.out.println(entityManager.contains(record));
		entityManager.detach(record);//it remove object from databases
		//System.out.println(entityManager.contains(record));
		Movie reattachMovie=entityManager.merge(record);
		reattachMovie.setMovie_name("Bahubali");
		System.out.println("record  updated");
		transaction.commit();
	}catch(Exception e)
		{
		e.printStackTrace();
		}

		
	}

}
