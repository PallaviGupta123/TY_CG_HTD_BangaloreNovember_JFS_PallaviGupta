package com.capgemini.forestrymanagementsystem.bean;

public class OrderDetail {
	private int orderId;
	private int requestId;
	private int productID;
	private int haulierId;
	private int customerId;
	private String delievery_Date;
	public String getDelievery_Date() {
		return delievery_Date;
	}
	public void setDelievery_Date(String delievery_Date) {
		this.delievery_Date = delievery_Date;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getHaulierId() {
		return haulierId;
	}
	public void setHaulierId(int haulierId) {
		this.haulierId = haulierId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	

}
