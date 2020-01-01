package com.capgemini.parallelprojectcollection.bean;

public class Request {
	private int requestId;
	private int totalRequest;
	private String delieveryDate;
	private String delieveyDay;
	private String productType;
	private long count;
	
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	private int productId;
	@Override
	public String toString() {
		return "Request [requestId=" + requestId + ", totalRequest=" + totalRequest + ", delieveryDate=" + delieveryDate
				+ ", delieveyDay=" + delieveyDay + ", productId=" + productId + ", totalCount=" + totalCount + "]";
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getTotalRequest() {
		return totalRequest;
	}
	public void setTotalRequest(int totalRequest) {
		this.totalRequest = totalRequest;
	}
	public String getDelieveryDate() {
		return delieveryDate;
	}
	public void setDelieveryDate(String delieveryDate) {
		this.delieveryDate = delieveryDate;
	}
	public String getDelieveyDay() {
		return delieveyDay;
	}
	public void setDelieveyDay(String delieveyDay) {
		this.delieveyDay = delieveyDay;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	private int totalCount;
	

}
