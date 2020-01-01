package com.capgemini.parallelprojectcollection.dao;

import java.util.List;

import com.capgemini.parallelprojectcollection.abstraction.IRequestDao;
import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.bean.Product;
import com.capgemini.parallelprojectcollection.bean.Request;

public class RequsetDao implements IRequestDao{

	Request staticRequest =new Request();

	@Override
	public List<Request> getAllRequest() {
		 List<Request> l1=StaticData.viewAllRequest();
		  return l1;
		
	}

	@Override
	public boolean createRequest(Request request) {
		int count= StaticData.viewAllRequest().size();
		StaticData.createRequest(request);
		int countAfter=StaticData.viewAllRequest().size();
		if(countAfter>count) {
			return true;
		}
		return false;
	}
	@Override
	public boolean cancelOrder(int id) {
		
		StaticData.cancelOrder(id);
		return true;
	}

}
