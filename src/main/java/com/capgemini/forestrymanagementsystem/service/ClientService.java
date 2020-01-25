package com.capgemini.forestrymanagementsystem.service;

import java.util.List;

import com.capgemini.forestrymanagementsystem.abstraction.IClientDao;
import com.capgemini.forestrymanagementsystem.abstraction.IClientService;
import com.capgemini.forestrymanagementsystem.bean.Client;
import com.capgemini.forestrymanagementsystem.factory.Factory;

public class ClientService implements IClientService{
      IClientDao dao=Factory.objectClientDao();

	public Client clientLogin(Client client) {
		return dao.clientLogin(client);
	}

	public boolean addCustomer(Client client) {
		return dao.addCustomer(client);
	}

	public List<Client> getAllCustomer() {
		return dao.getAllCustomer();
	}

	public Client getCustomerbyID(int custId) {
		return dao.getCustomerbyID(custId);
	}

	public boolean deleteCustomer(int custId) {
		return dao.deleteCustomer(custId);
	}

	public boolean updateCustomer(int custId, Client client) {
		return dao.updateCustomer(custId, client);
	}

	public boolean isCustomerIdExist(int custId) {
		return dao.isCustomerIdExist(custId);
	}
	
	
}
