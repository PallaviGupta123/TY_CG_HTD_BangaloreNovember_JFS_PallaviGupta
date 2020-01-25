package com.capgemini.forestrymanagementsystem.controllers;

import java.sql.ResultSet;
import java.sql.Statement;

import com.capgemini.forestrymanagementsystem.abstraction.IAdminDao;
import com.capgemini.forestrymanagementsystem.bean.Admin;
import com.capgemini.forestrymanagementsystem.connector.DbConnector;
import com.capgemini.forestrymanagementsystem.exception.SystemUnavailableException;

public class AdminDao implements  IAdminDao{

	public Admin adminLogin(Admin admin) {
		String password =null;
		Admin userAdmin=new Admin();
		try {
			java.sql.Connection conn=DbConnector.getConnection();
			String query="select * from Admin where name ='"+admin.getUserid()+"'";
			System.out.println(query);
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				userAdmin.setName(rs.getString(2));
				password=rs.getString(3);
			}
		}
		catch(Exception e)
		{
			throw new SystemUnavailableException("System is not available");
		}
		if(admin.getPassword().equals(password))	
		{
			return userAdmin;
		}
		else
		{
			return null;	
		}
	}

}
