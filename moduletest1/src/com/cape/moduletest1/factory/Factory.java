package com.cape.moduletest1.factory;

import com.cape.moduletest1.dao.ProductDao;
import com.cape.moduletest1.dao.ProductDaoImpl;
import com.cape.moduletest1.service.ProductService;
import com.cape.moduletest1.service.ProductServiceImpl;

public class Factory {
	public static ProductService getService() {
		ProductService service=new ProductServiceImpl();
	 return service;
	 
	}
	public static ProductDao getDao() {
		ProductDao dao=new ProductDaoImpl();
		return dao;
	}

}
