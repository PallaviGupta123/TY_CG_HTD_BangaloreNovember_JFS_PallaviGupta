package com.capgemini.parallelprojecthibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="request_details")
public class Request {
	@Column
	private int productId;
	@Column
	private String productType;
	@Column
	private String customerId;
	@Column
	private String expectedDelieveryDate;
	@Id
	@Column
	private int requestId;
 private int quantity;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getExpectedDelieveryDate() {
	return expectedDelieveryDate;
}
@Override
public String toString() {
	return "Request [productId=" + productId + ", productType=" + productType + ", customerId=" + customerId
			+ ", expectedDelieveryDate=" + expectedDelieveryDate + ", requestId=" + requestId + ", quantity=" + quantity
			+ "]";
}
public void setExpectedDelieveryDate(String expectedDelieveryDate) {
	this.expectedDelieveryDate = expectedDelieveryDate;
}
public int getRequestId() {
	return requestId;
}
public void setRequestId(int requestId) {
	this.requestId = requestId;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

}
