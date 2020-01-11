package com.capgemini.retailermainteanancesystemapplication.dao;

import java.util.List;

import com.capgemini.retailermainteanancesystemapplication.dto.Product;

public interface ProductDao {
	public Product searchProduct(int productId);
	public boolean addProduct(Product product);
	public List<Product> getAllProdut();

}
