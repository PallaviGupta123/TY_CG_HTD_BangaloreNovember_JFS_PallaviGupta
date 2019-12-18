package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.Emplyoee;
import com.capgemini.jpawithhibernate.onetoone.EmplyoeeOtherInfo;

import lombok.Setter;

public class ManyToOne {
	public static void main(String[] args) {
		Emplyoee empl=new Emplyoee();
		empl.setEid(104);
		empl.setEname("Amit");
		empl.setEmail("amit@gmail.com");
		empl.setPassword("amit");
		
		EmplyoeeExperience exp=new EmplyoeeExperience();
		exp.setExid(18);
		exp.setCompany("Tcs");
		exp.setYear(2);
		exp.setEmp(empl);
		
		EmplyoeeExperience exp1=new EmplyoeeExperience();
		exp1.setExid(1);
		exp1.setCompany("Mphasis");
		exp1.setYear(3);
		exp1.setEmp(empl);
		
	EntityManager entityManager =null;
	EntityTransaction transaction=null;
	try {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");//Test is perseistence unit name
	 entityManager=entityManagerFactory.createEntityManager();
	 transaction=entityManager.getTransaction();
	transaction.begin();
	entityManager.persist(exp);
	entityManager.persist(exp1);
	transaction.commit();
	System.out.println("record saved");
	//transaction.commit();
	}
	catch(Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
	entityManager.close();
}

}
	


