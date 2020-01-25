package com.capgemini.parallelprojectcollection.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.parallelprojectcollection.abstraction.IProductDao;

import com.capgemini.parallelprojectcollection.bean.Product;

public class ProductDao implements IProductDao{
	static List<Product> _Product=new ArrayList<Product>();
	Product product =new Product();
	@Override
	public boolean addProduct(Product product) {
		int count= StaticData.getProduct().size();
		StaticData.addProduct(product);
		int countAfter=StaticData.getProduct().size();
		if(countAfter>count) {
			return true;
		}
		 return false;
	}

	@Override
	public List<Product> getAllProduct() {
		 List<Product> p1=StaticData.getProduct();
		  return p1;
	}

	@Override
	public boolean deleteProduct(int productId) {
		Product productBean=new Product();
		List<Product> listProduct=new ArrayList<Product>();
		for (Product _productBean : listProduct) {
			if (_productBean.getProductId() == productId) {
				productBean = _productBean;
			}
		}
		if (productBean != null) {
			listProduct.remove(productBean);
			return true;
		}
		return false;
	}

	@Override
	public boolean searchProduct(int productId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(int productID,Product product) {
		List<Product> _Products=StaticData.getProduct();
		for (Product product2 : _Products) {
			if (product2.getProductId() == productID ) {
				_Products.set(2, product);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean isProductIdExist(int productId) {
		boolean result=false;
		List<Product> list=StaticData.getProduct();
		for (Product product : StaticData.getProduct()){
			if(product.getProductId()==productId)
			{
				result= true;
				break;
			}
		}
		return result;
	}
	

}
