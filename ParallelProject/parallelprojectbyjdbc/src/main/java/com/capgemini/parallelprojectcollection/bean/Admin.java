package com.capgemini.parallelprojectcollection.bean;

import java.io.Serializable;

public class Admin implements Serializable{
	private int id;
	private String name;
	private String userid;
	private String password;
	private String gender;

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", userid=" + userid + ", password=" + password + ", gender="
				+ gender + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
