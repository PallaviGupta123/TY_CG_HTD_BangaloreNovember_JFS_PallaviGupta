package com.cape.moduletest1.bean;

public class ProductBean {
	private int pid;
	private String pname;
	private String color;
	private double cost;
	private String description;
	private int totalProduct;
	@Override
	public String toString() {
		return "ProductBean [pid=" + pid + ", pname=" + pname + ", color=" + color + ", cost=" + cost + ", description="
				+ description + ", totalProduct=" + totalProduct + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getTotalProduct() {
		return totalProduct;
	}
	public void setTotalProduct(int totalProduct) {
		this.totalProduct = totalProduct;
	}
	
	

}
