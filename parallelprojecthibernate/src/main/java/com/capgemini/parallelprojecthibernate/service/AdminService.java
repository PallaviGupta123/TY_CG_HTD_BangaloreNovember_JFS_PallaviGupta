package com.capgemini.parallelprojecthibernate.service;

import com.capgemini.parallelprojecthibernate.abstraction.IAdminDao;
import com.capgemini.parallelprojecthibernate.abstraction.IAdminService;
import com.capgemini.parallelprojecthibernate.bean.Admin;
import com.capgemini.parallelprojecthibernate.factory.Factory;

public class AdminService implements IAdminService {
	IAdminDao dao=Factory.objectDao();

	@Override
	public Admin adminLogin(String username, String password) {
		return dao.adminLogin(username, password);
	}

	

}
