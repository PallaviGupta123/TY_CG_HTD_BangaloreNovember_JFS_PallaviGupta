package com.capgemini.parallelprojecthibernate.abstraction;

import java.util.List;

import com.capgemini.parallelprojecthibernate.bean.Client;
import com.capgemini.parallelprojecthibernate.bean.Request;

public interface IRequestService {
	public boolean createRequest(Request request);
	public List <Request> getAllRequest();
	public boolean cancelOrder(int requestId);
	public boolean editProfile(String customerId,Client client);
	

}
