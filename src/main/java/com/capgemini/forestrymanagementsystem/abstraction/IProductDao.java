package com.capgemini.forestrymanagementsystem.abstraction;

import java.util.List;

import com.capgemini.forestrymanagementsystem.bean.Product;

public interface IProductDao {
	public boolean addProduct(Product product);
	
	public boolean deleteProduct(int productId);
	public boolean searchProduct(int productId);
	public List<Product> getAllProduct();
	public boolean updateProduct(int productID,Product product);
	public boolean isProductNameExist(String productName);
	
	}
