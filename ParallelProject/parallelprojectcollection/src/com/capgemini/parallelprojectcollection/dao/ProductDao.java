package com.capgemini.parallelprojectcollection.dao;

import java.util.List;

import com.capgemini.parallelprojectcollection.abstraction.IProductDao;
import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.bean.Product;

public class ProductDao implements IProductDao{

	@Override
	public boolean addProduct(Product product) {
		int count= StaticData.getProduct().size();
		StaticData.addProduct(product);
		int countAfter=StaticData.getProduct().size();
		if(countAfter>count) {
			return true;
		}
		 return false;
	}

	@Override
	public List<Product> getAllProduct() {
		 List<Product> p1=StaticData.getProduct();
		  return p1;
	}
	

}
