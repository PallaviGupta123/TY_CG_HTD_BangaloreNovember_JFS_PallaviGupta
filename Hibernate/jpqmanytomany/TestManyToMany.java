package com.capgemini.jpqmanytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.Emplyoee;


public class TestManyToMany {
	public static void main(String[] args) {
		Emplyoee emp=new Emplyoee();
		emp.setEid(108);
		emp.setEname("Vinay");
		emp.setEmail("zohan@gmail.com");
		emp.setPassword("pallavi");
		Emplyoee emp1=new Emplyoee();
		emp1.setEid(105);
		emp1.setEname("Rajan");
		emp1.setEmail("rajan@gmail.com");
		emp1.setPassword("raju");
		
		List alist=new ArrayList<Emplyoee>();
		alist.add(emp);
		alist.add(emp1);
		Training_info tinfo=new Training_info();
		tinfo.setTid(43);
		tinfo.setTname("Java FS");
		tinfo.seteList(alist);
		
		
		
		EntityManager entityManager =null;
		EntityTransaction transaction=null;
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");//Test is perseistence unit name
		 entityManager=entityManagerFactory.createEntityManager();
		 transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(tinfo);
		
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

