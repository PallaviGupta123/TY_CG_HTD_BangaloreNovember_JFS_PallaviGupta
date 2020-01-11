package com.capgemini.retailermainteanancesystemapplication.dto;

import java.util.List;

public class UserResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<User> user;
	private List<Product> product;
	private List <Order> order;
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public List<Order> getOrder() {
		return order;
	}
	public void setOrder(List<Order> order) {
		this.order = order;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(User userBean) {
		this.user = (List<User>) userBean;
	}
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
	

}
