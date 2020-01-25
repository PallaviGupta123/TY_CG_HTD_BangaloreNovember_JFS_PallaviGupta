package com.capgemini.forestrymanagementsystem.factory;

import com.capgemini.forestrymanagementsystem.abstraction.IAdminDao;
import com.capgemini.forestrymanagementsystem.abstraction.IAdminService;
import com.capgemini.forestrymanagementsystem.abstraction.IClientDao;
import com.capgemini.forestrymanagementsystem.abstraction.IClientService;
import com.capgemini.forestrymanagementsystem.abstraction.IContractServices;
import com.capgemini.forestrymanagementsystem.abstraction.IContractorDao;
import com.capgemini.forestrymanagementsystem.abstraction.IContractorDetailDao;
import com.capgemini.forestrymanagementsystem.abstraction.IContractorDetailService;
import com.capgemini.forestrymanagementsystem.abstraction.IHaulierDao;
import com.capgemini.forestrymanagementsystem.abstraction.IHauliersService;
import com.capgemini.forestrymanagementsystem.abstraction.IProductDao;
import com.capgemini.forestrymanagementsystem.abstraction.IProductService;
import com.capgemini.forestrymanagementsystem.abstraction.IRequestDao;
import com.capgemini.forestrymanagementsystem.abstraction.IRequestService;
import com.capgemini.forestrymanagementsystem.dao.AdminDao;
import com.capgemini.forestrymanagementsystem.dao.ClientDao;
import com.capgemini.forestrymanagementsystem.dao.ContractDao;
import com.capgemini.forestrymanagementsystem.dao.ContractorDetailDao;
import com.capgemini.forestrymanagementsystem.dao.HaulierDao;
import com.capgemini.forestrymanagementsystem.dao.ProductDao;
import com.capgemini.forestrymanagementsystem.dao.RequsetDao;
import com.capgemini.forestrymanagementsystem.service.AdminService;
import com.capgemini.forestrymanagementsystem.service.ClientService;
import com.capgemini.forestrymanagementsystem.service.ContractServices;
import com.capgemini.forestrymanagementsystem.service.ContractorDetailService;
import com.capgemini.forestrymanagementsystem.service.HaulierService;
import com.capgemini.forestrymanagementsystem.service.ProductService;
import com.capgemini.forestrymanagementsystem.service.RequestService;

public class Factory {
   public static IAdminService objectService() {
	   IAdminService service=(IAdminService) new AdminService();
	   return service;
   }
   public static IAdminDao objectDao() {
	   IAdminDao dao=new AdminDao();
	   return dao;
   }
   public static IContractorDetailDao getContractorDAoObject() {
	   IContractorDetailDao dao=(IContractorDetailDao) new ContractorDetailDao();
	   return dao;
   }
   public static IContractorDetailService getContractorServiceDetail() {
	   IContractorDetailService service= (IContractorDetailService)new ContractorDetailService();
	   
	   return  service;
   }
   public static IClientDao objectClientDao() {
	   IClientDao dao=(IClientDao) new ClientDao();
	   return dao;
   }
   public static  IClientService objectClientService() {
	   IClientService service=(IClientService) new ClientService();
	   return service;
   }
   public static IProductDao objectProductDao() {
	   IProductDao dao=(IProductDao) new ProductDao();
	   return dao;
   }
   public static IProductService objectProductService() {
	   IProductService service=new ProductService();
	   return service;
   }
   
  
   public static IRequestService objectRequestService() {
	   IRequestService service=new RequestService();
	   return service;}
	public static IRequestDao objectRequestDao() {
		IRequestDao dao=(IRequestDao) new RequsetDao();
		return dao;
	}
	public static IContractorDao objectContractDao() {
		IContractorDao dao=(IContractorDao) new ContractDao();
		return dao;
	}
	public static IContractServices objectContractService() {
		IContractServices services=new ContractServices();
		return services;
	}
	public static IHaulierDao objectHaulierDao() {
		IHaulierDao dao=(IHaulierDao) new HaulierDao();
		return dao;
	}
	public static IHauliersService objectHaulierService() {
		IHauliersService service=new HaulierService();
		return service;	
	}
	
	
	
	
   }
   

