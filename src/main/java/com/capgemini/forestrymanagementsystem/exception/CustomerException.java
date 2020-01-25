package com.capgemini.forestrymanagementsystem.exception;

public class CustomerException extends RuntimeException{
	String msg;
	public CustomerException(String msg) {
		super(msg);
	}

}
