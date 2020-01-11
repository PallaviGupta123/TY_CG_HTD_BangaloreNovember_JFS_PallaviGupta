package com.capgemini.retailermainteanancesystemapplication.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailermainteanancesystemapplication.dto.UserResponse;
import com.capgemini.retailermainteanancesystemapplication.exception.ProductException;
import com.capgemini.retailermainteanancesystemapplication.exception.UserException;

@RestControllerAdvice
public class ProductControllerAdvice {
	@ExceptionHandler(ProductException.class)
	public UserResponse handleEmployeeException(UserResponse e) {
		UserResponse responce=new UserResponse();
		responce.setStatusCode(501);
		responce.setMessage("Exception");
		responce.setDescription(e.getMessage());
		return responce;
	}

}
