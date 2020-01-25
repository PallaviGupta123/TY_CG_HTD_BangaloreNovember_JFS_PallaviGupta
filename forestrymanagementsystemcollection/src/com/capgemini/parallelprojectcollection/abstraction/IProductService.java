package com.capgemini.parallelprojectcollection.abstraction;

import java.util.List;

import com.capgemini.parallelprojectcollection.bean.Product;

public interface IProductService {
public boolean addProduct(Product product);
	
	public boolean deleteProduct(int productId);
	public boolean searchProduct(int productId);
	public List<Product> getAllProduct();
	public boolean updateProduct(int productID,Product product);
	
	public boolean isProductIdExist(int productId);
}
