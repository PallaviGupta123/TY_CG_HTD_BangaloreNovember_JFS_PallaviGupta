package com.capgemini.parallelprojectcollection.dao;

import java.util.List;
import java.util.Set;

import com.capgemini.parallelprojectcollection.abstraction.IClientDao;
import com.capgemini.parallelprojectcollection.abstraction.IContractorDao;
import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.bean.Request;

public class ContractDao implements IContractorDao {
   Contract staticContract=new Contract();
	@Override
	public boolean acceptRequest(Contract contract) {
		if(staticContract!=null) {
			StaticData.acceptRequest(contract);
			return true;
		}
		return false;
	}

	@Override
	public boolean rejectRequest(int requestId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delieverProduct(Contract contract) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
