package com.capgemini.forestrymanagementsystem.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.forestrymanagementsystem.abstraction.IRequestDao;
import com.capgemini.forestrymanagementsystem.bean.Client;
import com.capgemini.forestrymanagementsystem.bean.Request;
import com.capgemini.forestrymanagementsystem.connector.DbConnector;

public class RequsetDao implements IRequestDao{
	Properties prop;
	public  RequsetDao() {
		try {
			FileReader reader=new FileReader("admin.properties");
			prop=new Properties();
			prop.load(reader);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}


	@Override
	public List<Request> getAllRequest(int custId) {
		List<Request> l1=new ArrayList<Request>();
		String query="";
		if(custId==0) {
		query="getAllOrderByCustomerID";	
		}
		else
		{
			query="getAllOrder";
		}
		try(Connection conn=DbConnector.getConnection();
				Statement stmt=conn.createStatement();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty(query));
				)
		{
			if(custId!=0) {
			pstmt.setInt(1, custId);
			}
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				Request request=new Request();
				request.setRequestId(rs.getInt(1));
				request.setCustomerId(rs.getInt(3));
				request.setProductId(rs.getInt(2));
				l1.add(request);
			}
			return l1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public boolean createRequest(Request request) {
		try(Connection conn=DbConnector.getConnection();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("placeOrderCustomer"));){


			pstmt.setInt(1, request.getProductId());
			pstmt.setInt(2, request.getCustomerId());
			pstmt.setInt(3,request.getQuantity());
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
			else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}


		return false;
	}
	@Override
	public boolean cancelOrder(int id) {
		try(Connection conn=DbConnector.getConnection();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("cancelOrder"));)
		{
			pstmt.setInt(1, id);
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}








}
