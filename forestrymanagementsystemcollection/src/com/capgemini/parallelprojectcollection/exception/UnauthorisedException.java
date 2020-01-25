package com.capgemini.parallelprojectcollection.exception;

public class UnauthorisedException extends RuntimeException{
	String mesg;
	public UnauthorisedException(String msg) {
		super(msg);
	}
	
}
