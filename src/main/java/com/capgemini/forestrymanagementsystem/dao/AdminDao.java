package com.capgemini.forestrymanagementsystem.dao;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.capgemini.forestrymanagementsystem.abstraction.IAdminDao;
import com.capgemini.forestrymanagementsystem.bean.Admin;
import com.capgemini.forestrymanagementsystem.bean.Contract;
import com.capgemini.forestrymanagementsystem.connector.DbConnector;
import com.capgemini.forestrymanagementsystem.exception.SystemUnavailableException;
import com.mysql.jdbc.Connection;

public class AdminDao implements IAdminDao{

	public  Admin adminLogin(Admin admin) {
		String password =null;		
		Admin userAdmin=new Admin();
		
		try 
		{
			java.sql.Connection conn=DbConnector.getConnection();
			String query="select * from Admin where name ='"+admin.getUserid()+"'";			
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) 
			{
				userAdmin.setName(rs.getString(2));
				password=rs.getString(3);
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
		catch(Exception e)
		{
			// TODO Implement Log
			throw new SystemUnavailableException("System is not available");
		}

	}

	public boolean addContract(Contract contract) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteContract(int contractId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean editContract(int contractId) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Contract> getAllContract() {
		// TODO Auto-generated method stub
		return null;
	}

}
