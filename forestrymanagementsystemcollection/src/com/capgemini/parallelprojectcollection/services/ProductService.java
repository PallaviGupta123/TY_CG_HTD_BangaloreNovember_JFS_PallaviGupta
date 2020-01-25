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

	@Override
	public boolean deleteProduct(int productId) {
		return dao.deleteProduct(productId);
	}

	@Override
	public boolean searchProduct(int productId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(int productID, Product product) {
		return dao.updateProduct(productID, product);
	}

	@Override
	public boolean isProductIdExist(int productId) {
		return dao.isProductIdExist(productId);
	}

}
