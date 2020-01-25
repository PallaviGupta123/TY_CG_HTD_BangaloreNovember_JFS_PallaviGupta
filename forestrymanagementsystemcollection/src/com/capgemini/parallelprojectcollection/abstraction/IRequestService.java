package com.capgemini.parallelprojectcollection.abstraction;

import java.util.List;

import com.capgemini.parallelprojectcollection.bean.Product;
import com.capgemini.parallelprojectcollection.bean.Request;
//import com.capgemini.parallelprojectcollection.controller.Request;

public interface IRequestService {
	public boolean createRequest(Request request);
	public List <Request>getAllRequest();
	public boolean cancelOrder(int requestId);
}