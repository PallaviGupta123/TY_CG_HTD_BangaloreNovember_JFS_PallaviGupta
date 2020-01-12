package com.capgemini.parallelprojecthibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="forestry-admin")
public class ClientAccount {
	@Id
	@Column(name="id")
	private int clientId;
	@Column(name="name")
	private String clientName;
	@Column
	private String password;
	@Column
	private String gender;
	@Column
	private String role;
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "ClientAccount [clientId=" + clientId + ", clientName=" + clientName + ", password=" + password
				+ ", gender=" + gender + ", role=" + role + "]";
	}
	

}
