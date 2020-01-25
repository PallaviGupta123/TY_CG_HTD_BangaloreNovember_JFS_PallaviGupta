package com.capgemini.parallelprojectcollection.services;

import java.util.List;

import com.capgemini.parallelprojectcollection.abstraction.IAdminDao;
import com.capgemini.parallelprojectcollection.abstraction.IAdminService;
import com.capgemini.parallelprojectcollection.bean.Admin;
import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class AdminService implements IAdminService {
	IAdminDao dao=Factory.objectDao();

	@Override
	public Admin adminLogin(Admin admin) {
		return dao.adminLogin(admin);
	}

	@Override
	public boolean addContract(Contract contract) {
		return dao.addContract(contract);
	}

	@Override
	public boolean deleteContract(int contractId) {
	return dao.deleteContract(contractId);
	}

	@Override
	public boolean editContract(int contractId) {
		return dao.editContract(contractId);
	}

	@Override
	public List<Contract> getAllContract() {
		return  dao.getAllContract();
	}

}
