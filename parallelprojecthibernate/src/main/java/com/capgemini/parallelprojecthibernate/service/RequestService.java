package com.capgemini.parallelprojecthibernate.service;

import java.util.List;

import com.capgemini.parallelprojecthibernate.abstraction.IRequestService;
import com.capgemini.parallelprojecthibernate.bean.Client;
import com.capgemini.parallelprojecthibernate.bean.Request;

public class RequestService implements IRequestService {

	@Override
	public boolean createRequest(Request request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Request> getAllRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelOrder(int requestId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editProfile(String customerId, Client client) {
		// TODO Auto-generated method stub
		return false;
	}

}
