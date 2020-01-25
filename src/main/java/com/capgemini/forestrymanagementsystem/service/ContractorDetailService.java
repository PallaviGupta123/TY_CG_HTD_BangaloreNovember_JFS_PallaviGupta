package com.capgemini.forestrymanagementsystem.service;

import com.capgemini.forestrymanagementsystem.abstraction.IContractServices;
import com.capgemini.forestrymanagementsystem.abstraction.IContractorDetailDao;
import com.capgemini.forestrymanagementsystem.abstraction.IContractorDetailService;
import com.capgemini.forestrymanagementsystem.bean.Contract;
import com.capgemini.forestrymanagementsystem.bean.ContractorDetail;
import com.capgemini.forestrymanagementsystem.factory.Factory;

public class ContractorDetailService implements IContractorDetailService{
	IContractorDetailDao dao=Factory.getContractorDAoObject();

	@Override
	public ContractorDetail contractLogin(ContractorDetail contract) {
		return dao.contractLogin(contract);
	}

}
