package com.capgemini.parallelprojectcollection.bean;

import java.io.Serializable;

public class Client implements Serializable{
	private String custName;
	private int custId;
	private String streetAdd1;
	private String streetAdd2;
	private String town;
	private String zipCode;
	private String email;
	private int mobileNo;
	
	private String password;
	public Client() {
		custName="Gupta";
		password="Gupta";				
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getStreetAdd1() {
		return streetAdd1;
	}
	public void setStreetAdd1(String streetAdd1) {
		this.streetAdd1 = streetAdd1;
	}
	public String getStreetAdd2() {
		return streetAdd2;
	}
	public void setStreetAdd2(String streetAdd2) {
		this.streetAdd2 = streetAdd2;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Client [custName=" + custName + ", custId=" + custId + ", streetAdd1=" + streetAdd1 + ", streetAdd2="
				+ streetAdd2 + ", town=" + town + ", zipCode=" + zipCode + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", userId=" + "" + ", password=" + password + "]";
	}
	
	
	

}
