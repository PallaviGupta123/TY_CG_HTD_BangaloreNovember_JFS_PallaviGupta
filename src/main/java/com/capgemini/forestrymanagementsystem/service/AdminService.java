package com.capgemini.forestrymanagementsystem.service;

import java.util.List;

import com.capgemini.forestrymanagementsystem.abstraction.IAdminDao;
import com.capgemini.forestrymanagementsystem.abstraction.IAdminService;
import com.capgemini.forestrymanagementsystem.bean.Admin;
import com.capgemini.forestrymanagementsystem.bean.Contract;
import com.capgemini.forestrymanagementsystem.factory.Factory;

public class AdminService implements IAdminService {
	IAdminDao dao=Factory.objectDao();

	public Admin adminLogin(Admin admin) {
		try
		{
			return dao.adminLogin(admin);
		}
		catch( Exception ex)
		{	
			throw ex;
		}

	}







}
