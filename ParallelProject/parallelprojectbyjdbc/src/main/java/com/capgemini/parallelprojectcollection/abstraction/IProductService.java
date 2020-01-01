package com.capgemini.parallelprojectcollection.abstraction;

import java.util.List;

import com.capgemini.parallelprojectcollection.bean.Product;

public interface IProductService {
	public boolean addProduct(Product product);
	public List<Product> getAllProduct();

}
