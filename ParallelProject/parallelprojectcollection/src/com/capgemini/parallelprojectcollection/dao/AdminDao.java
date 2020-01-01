package com.capgemini.parallelprojectcollection.dao;


import com.capgemini.parallelprojectcollection.abstraction.IAdminDao;
import com.capgemini.parallelprojectcollection.bean.Admin;

public class AdminDao implements IAdminDao{
 Admin staticadmin = new  Admin();
   
	@Override
	public Admin adminLogin(Admin admin) {
		if(admin.getUserid().equals(staticadmin.getUserid()) && admin.getPassword().equals(staticadmin.getPassword()))
			
		{
			return staticadmin;
		}
		else
		{
		return null;	
		}
		
		}
	

}
