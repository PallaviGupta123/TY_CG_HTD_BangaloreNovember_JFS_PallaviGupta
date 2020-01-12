package com.capgemini.parallelprojecthibernate.factory;

import com.capgemini.parallelprojecthibernate.abstraction.IAdminDao;
import com.capgemini.parallelprojecthibernate.abstraction.IAdminService;
import com.capgemini.parallelprojecthibernate.abstraction.IClientDao;
import com.capgemini.parallelprojecthibernate.abstraction.IClientService;
import com.capgemini.parallelprojecthibernate.abstraction.IContractDao;
import com.capgemini.parallelprojecthibernate.abstraction.IContractService;
import com.capgemini.parallelprojecthibernate.abstraction.IHaulierDao;
import com.capgemini.parallelprojecthibernate.abstraction.IHaulierService;
import com.capgemini.parallelprojecthibernate.abstraction.IProductDao;
import com.capgemini.parallelprojecthibernate.abstraction.IProductService;
import com.capgemini.parallelprojecthibernate.abstraction.IRequestDao;
import com.capgemini.parallelprojecthibernate.abstraction.IRequestService;
import com.capgemini.parallelprojecthibernate.dao.AdminDao;
import com.capgemini.parallelprojecthibernate.dao.ClientDao;
import com.capgemini.parallelprojecthibernate.dao.ContractDao;
import com.capgemini.parallelprojecthibernate.dao.HaulierDao;
import com.capgemini.parallelprojecthibernate.dao.ProductDao;
import com.capgemini.parallelprojecthibernate.dao.RequestDao;
import com.capgemini.parallelprojecthibernate.service.AdminService;
import com.capgemini.parallelprojecthibernate.service.ClientService;
import com.capgemini.parallelprojecthibernate.service.ContractService;
import com.capgemini.parallelprojecthibernate.service.HaulierService;
import com.capgemini.parallelprojecthibernate.service.ProductService;
import com.capgemini.parallelprojecthibernate.service.RequestService;

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
	  
	   public static IRequestService objectRequestService() {
		   IRequestService service=new RequestService();
		   return service;}
		public static IRequestDao objectRequestDao() {
			IRequestDao dao= new RequestDao();
			return dao;
		}
		public static IContractDao objectContractDao() {
			IContractDao dao=new ContractDao();
			return dao;
		}
		public static IContractService objectContractService() {
			IContractService services=new ContractService();
			return services;
		}
		public static IHaulierDao objectHAulierDao() {
			IHaulierDao dao=new HaulierDao();
			return  dao;
		}
		public static IHaulierService objectHaulierService(){
			IHaulierService service=new HaulierService();
			return service;
		}

}
