package com.capgemini.parallelprojectcollection.services;

import java.util.List;

import com.capgemini.parallelprojectcollection.abstraction.IRequestDao;
import com.capgemini.parallelprojectcollection.abstraction.IRequestService;
import com.capgemini.parallelprojectcollection.bean.Product;
import com.capgemini.parallelprojectcollection.bean.Request;
import com.capgemini.parallelprojectcollection.dao.RequsetDao;

public class RequestService implements IRequestService{
   IRequestDao dao=new RequsetDao();
	

	@Override
	public List<Request> getAllRequest() {
		return dao.getAllRequest();
	}
	@Override
	public boolean createRequest(Request request) {
		return dao.createRequest(request);
	}
	@Override
	public boolean cancelOrder(int id) {
		return dao.cancelOrder(id);
	}
	

}
