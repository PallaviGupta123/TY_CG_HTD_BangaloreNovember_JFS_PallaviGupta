package com.capgemini.parallelprojectcollection.dao;

import java.util.List;
import java.util.Set;

import com.capgemini.parallelprojectcollection.abstraction.IClientDao;
import com.capgemini.parallelprojectcollection.bean.Admin;
import com.capgemini.parallelprojectcollection.bean.Client;

public class ClientDao implements IClientDao{
	Client staticClient=new Client();

	@Override
	public Client clientLogin(Client client) {
		
			if(client.getCustId().equals(staticClient.getCustId()) && client.getPassword().equals(staticClient.getPassword()))
				
			{
				return staticClient;
			}
			else
			{
			return null;	
			}
			
			}
	

	@Override
	public boolean addCustomer(Client client) {
		int count= StaticData.getClient().size();
		StaticData.addClient(client);
		int countAfter=StaticData.getClient().size();
		if(countAfter>count) {
			return true;
		}
		
		 return false;
	}

	@Override
	public Set<Client> getAllCustomer() {
 Set<Client> l1=StaticData.getClient();
  return l1;
	}


	@Override
	public Client getCustomerbyID(int custId) {
		Client result=null;
			for (Client client : StaticData.getClient()) {
				if(client.getId()==custId)
				{
					result= client;
					break;
				}
			}
			return result;
		
	}


}
