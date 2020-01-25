package com.capgemini.forestrymanagementsystem.exception;

public class SystemUnavailableException extends RuntimeException{
	String msg;
	public SystemUnavailableException(String msg)
	{
		super(msg);
	}

}
