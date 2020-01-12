package com.capgemini.parallelprojecthibernate.abstraction;

import com.capgemini.parallelprojecthibernate.bean.Admin;

public interface IAdminDao {
	public Admin adminLogin(String username, String password);


}
