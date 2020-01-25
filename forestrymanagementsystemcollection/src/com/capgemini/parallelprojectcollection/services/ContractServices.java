package com.capgemini.parallelprojectcollection.services;

import com.capgemini.parallelprojectcollection.abstraction.IContractServices;
import com.capgemini.parallelprojectcollection.abstraction.IContractorDao;
import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.bean.Request;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class ContractServices implements IContractServices{
     IContractorDao dao=Factory.objectContractDao();
	
	@Override
	public boolean delieverOrder(Contract contract) {
		return dao.delieverOrder(contract);
	}





	@Override
	public boolean rejectOrder(int contractId) {
		return dao.rejectOrder(contractId);
	}





	@Override
	public boolean updateOrder(int contractId, Contract contract) {
		return dao.updateOrder(contractId, contract);
	}

}
 