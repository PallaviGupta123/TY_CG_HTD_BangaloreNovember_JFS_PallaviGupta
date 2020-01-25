package com.capgemini.parallelprojectcollection.services;

import java.util.List;
import java.util.Set;

import com.capgemini.parallelprojectcollection.abstraction.IClientDao;
import com.capgemini.parallelprojectcollection.abstraction.IClientService;
import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class ClientService implements IClientService{
      IClientDao dao=Factory.objectClientDao();
	@Override
	public Client clientLogin(Client client) {
		return dao.clientLogin(client);
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
		// TODO Auto-generated method stub
		return dao.getCustomerbyID(custId);
	}
	@Override
	public boolean deleteCustomer(int custId) {
		return dao.deleteCustomer(custId);
	}
	@Override
	public boolean updateCustomer(int custId, Client client) {
		return dao.updateCustomer(custId, client);
	}
	@Override
	public boolean isCustomerIdExist(int custId) {
		return dao.isCustomerIdExist(custId);
	}
	
}
