package com.capgemini.jpawithhibernate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Updatedemo 
{
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		 entityManager=entityManagerFactory.createEntityManager();
		 transaction=entityManager.getTransaction();
		transaction.begin();
		Movie record=entityManager.find(Movie.class,101);
		//record.setMovie_id(100);//we canot update primary key 
		record.setMovie_name("Race2");
		record.setRating("Excellent");
		System.out.println("record updated");
		transaction.commit();
		
	}catch(Exception e)
		{
		e.printStackTrace();
		}

}
}