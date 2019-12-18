package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class GetReference {
	public static void main(String[] args) {
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Movie record=entityManager.getReference(Movie.class, 102);
		//Movie record=entityManager.find(Movie.class, 100);
		
		//System.out.println(record.getClass());//it will return proxy name
		System.out.println("Id Is ----"+record.getMovie_id());
		System.out.println("Name is---"+record.getMname());
		System.out.println("Rating is ----"+record.getRating());
		entityManager.close();
	}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	

}
