package com.capgemini.parallelprojecthibernate.service;

import java.util.List;

import com.capgemini.parallelprojecthibernate.abstraction.IContractService;
import com.capgemini.parallelprojecthibernate.bean.Contract;

public class ContractService implements IContractService{

	@Override
	public boolean acceptRequest(Contract contract) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rejectRequest(int orderId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delieverProduct(Contract contract) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contract> getAllRequest() {
		// TODO Auto-generated method stub
		return null;
	}

}
