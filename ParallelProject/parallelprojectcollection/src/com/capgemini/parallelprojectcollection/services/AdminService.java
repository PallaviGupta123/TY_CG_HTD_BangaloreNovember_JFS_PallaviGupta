package com.capgemini.parallelprojectcollection.services;

import com.capgemini.parallelprojectcollection.abstraction.IAdminDao;
import com.capgemini.parallelprojectcollection.abstraction.IAdminService;
import com.capgemini.parallelprojectcollection.bean.Admin;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class AdminService implements IAdminService {
	IAdminDao dao=Factory.objectDao();

	@Override
	public Admin adminLogin(Admin admin) {
		return dao.adminLogin(admin);
	}

}
