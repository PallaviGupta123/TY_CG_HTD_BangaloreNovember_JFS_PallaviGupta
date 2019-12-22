package com.cape.moduletest1.service;

import java.util.List;

import com.cape.moduletest1.bean.ProductBean;

public interface ProductService {
	public List<ProductBean> showProduct();
	public boolean buyProduct(ProductBean bean);
	public boolean searchProduct(String name);

}
