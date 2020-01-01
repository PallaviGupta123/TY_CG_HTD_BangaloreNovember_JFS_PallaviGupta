package com.capgemini.parallelprojectcollection.services;

import com.capgemini.parallelprojectcollection.abstraction.IContractServices;
import com.capgemini.parallelprojectcollection.abstraction.IContractorDao;
import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.bean.Request;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class ContractServices implements IContractServices{
     IContractorDao dao=Factory.objectContractDao();
	@Override
	public boolean acceptRequest(Contract contract) {
		return dao.acceptRequest(contract);
	}

	@Override
	public boolean rejectRequest(int customerID) {
		return dao.rejectRequest(customerID);
	}

	@Override
	public boolean delieverProduct(Contract contract) {
		return dao.delieverProduct(contract);
	}

}
 