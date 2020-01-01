package com.capgemini.parallelprojectcollection.bean;

public class Stock {
	private int stockId;
	private int productId;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	private float weight;
	private long count;
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", productId=" + productId + ", weight=" + weight + ", count=" + count
				+ "]";
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}

}
