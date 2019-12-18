package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToOne {
	public static void main(String[] args) {
		/*Emplyoee empl=new Emplyoee();
		empl.setEid(101);
		empl.setEname("PAllavi");
		empl.setEmail("pallavi@gmail.com");
		empl.setPassword("vnverma");
		
		EmplyoeeOtherInfo other=new EmplyoeeOtherInfo();
		other.setId(1);
		other.setPancard("abc231hss");
		other.setEmp(empl);*/
		
	EntityManager entityManager =null;
	EntityTransaction transaction=null;
	try {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");//Test is perseistence unit name
	 entityManager=entityManagerFactory.createEntityManager();
	 transaction=entityManager.getTransaction();
	transaction.begin();
	//entityManager.persist(other);
	//Bidirectional
	Emplyoee info=entityManager.find(Emplyoee.class,101);//Here we passing foreign key which is present in emp other
	System.out.println(info.getOther().getId());
	System.out.println("record saved");
	transaction.commit();
	}
	catch(Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
	entityManager.close();
}

}
