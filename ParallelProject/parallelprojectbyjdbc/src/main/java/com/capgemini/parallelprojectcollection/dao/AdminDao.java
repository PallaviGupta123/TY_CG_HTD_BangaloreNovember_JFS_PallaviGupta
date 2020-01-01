package com.capgemini.parallelprojectcollection.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capgemini.parallelprojectbyjdbc.connection.DbConnector;
import com.capgemini.parallelprojectcollection.abstraction.IAdminDao;
import com.capgemini.parallelprojectcollection.bean.Admin;

public class AdminDao implements IAdminDao{
	@Override
	public  Admin adminLogin(Admin admin) {
		String password = admin.getPassword();
		Admin userAdmin=new Admin();
		try {
			Connection conn=DbConnector.getConnection();
			String query="select * from forestry_admin where userId ='"+admin.getUserid()+"'";
			System.out.println(query);
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				//rs.getString(2);
				userAdmin.setId(rs.getInt(1));
				userAdmin.setGender(rs.getString(5));
				userAdmin.setUserid(rs.getString(4));
				userAdmin.setName(rs.getString(2));
				userAdmin.setPassword(rs.getString(3));

			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(userAdmin.getPassword().equals(password))	
		{
			return userAdmin;
		}
		else
		{
			return null;	
		}

	}

}
