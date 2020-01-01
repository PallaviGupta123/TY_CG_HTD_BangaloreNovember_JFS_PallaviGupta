package com.capgemini.parallelprojectcollection.services;

import java.util.List;

import com.capgemini.parallelprojectcollection.abstraction.IProductDao;
import com.capgemini.parallelprojectcollection.abstraction.IProductService;
import com.capgemini.parallelprojectcollection.bean.Product;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class ProductService implements IProductService{
	IProductDao dao=Factory.objectProductDao();

	@Override
	public boolean addProduct(Product product) {
		return dao.addProduct(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return dao.getAllProduct();
	}

}
