package com.cape.moduletestjdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cape.moduletestjdbc.bean.Contact;

public class ContactDaoImpl implements ContactDao
{
	FileReader reader;
	Properties prop;
	Contact user;
   public ContactDaoImpl()
   {
	   try {
		   Class.forName("com.mysql.jdbc.driver");
		   reader=new FileReader("db.properties");
		   prop=new Properties();
		   prop.load(reader); 
		  
	   }catch (Exception e) {
		e.printStackTrace();
	}
	   
   }
	@Override
	public List<Contact> getAllContactList() {
		List<Contact> list=new ArrayList<Contact>();
		//Statement stmt;
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("password"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1")))
		{
			while (rs.next())
			{
			Contact	contact1=new Contact();
				contact1.setName(rs.getString(1));
				contact1.setNumber(rs.getInt(2));
				contact1.setGroup(rs.getString(3));
				list.add(contact1);	
			}
		}
			
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
		return list;
		}
	
	@Override
	public List<Contact> search(String name,Contact contact) {
		List<Contact> list=new ArrayList<Contact>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("password"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("search")))
		{
			while(rs.next()) {
			Contact contact1=new Contact();
			contact1.setName(rs.getString(1));
			list.add(contact1);}	
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		return list;
}

	@Override
	public boolean addContact(Contact contact) {
		PreparedStatement pstmt=null;
	
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt1=conn.prepareStatement(prop.getProperty("insert")))
				
		{
			Contact contact2=new Contact();
			pstmt.setString(1, contact2.getName());
			pstmt.setInt(2, contact2.getNumber());  
			pstmt.setString(3, contact2.getGroup());
			
			
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("Contact added");
			}else {
				System.out.println("Something went wong");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean modifyContact(int number,Contact contact) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt1=conn.prepareStatement(prop.getProperty("update")))
		{	Contact conatct5=new Contact();
		     pstmt1.setInt(1, contact.getNumber());
		     pstmt1.setString(2, contact.getName());
		     pstmt1.setString(3, contact.getGroup());
		     int count=pstmt1.executeUpdate();
		     if(count>0)
		     {
		    	 System.out.println("Contact updated");
		     }else {
		    	 System.out.println("soething went wrong ");
		     }
		     
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return true;
	}
	@Override
	public boolean deleteContact(int number) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt1=conn.prepareStatement(prop.getProperty("delete")))
		{
			pstmt1.setInt(1,number); 
			int count=pstmt1.executeUpdate();
			if(count>0)
			{
				return true;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return false;
	}

}
