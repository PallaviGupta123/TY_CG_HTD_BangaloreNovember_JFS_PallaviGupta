package com.capgemini.parallelprojecthibernate.service;

import java.util.List;

import com.capgemini.parallelprojecthibernate.abstraction.IClientDao;
import com.capgemini.parallelprojecthibernate.abstraction.IClientService;
import com.capgemini.parallelprojecthibernate.abstraction.IContractDao;
import com.capgemini.parallelprojecthibernate.bean.Client;
import com.capgemini.parallelprojecthibernate.factory.Factory;

public class ClientService implements IClientService{
	IClientDao dao=Factory.objectClientDao()
			;
	@Override
	public Client clientLogin(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addCustomer(Client client) {
		return dao.addCustomer(client);
	}

	@Override
	public List<Client> getAllCustomer() {
		return dao.getAllCustomer();
	}

	@Override
	public Client getCustomerbyID(int custId) {
		return dao.getCustomerbyID(custId);
	}

	@Override
	public boolean deleteCustomer(int id) {
		return dao.deleteCustomer(id);
	}

	@Override
	public boolean updateCustomer(int custID,Client client) {
		return dao.updateCustomer(custID, client);
	}

}
