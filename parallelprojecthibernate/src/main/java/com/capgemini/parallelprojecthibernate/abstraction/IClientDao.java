package com.capgemini.parallelprojecthibernate.abstraction;

import java.util.List;

import com.capgemini.parallelprojecthibernate.bean.Client;

public interface IClientDao {
	public Client clientLogin(Client client);
	public boolean addCustomer(Client client);
	public List<Client> getAllCustomer();
	public Client getCustomerbyID(int custId);
	public boolean deleteCustomer(int id);
	public boolean updateCustomer(int custID,Client client);

}
