package com.capgemini.forestrymanagementsystem.service;

import com.capgemini.forestrymanagementsystem.abstraction.IContractServices;
import com.capgemini.forestrymanagementsystem.abstraction.IContractorDao;
import com.capgemini.forestrymanagementsystem.bean.Contract;
import com.capgemini.forestrymanagementsystem.factory.Factory;

public class ContractServices implements IContractServices{
     IContractorDao dao=Factory.objectContractDao();

	public boolean delieverOrder(Contract contract) {
		return dao.delieverOrder(contract);
	}

	public boolean rejectOrder(int contractId) {
		return dao.rejectOrder(contractId);
	}

	public boolean updateOrder(int contractId, Contract contract) {
		return dao.updateOrder(contractId, contract);
	}

	@Override
	public Contract contractLogin(Contract contract) {
		return dao.contractLogin(contract);
	}
	
	

}
 