package com.capgemini.parallelprojecthibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_details")
public class Product {
	@Id
	@Column
	private int productId;
	@Column
	private String productType;
	@Column
	private String productName;
	@Column
	private int weight;
	@Column
	private int stock;
	@Column
	private int addedBy;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(int addedBy) {
		this.addedBy = addedBy;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productType=" + productType + ", productName=" + productName
				+ ", weight=" + weight + ", stock=" + stock + ", addedBy=" + addedBy + "]";
	}
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
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	

}
