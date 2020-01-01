package com.capgemini.parallelprojectcollection.bean;

public class Contract {
	private int productId;
	private int customerId;
	private int transportId;
	private int requestID;
	public int getRequestID() {
		return requestID;
	}
	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}
	private String delievery_date;
	private int quantity;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getTransportId() {
		return transportId;
	}
	public void setTransportId(int transportId) {
		this.transportId = transportId;
	}
	public String getDelievery_date() {
		return delievery_date;
	}
	public void setDelievery_date(String delievery_date) {
		this.delievery_date = delievery_date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Contract [productId=" + productId + ", customerId=" + customerId + ", transportId=" + transportId
				+ ", delievery_date=" + delievery_date + ", quantity=" + quantity + "]";
	}
	
}
