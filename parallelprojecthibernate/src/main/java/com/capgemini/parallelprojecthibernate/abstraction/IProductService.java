package com.capgemini.parallelprojecthibernate.abstraction;

import java.util.List;

import com.capgemini.parallelprojecthibernate.bean.Product;

public interface IProductService {
	public boolean addProduct(Product product);
	public List<Product> getAllProduct();
	public boolean deleteProduct(int productId);

}
