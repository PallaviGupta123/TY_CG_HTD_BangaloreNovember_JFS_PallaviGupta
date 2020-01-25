package com.capgemini.forestrymanagementsystem.service;

import java.util.List;

import com.capgemini.forestrymanagementsystem.abstraction.IProductDao;
import com.capgemini.forestrymanagementsystem.abstraction.IProductService;
import com.capgemini.forestrymanagementsystem.bean.Product;
import com.capgemini.forestrymanagementsystem.factory.Factory;

public class ProductService implements IProductService{
	IProductDao dao=Factory.objectProductDao();

	public boolean addProduct(Product product) {
		return dao.addProduct(product);
	}

	public boolean deleteProduct(int productId) {
		return dao.deleteProduct(productId);
	}

	public boolean searchProduct(int productId) {
		return dao.searchProduct(productId);
	}

	public List<Product> getAllProduct() {
		return dao.getAllProduct();
	}

	public boolean updateProduct(int productID, Product product) {
		return dao.updateProduct(productID, product);
	}

	@Override
	public boolean isProductNameExist(String productName) {
		return dao.isProductNameExist(productName);
	}

	
}
