package com.capgemini.parallelprojecthibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order-details")
public class Contract {
	@Id
	@Column
	private int contractId;
	public int getContractId() {
		return contractId;
	}
	public void setContractId(int contractId) {
		this.contractId = contractId;
	}
	@Column
	
	private int orderId;
	@Column
	private int requestId;
	@Column
	private double amount;
	@Column
	private int transaportid;
	@Column
	private int isDeleted;
	@Column
	private String delivery_date;
	public String getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getTransaportid() {
		return transaportid;
	}
	@Override
	public String toString() {
		return "Contract [orderId=" + orderId + ", requestId=" + requestId + ", amount=" + amount + ", transaportid="
				+ transaportid + ", isDeleted=" + isDeleted + ", delivery_date=" + delivery_date + "]";
	}
	public void setTransaportid(int transaportid) {
		this.transaportid = transaportid;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

}
