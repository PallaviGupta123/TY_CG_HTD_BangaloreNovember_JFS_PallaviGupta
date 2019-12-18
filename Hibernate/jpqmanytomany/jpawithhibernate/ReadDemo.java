
package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Movie record=entityManager.find(Movie.class, 101);
		System.out.println("Id Is ----"+record.getMovie_id());
		System.out.println("Name is---"+record.getMname());
		System.out.println("Rating is ----"+record.getRating());
		entityManager.close();
		
	}

}
