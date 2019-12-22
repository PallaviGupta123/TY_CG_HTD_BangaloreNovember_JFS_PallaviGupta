package com.cape.moduletest1.dao;

import java.util.List;

import com.cape.moduletest1.bean.ProductBean;

public interface ProductDao {
	public List<ProductBean> showProduct();
	public boolean buyProduct(ProductBean bean);
	public boolean searchProduct(String name);
	
	
	

}
