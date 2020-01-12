package com.capgemini.parallelprojecthibernate.exception;

public class GlobalException extends Exception{
	String str1;
	public GlobalException(String message) {
		str1=message;
		
	}
	@Override
	public String toString() {
		return "GlobalException [str1=" + str1 + "]";
	}
  
}
