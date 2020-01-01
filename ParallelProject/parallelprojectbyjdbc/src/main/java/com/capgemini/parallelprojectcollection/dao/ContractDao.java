package com.capgemini.parallelprojectcollection.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import com.capgemini.parallelprojectbyjdbc.connection.DbConnector;
import com.capgemini.parallelprojectcollection.abstraction.IClientDao;
import com.capgemini.parallelprojectcollection.abstraction.IContractorDao;
import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.bean.Request;

public class ContractDao implements IContractorDao {
   Contract staticContract=new Contract();
   FileReader reader;
   Properties prop;
   Contract contract;
   public ContractDao() {
	   try {
		   reader=new FileReader("admin.properties");
		   prop=new Properties();
		   prop.load(reader);
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   
  @Override
public boolean acceptRequest(Contract contract) {
	try(Connection conn=DbConnector.getConnection();
			java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("acceptRequest"));){
		pstmt.setInt(1, contract.getProductId());
		pstmt.setInt(2,contract.getCustomerId());
		pstmt.setInt(3,contract.getTransportId());
		pstmt.setString(4,contract.getDelievery_date());
		int count=pstmt.executeUpdate();
		if(count>0) {
			return true;
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return false;
}

@Override
public boolean rejectRequest(int customerID) {
       try(Connection conn=DbConnector.getConnection();
    		   java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insert"));){
    	   
    	   pstmt.setInt(1, customerID);
    	   int count=pstmt.executeUpdate();
    	   if(count>0) {
    		   return true;
    	   }
       }catch(Exception e) {
    	   e.printStackTrace();
       }
	return false;
}

@Override
public boolean delieverProduct(Contract contract) {
	// TODO Auto-generated method stub
	return false;
}
  }
