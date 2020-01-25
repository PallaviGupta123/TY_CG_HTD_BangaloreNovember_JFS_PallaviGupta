package com.capgemini.forestrymanagementsystem.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.util.Properties;

import com.capgemini.forestrymanagementsystem.abstraction.IContractorDao;
import com.capgemini.forestrymanagementsystem.bean.Contract;
import com.capgemini.forestrymanagementsystem.connector.DbConnector;
import com.capgemini.forestrymanagementsystem.exception.CustomerException;

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
	public boolean delieverOrder(Contract contract) {
		try(Connection conn=DbConnector.getConnection();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("delieveOrder"));){
			pstmt.setInt(1,contract.getCustId());
			pstmt.setInt(2,contract.getHaulierId());
			pstmt.setInt(3,contract.getRequestId());
			pstmt.setInt(4,contract.getQuantity());
			pstmt.setString(5, contract.getDelievryDate());
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
	public boolean rejectOrder(int contractId) {
		try(Connection conn=DbConnector.getConnection();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteContractor"));)
		{
			pstmt.setInt(1, contractId);
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
	public boolean updateOrder(int contractId, Contract contract) {
		try(Connection conn=DbConnector.getConnection();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("updateContract"));)
		{
		//user is local variable 
			pstmt.setInt(1, contract.getCustId());
			pstmt.setInt(2, contract.getHaulierId());
			pstmt.setInt(3,contract.getRequestId());
			pstmt.setString(4, contract.getDelievryDate());
				pstmt.setInt(5, contract.getQuantity());
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
	public Contract contractLogin(Contract contract) {
		// TODO Auto-generated method stub
		return null;
	}
   
  }
