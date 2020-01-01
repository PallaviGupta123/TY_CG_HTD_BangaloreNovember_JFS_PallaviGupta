package com.capgemini.parallelprojectcollection.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import com.capgemini.parallelprojectbyjdbc.connection.DbConnector;
import com.capgemini.parallelprojectcollection.abstraction.IClientDao;
import com.capgemini.parallelprojectcollection.bean.Admin;
import com.capgemini.parallelprojectcollection.bean.Client;

public class ClientDao implements IClientDao{
	Client staticClient=new Client();
	
	@Override
	public Client clientLogin(Client client) {
		
			if(client.getCustId().equals(staticClient.getCustId()) && client.getPassword().equals(staticClient.getPassword()))
				
			{
				return staticClient;
			}
			else
			{
			return null;	
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
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insert"));){
			pstmt.setString(1,client.getCustName());
			pstmt.setString(2,client.getStreetAdd1());
			pstmt.setString(3,client.getStreetAdd2());
			pstmt.setString(4,client.getTown());
			pstmt.setString(5, client.getZipCode());
			pstmt.setString(6,client.getEmail());
			pstmt.setString(7, client.getPassword());
			pstmt.setInt(8, client.getMobileNo());
			pstmt.setInt(9,client.getAdminId());
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Client> getAllCustomer() {
		List<Client> list=new ArrayList<Client>();
		try(Connection conn=DbConnector.getConnection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("getAll"));)
		{
			while(rs.next()) {
				client=new Client();
				client.setId(rs.getInt(1));
			    client.setCustName(rs.getString(2));	
			    client.setStreetAdd1(rs.getString(3));
			    client.setStreetAdd2(rs.getString(4));
			    client.setTown(rs.getString(5));
			    client.setZipCode(rs.getString(6));
			    client.setEmail(rs.getString(7));
			    client.setPassword(rs.getString(8));
			    client.setMobileNo(rs.getInt(9));
			    client.setAdminId(rs.getInt(10));
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
		// TODO Auto-generated method stub
		return null;
	}
	
    

}
