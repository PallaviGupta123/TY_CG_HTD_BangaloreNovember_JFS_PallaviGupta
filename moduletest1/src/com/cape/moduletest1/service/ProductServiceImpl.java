package com.cape.moduletest1.service;

import java.util.List;

import com.cape.moduletest1.bean.ProductBean;
import com.cape.moduletest1.dao.ProductDao;
import com.cape.moduletest1.factory.Factory;

public class ProductServiceImpl implements ProductService{
ProductDao dao=Factory.getDao();
	@Override
	public List<ProductBean> showProduct() {
		return dao.showProduct();
	}

	@Override
	public boolean buyProduct(ProductBean bean) {
		return dao.buyProduct(bean);
	}

	@Override
	public boolean searchProduct(String name) {
		return dao.searchProduct(name);
	}

}
