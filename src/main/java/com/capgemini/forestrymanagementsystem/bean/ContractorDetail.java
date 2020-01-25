package com.capgemini.forestrymanagementsystem.bean;

public class ContractorDetail {
	private int id;
	private  String userId;
	private String email;
	private String password;
	private String mobileNo;
	private String name;
	
	public String getName()
	{
		
		return name;
	}
	
	
	public void setName (String Name)
	{
		this.name=Name;		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "ContractorDetail [ userId=" + userId + ", email=" + email + ", mobileNo=" + mobileNo
				+ "]";
	}
	

}
