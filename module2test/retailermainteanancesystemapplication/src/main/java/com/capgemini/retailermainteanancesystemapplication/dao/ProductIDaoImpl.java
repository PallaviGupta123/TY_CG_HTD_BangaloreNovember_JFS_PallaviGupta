package com.capgemini.retailermainteanancesystemapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermainteanancesystemapplication.dto.Product;
import com.capgemini.retailermainteanancesystemapplication.exception.ProductException;
@Repository
public class ProductIDaoImpl implements ProductDao{
@PersistenceUnit
EntityManagerFactory factory;
	@Override
	public Product searchProduct(int productId) {
		String jpql="from Product where productId=:ProductId";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Product> query=manager.createQuery(jpql,Product.class);
		query.setParameter("custId", productId);
		if(query!=null) 
			return query.getSingleResult();
			throw new ProductException("Customer id dosenot exist");
		
	}

	@Override
	public boolean addProduct(Product product) {
		EntityManager manager=factory.createEntityManager();	
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(product);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			throw new ProductException("Account already exist");
		}
	}

	@Override
	public List<Product> getAllProdut() {
		String jpql="from product";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Product> query=manager.createQuery(jpql,Product.class);
		return query.getResultList();
	}

}
