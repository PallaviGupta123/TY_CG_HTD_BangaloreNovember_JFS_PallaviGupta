package com.capgemini.retailermainteanancesystemapplication.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.capgemini.retailermainteanancesystemapplication.dto.User;
import com.capgemini.retailermainteanancesystemapplication.exception.UserException;
@Repository
public class UserDaoImpl implements UserDao{
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean addUser(User user) {
		EntityManager manager=factory.createEntityManager();	
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(user);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			throw new UserException("Email already exist");
		}
	}


	@Override
	public boolean changePassword(String email, String password) {
		
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		User user=manager.find(User.class, email);
		user.setPassword(password);
		transaction.commit();
		return true;

	}

	@Override
	public User auth(String email, String password) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from User where email=:email";
		TypedQuery <User>query=manager.createQuery(jpql,User.class);
		query.setParameter("email", email);
		//query.setParameter("password", password);
		try {
			User bean=query.getSingleResult();
			BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
			if(encoder.matches(password, bean.getPassword())) {
				return bean;
			}else {
				throw new UserException("Password Invalid");
			}
		}catch(Exception e) {
			throw new UserException("Email invalid");
		}
	}

}
