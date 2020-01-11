package com.capgemini.retailermainteanancesystemapplication.service;

import java.util.List;

import com.capgemini.retailermainteanancesystemapplication.dto.Product;

public interface ProductService {
	public Product searchProduct(int productId);
	public boolean addProduct(Product product);
	public List<Product> getAllProdut();

}
