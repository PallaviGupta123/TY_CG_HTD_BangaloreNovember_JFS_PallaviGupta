package com.capgemini.forestrymanagementsystem.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import com.capgemini.forestrymanagementsystem.abstraction.IContractorDetailDao;
import com.capgemini.forestrymanagementsystem.bean.Admin;
import com.capgemini.forestrymanagementsystem.bean.ContractorDetail;
import com.capgemini.forestrymanagementsystem.connector.DbConnector;
import com.capgemini.forestrymanagementsystem.exception.SystemUnavailableException;

public class ContractorDetailDao implements IContractorDetailDao{

	@Override
	public ContractorDetail contractLogin(ContractorDetail contract) {
		String password =null;		
		ContractorDetail contractorDetail=new ContractorDetail();
		
		try 
		{
			java.sql.Connection conn=DbConnector.getConnection();
			String query="select * from contractor where userId ='"+contract.getUserId()+"'";			
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) 
			{
				contractorDetail.setName(rs.getString(5));
				contractorDetail.setId(rs.getInt(1));
				password=rs.getString(4);
			}
			
			if(contract.getPassword().equals(password))	
			{
				return contractorDetail;
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

}
