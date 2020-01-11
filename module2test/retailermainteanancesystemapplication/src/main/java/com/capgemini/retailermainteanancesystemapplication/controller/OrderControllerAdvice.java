package com.capgemini.retailermainteanancesystemapplication.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailermainteanancesystemapplication.dto.UserResponse;
import com.capgemini.retailermainteanancesystemapplication.exception.OrderException;
@RestControllerAdvice
public class OrderControllerAdvice {
	@ExceptionHandler(OrderException.class)
	public UserResponse handleEmployeeException(UserResponse e) {
		UserResponse responce=new UserResponse();
		responce.setStatusCode(501);
		responce.setMessage("Exception");
		responce.setDescription(e.getMessage());
		return responce;
	}

}
