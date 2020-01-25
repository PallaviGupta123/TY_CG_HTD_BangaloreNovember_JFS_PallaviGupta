package com.capgemini.parallelprojectcollection.exception;

public class SystemUnavailableException extends RuntimeException{
	String msg;
	public SystemUnavailableException(String msg)
	{
		super(msg);
	}

}
