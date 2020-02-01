package com.capgemini.loanprocessingsystem.dto;

import java.util.List;

public class AuthenticationResponse {
private int statusCode;
private String message;
private String description;
private List<AuthenticationDetails> bean;
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public List<AuthenticationDetails> getBean() {
	return bean;
}
public void setBean(List<AuthenticationDetails> bean) {
	this.bean = bean;
}
	
}//end of class
