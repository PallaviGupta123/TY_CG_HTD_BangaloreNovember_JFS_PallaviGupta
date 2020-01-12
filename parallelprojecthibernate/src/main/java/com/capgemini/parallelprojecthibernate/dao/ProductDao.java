package com.capgemini.parallelprojecthibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.capgemini.parallelprojecthibernate.abstraction.IProductDao;
import com.capgemini.parallelprojecthibernate.bean.Product;

public class ProductDao implements IProductDao {
	EntityManagerFactory factory=Persistence .createEntityManagerFactory("Test");

	@Override
	public boolean addProduct(Product product) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(product);
			manager.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Product> getAllProduct() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from Product";
		TypedQuery<Product>query=manager.createQuery(jpql,Product.class);
		List<Product> list=query.getResultList();
		if(list!=null&&list.size()!=0) {
			return list;
		}return null;
	}

	@Override
	public boolean deleteProduct(int productId) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
		 Product product=manager.find(Product.class, productId);
		 manager.remove(product);
		 transaction.commit();
		 return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
