package com.capgemini.parallelprojectcollection.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.capgemini.parallelprojectcollection.abstraction.IClientDao;
import com.capgemini.parallelprojectcollection.bean.Admin;
import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.exception.CustomerException;

public class ClientDao implements IClientDao{
	Client staticClient=new Client();
	List<Client> clientList=new ArrayList<Client>();
	Client clientBean=new Client();

	@Override
	public Client clientLogin(Client client) {
		
			if(client.getCustId()==(staticClient.getCustId()) && client.getPassword().equals(staticClient.getPassword()))
				
			{
				return staticClient;
			}
			else
			{
			
			}
			return null;
			
			}
	

	@Override
	public boolean addCustomer(Client client) {
		int count= StaticData.getClient().size();
		StaticData.addClient(client);
		int countAfter=StaticData.getClient().size();
		if(countAfter>count) {
			return true;
		}
		
		throw new CustomerException("Customer doesnot added");
	}

	@Override
	public List<Client> getAllCustomer() {
 List<Client> l1=StaticData.getClient();
 
  return l1;
	}


	@Override
	public Client getCustomerbyID(int custId) {
		Client result=null;
			for (Client client : StaticData.getClient()) {
				if(client.getCustId()==custId)
				{
					result= client;
					break;
				}
			}
			return null;
	}
	@Override
	public boolean deleteCustomer(int custId) {
	StaticData.deleteCustomer(custId);
	return true;
	}


	@Override
	public boolean updateCustomer(int custId, Client client) {
		return true;
		
	}


	@Override
	public boolean isCustomerIdExist(int custId) {
		boolean result=false;
		for (Client client : StaticData.getClient()) {
			if(client.getCustId()==custId)
			{
				result= true;
				break;
			}
		}
		return result;
	}

     
}
