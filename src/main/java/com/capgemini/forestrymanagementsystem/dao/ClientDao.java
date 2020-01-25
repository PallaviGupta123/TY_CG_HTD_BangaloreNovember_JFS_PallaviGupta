package com.capgemini.forestrymanagementsystem.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.forestrymanagementsystem.abstraction.IClientDao;
import com.capgemini.forestrymanagementsystem.bean.Admin;
import com.capgemini.forestrymanagementsystem.bean.Client;
import com.capgemini.forestrymanagementsystem.connector.DbConnector;
import com.capgemini.forestrymanagementsystem.exception.CustomerException;
import com.capgemini.forestrymanagementsystem.exception.SystemUnavailableException;


public class ClientDao implements IClientDao{
	Client staticClient=new Client();

	@Override
	public Client clientLogin(Client client) {
		String password =null;		
		Client clientUser=new Client();
		
		try 
		{
			java.sql.Connection conn=DbConnector.getConnection();
			String query="select * from customer where customerName ='"+client.getCustName()+"'";			
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) 
			{
				clientUser.setCustName(rs.getString(2));
				clientUser.setCustId(rs.getInt(1));
				password=rs.getString(8);
			}
			
			if(client.getPassword().equals(password))	
			{
				return clientUser;
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
	
	FileReader reader;
	Properties prop;
	Client client;
	public ClientDao() {
		try {
			reader =new FileReader("admin.properties");
			prop=new Properties();
          	prop.load(reader);
		} catch (Exception  e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addCustomer(Client client) {
		try(Connection conn=DbConnector.getConnection();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insertCustomer"));){
		
			pstmt.setString(1,client.getCustName());
			pstmt.setString(2,client.getStreetAdd1());
			pstmt.setString(3,client.getStreetAdd2());
			pstmt.setString(4,client.getTown());
			pstmt.setString(5, client.getZipCode());
			pstmt.setString(6,client.getEmail());
			pstmt.setString(7, client.getPassword());
			pstmt.setInt(8, client.getMobileNo());
			
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}else {
				return false;
			}
		} 
		catch (SQLException e1) 
		{
			e1.printStackTrace();//TODO Implement Log
			throw new SystemUnavailableException("System is not availableat this time. Please try after some time or contact to administrator.");
		}
		catch(Exception ex)
		{
			//TODO Implement Log
			throw ex;
		}

	}

	@Override
	public List<Client> getAllCustomer() {
		List<Client> list=new ArrayList<Client>();
		try(Connection conn=DbConnector.getConnection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("getAllCustomer"));)
		{
			while(rs.next()) {
				client=new Client();
				client.setCustId(rs.getInt(1));
			    client.setCustName(rs.getString(2));	
			    client.setStreetAdd1(rs.getString(3));
			    client.setStreetAdd2(rs.getString(4));
			    client.setTown(rs.getString(5));
			    client.setZipCode(rs.getString(6));
			    client.setEmail(rs.getString(7));
			    client.setPassword(rs.getString(8));
			    client.setMobileNo(rs.getInt(9));
			   
			    list.add(client);
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getCustomerbyID(int custId) {
	

		
		try(Connection conn=DbConnector.getConnection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("getAllCustomer"));)
					
		{
			while(rs.next()) {
				client=new Client();
				client.setCustId(rs.getInt(1));
			    client.setCustName(rs.getString(2));	
			    client.setStreetAdd1(rs.getString(3));
			    client.setStreetAdd2(rs.getString(4));
			    client.setTown(rs.getString(5));
			    client.setZipCode(rs.getString(6));
			    client.setEmail(rs.getString(7));
			    client.setPassword(rs.getString(8));
			    client.setMobileNo(rs.getInt(9));
			   
			    	
		}
		return  client;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteCustomer(int custID) {
		try(Connection conn=DbConnector.getConnection();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteCustomer"));)
		{
			pstmt.setInt(1, custID);
			int count=pstmt.executeUpdate();
		if(count>0) {
			return true;
		}
		}catch(CustomerException e) {
			throw new CustomerException("ID is not exist");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return false;

	}

	@Override
	public boolean updateCustomer(int custId, Client client) {
		try(Connection conn=DbConnector.getConnection();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("updateCustomer"));)
		{
		//user is local variable 
			pstmt.setString(1, client.getCustName());
			pstmt.setString(2, client.getStreetAdd1());
			pstmt.setString(3, client.getStreetAdd2());
 			pstmt.setString(4, client.getTown());
			pstmt.setString(5, client.getZipCode());
			pstmt.setString(6, client.getEmail());
			
			int count1 = pstmt.executeUpdate();
			
			
			int isUpdated = pstmt.executeUpdate();
			if(isUpdated>0) {
				return true;
			}

		}catch(Exception e) {
			throw new CustomerException("Id osenot exist");
		}
		return false;
	}

	@Override
	public boolean isCustomerIdExist(int custId) {
		boolean result=false;
		for (Client client : StaticData.getClient()) {
			if(client.getCustId()==custId)
			{
				result= true;
				break;
			}
		}
		return result;
	}


}
