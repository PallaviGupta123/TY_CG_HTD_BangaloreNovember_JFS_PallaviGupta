package com.capgemini.parallelprojectcollection.factory;

import com.capgemini.parallelprojectcollection.abstraction.IAdminDao;
import com.capgemini.parallelprojectcollection.abstraction.IAdminService;
import com.capgemini.parallelprojectcollection.abstraction.IClientDao;
import com.capgemini.parallelprojectcollection.abstraction.IClientService;
import com.capgemini.parallelprojectcollection.abstraction.IContractServices;
import com.capgemini.parallelprojectcollection.abstraction.IContractorDao;
import com.capgemini.parallelprojectcollection.abstraction.IHaulierDao;
import com.capgemini.parallelprojectcollection.abstraction.IHauliersService;
import com.capgemini.parallelprojectcollection.abstraction.ILandDao;
import com.capgemini.parallelprojectcollection.abstraction.ILandService;
import com.capgemini.parallelprojectcollection.abstraction.IProductDao;
import com.capgemini.parallelprojectcollection.abstraction.IProductService;
import com.capgemini.parallelprojectcollection.abstraction.IRequestDao;
import com.capgemini.parallelprojectcollection.abstraction.IRequestService;
import com.capgemini.parallelprojectcollection.abstraction.IStockDao;
import com.capgemini.parallelprojectcollection.abstraction.IStockService;
import com.capgemini.parallelprojectcollection.dao.AdminDao;
import com.capgemini.parallelprojectcollection.dao.ClientDao;
import com.capgemini.parallelprojectcollection.dao.ContractDao;
import com.capgemini.parallelprojectcollection.dao.HaulierDao;
import com.capgemini.parallelprojectcollection.dao.LandDao;
import com.capgemini.parallelprojectcollection.dao.ProductDao;
import com.capgemini.parallelprojectcollection.dao.RequsetDao;
import com.capgemini.parallelprojectcollection.dao.StockDao;
import com.capgemini.parallelprojectcollection.services.AdminService;
import com.capgemini.parallelprojectcollection.services.ClientService;
import com.capgemini.parallelprojectcollection.services.ContractServices;
import com.capgemini.parallelprojectcollection.services.HaulierService;
import com.capgemini.parallelprojectcollection.services.LandService;
import com.capgemini.parallelprojectcollection.services.ProductService;
import com.capgemini.parallelprojectcollection.services.RequestService;
import com.capgemini.parallelprojectcollection.services.StockService;

public class Factory {
   public static IAdminService objectService() {
	   IAdminService service=(IAdminService) new AdminService();
	   return service;
   }
   public static IAdminDao objectDao() {
	   IAdminDao dao=new AdminDao();
	   return dao;
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
   public static IStockService objectStockService() {
	   IStockService service=(IStockService) new StockService();
	   return service;
   }
   public static IStockDao objectStockDao() {
	  IStockDao dao=(IStockDao) new StockDao();
	  return dao;
   }
   public static IRequestService objectRequestService() {
	   IRequestService service=new RequestService();
	   return service;}
	public static IRequestDao objectRequestDao() {
		IRequestDao dao=(IRequestDao) new RequsetDao();
		return dao;
	}
	public static IContractorDao objectContractDao() {
		IContractorDao dao=new ContractDao();
		return dao;
	}
	public static IContractServices objectContractService() {
		IContractServices services=new ContractServices();
		return services;
	}
	public static IHaulierDao objectHaulierDao() {
		IHaulierDao dao=new HaulierDao();
		return dao;
	}
	public static IHauliersService objectHaulierService() {
		IHauliersService service=new HaulierService();
		return service;	
	}
	public static ILandDao objectLandDao() {
		ILandDao dao=new LandDao();
		return dao;
	}
	public static ILandService objectLandService() {
		ILandService service=new LandService();
		return service;
	}
	
	
	
	
	
   }
   

