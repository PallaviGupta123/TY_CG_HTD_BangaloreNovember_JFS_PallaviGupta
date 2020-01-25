package com.capgemini.forestrymanagementsystem.service;

import java.util.List;

import com.capgemini.forestrymanagementsystem.abstraction.IRequestDao;
import com.capgemini.forestrymanagementsystem.abstraction.IRequestService;
import com.capgemini.forestrymanagementsystem.bean.Request;
import com.capgemini.forestrymanagementsystem.factory.Factory;


public class RequestService implements IRequestService{
   IRequestDao dao=Factory.objectRequestDao();

public boolean createRequest(Request request) {
	return dao.createRequest(request);
}

public List<Request> getAllRequest(int custId) {
	return dao.getAllRequest(custId);
}

public boolean cancelOrder(int requestId) {
	return dao.cancelOrder(requestId);
}
	

	
	

}
