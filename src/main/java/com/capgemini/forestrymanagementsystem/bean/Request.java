package com.capgemini.forestrymanagementsystem.bean;

public class Request {
	private int requestId;
private String productName;
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
private int productId;
private int quantity;
private int customerId;

@Override
public String toString() {
	return "Request [requestId=" + requestId + ", productId=" + productId + ", stock=" + quantity + ", customerId="
			+ customerId + "]";
}

}
