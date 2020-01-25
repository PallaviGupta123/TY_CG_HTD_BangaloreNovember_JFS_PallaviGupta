package com.capgemini.parallelprojectcollection.bean;

import java.io.Serializable;

public class Contract implements Serializable{
	private int haulierId;
	private int contractId;
	private int custId;
	private int requestId;

	private String delievryDate;
	private int quantity;
	public int getHaulierId() {
		return haulierId;
	}
	public void setHaulierId(int haulierId) {
		this.haulierId = haulierId;
	}
	public int getContractId() {
		return contractId;
	}
	public void setContractId(int contractId) {
		this.contractId = contractId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
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
				+ requestId + ", delievryDay=" + "" + ", delievryDate=" + delievryDate + ", quantity="
				+ quantity + "]";
	}
	
}
