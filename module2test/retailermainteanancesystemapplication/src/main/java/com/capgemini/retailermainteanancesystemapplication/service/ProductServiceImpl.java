package com.capgemini.retailermainteanancesystemapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermainteanancesystemapplication.dao.ProductDao;
import com.capgemini.retailermainteanancesystemapplication.dto.Product;
@Service
public class ProductServiceImpl implements ProductDao{
	@Autowired
	private ProductDao dao;

	@Override
	public Product searchProduct(int productId) {
		return dao.searchProduct(productId);
	}

	@Override
	public boolean addProduct(Product product) {
		return dao.addProduct(product);
	}

	@Override
	public List<Product> getAllProdut() {
		return dao.getAllProdut();
	}

}
