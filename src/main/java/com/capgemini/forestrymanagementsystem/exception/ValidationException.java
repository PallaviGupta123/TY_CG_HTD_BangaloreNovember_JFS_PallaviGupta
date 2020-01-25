package com.capgemini.forestrymanagementsystem.exception;

public class ValidationException extends RuntimeException{
	String msg;
	public ValidationException(String msg) {
		super(msg);
	}
	

}

