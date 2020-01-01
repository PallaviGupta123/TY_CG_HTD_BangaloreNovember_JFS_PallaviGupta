package com.capgemini.parallelprojectcollection.bean;

import java.io.Serializable;

public class Land implements Serializable{
	private int landId;
	private String landType;
	private double area;
	private String location;
	private String document;
	private String rights;
	@Override
	public String toString() {
		return "Land [landId=" + landId + ", landType=" + landType + ", area=" + area + ", location=" + location
				+ ", document=" + document + ", rights=" + rights + "]";
	}
	public int getLandId() {
		return landId;
	}
	public void setLandId(int landId) {
		this.landId = landId;
	}
	public String getLandType() {
		return landType;
	}
	public void setLandType(String landType) {
		this.landType = landType;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getRights() {
		return rights;
	}
	public void setRights(String rights) {
		this.rights = rights;
	}
	

}
