package com.capgemini.parallelprojectcollection.bean;

public class Request {
	private int requestId;

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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
private int productId;
private int stock;
private int customerId;

@Override
public String toString() {
	return "Request [requestId=" + requestId + ", productId=" + productId + ", stock=" + stock + ", customerId="
			+ customerId + "]";
}

}
