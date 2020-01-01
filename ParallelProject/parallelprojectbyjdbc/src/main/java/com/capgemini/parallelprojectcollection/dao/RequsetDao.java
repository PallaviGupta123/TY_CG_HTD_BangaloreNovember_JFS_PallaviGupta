package com.capgemini.parallelprojectcollection.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.util.List;
import java.util.Properties;

import com.capgemini.parallelprojectbyjdbc.connection.DbConnector;
import com.capgemini.parallelprojectcollection.abstraction.IRequestDao;
import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.bean.Product;
import com.capgemini.parallelprojectcollection.bean.Request;

public class RequsetDao implements IRequestDao{

	Request staticRequest =new Request();

	@Override
	public List<Request> getAllRequest() {
		 List<Request> l1=StaticData.viewAllRequest();
		  return l1;
		
	}
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
	public boolean createRequest(Request request) {
		try(Connection conn=DbConnector.getConnection();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("request"));){
			
			pstmt.setInt(1, request.getProductId());
			pstmt.setString(2, request.getProductType());
			pstmt.setString(3, request.getDelieveryDate());
			pstmt.setInt(4, request.getStock());
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
		
		return true;
	}

}
