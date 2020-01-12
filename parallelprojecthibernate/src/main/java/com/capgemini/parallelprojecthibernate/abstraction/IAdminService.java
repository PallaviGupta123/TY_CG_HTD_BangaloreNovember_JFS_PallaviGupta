package com.capgemini.parallelprojecthibernate.abstraction;

import com.capgemini.parallelprojecthibernate.bean.Admin;

public interface IAdminService {
	public Admin adminLogin(String username,String password);


}
