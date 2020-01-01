package com.capgemini.parallelprojectcollection.bean;

public class Contract {
	private String haulierId;
	private int contractId;
	private String custId;
	private int requestId;
	private String delievryDay;
	private String delievryDate;
	private int quantity;
	public String getHaulierId() {
		return haulierId;
	}
	public void setHaulierId(String haulierId) {
		this.haulierId = haulierId;
	}
	public int getContractId() {
		return contractId;
	}
	public void setContractId(int contractId) {
		this.contractId = contractId;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getDelievryDay() {
		return delievryDay;
	}
	public void setDelievryDay(String delievryDay) {
		this.delievryDay = delievryDay;
	}
	public String getDelievryDate() {
		return delievryDate;
	}
	public void setDelievryDate(String delievryDate) {
		this.delievryDate = delievryDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Contract [haulierId=" + haulierId + ", contractId=" + contractId + ", custId=" + custId + ", requestId="
				+ requestId + ", delievryDay=" + delievryDay + ", delievryDate=" + delievryDate + ", quantity="
				+ quantity + "]";
	}
	
}
