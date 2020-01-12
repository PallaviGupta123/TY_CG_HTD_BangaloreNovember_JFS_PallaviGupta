package com.capgemini.parallelprojecthibernate.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.capgemini.parallelprojecthibernate.abstraction.IAdminDao;
import com.capgemini.parallelprojecthibernate.bean.Admin;
import com.capgemini.parallelprojecthibernate.connection.DbConnector;

public class AdminDao implements IAdminDao{
  EntityManagerFactory factory=Persistence.createEntityManagerFactory("Test");
  EntityManager manager;

	@Override
	public Admin adminLogin(String username,String password) { 
		String jpql="from Admin where name=:name and password=:password";
		TypedQuery<Admin> query=manager.createQuery(jpql,Admin.class);
		query.setParameter("username", username);
		query.setParameter("password", password);
		Admin admin=null;
		try {
			admin=(Admin) query.getSingleResult();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return admin;
	

	
	}

}
