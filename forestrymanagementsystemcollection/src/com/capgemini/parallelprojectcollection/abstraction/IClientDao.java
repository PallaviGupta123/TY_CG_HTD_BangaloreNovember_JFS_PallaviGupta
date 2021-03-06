package com.capgemini.parallelprojectcollection.abstraction;

import java.util.List;
import java.util.Set;

import com.capgemini.parallelprojectcollection.bean.Client;

public interface IClientDao {
	public Client clientLogin(Client client);
	public boolean addCustomer(Client client);
	public List<Client> getAllCustomer();
	public Client getCustomerbyID(int custId);
	public boolean deleteCustomer(int custID);
	public boolean updateCustomer(int custId,Client client);
	public boolean isCustomerIdExist(int custId);
}
