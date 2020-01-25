package com.capgemini.forestrymanagementsystem.abstraction;

import java.util.List;

import com.capgemini.forestrymanagementsystem.bean.Request;

public interface IRequestService {
	public boolean createRequest(Request request);
	public List <Request>getAllRequest(int custId);
	public boolean cancelOrder(int requestId);
}