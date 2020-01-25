package com.capgemini.parallelprojectcollection.dao;


import java.util.ArrayList;
import java.util.List;

import com.capgemini.parallelprojectcollection.abstraction.IAdminDao;
import com.capgemini.parallelprojectcollection.bean.Admin;
import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.exception.ContractException;
import com.capgemini.parallelprojectcollection.exception.LoginException;

public class AdminDao implements IAdminDao{
 Admin staticadmin = new  Admin();
 List<Contract> contract=new ArrayList<Contract>();
   
	@Override
	public Admin adminLogin(Admin admin) {
		if(admin.getUserid().equals(staticadmin.getUserid()) && admin.getPassword().equals(staticadmin.getPassword()))
			
		{
			return staticadmin;
		}
		return null;
		
		}

	@Override
	public boolean addContract(Contract contract) {
		int count=StaticData.getAllHaulier().size();
		StaticData.addContract(contract);
		int after=StaticData.getAllContract().size();
		if(after>count) {
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteContract(int contractId) {
		Contract contrcat=null;
		for (Contract contract2 : contract) {
			if(contract2.getContractId()==contractId) 
				return true;	
		}return false;
		
	}

	@Override
	public boolean editContract(int contractId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contract> getAllContract() {
		List<Contract> list1=StaticData.getAllContract();
		if(list1!=null) {
			return list1;
		}
		return null;
		
	}
	
	

}
