package com.cape.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Transaction;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Retrieve 
{
  public static void main(String[] args) {
	  EntityManagerFactory entityManangerFactory=Persistence.createEntityManagerFactory("Test");
	  EntityManager entityManager=entityManangerFactory.createEntityManager();
	  //Transaction transaction=entityManager.getTransaction();
	 // transaction.begin();
	//  String jpql="from Movie";
	  
	  String jpql="Select mname from Movie";
	  Query query=entityManager.createQuery(jpql);
	  List<String> record =query.getResultList();
	  for (String movie:record) {
		 // System.out.println("MovieId : "+ ""+movie.getMovie_id());
		  //System.out.println("Movie Name: "+""+movie.getMname());
		 // System.out.println("Movie Rating: "+""+movie.getRating());
		  
		System.out.println(movie);
	}
	  
	
}
}
