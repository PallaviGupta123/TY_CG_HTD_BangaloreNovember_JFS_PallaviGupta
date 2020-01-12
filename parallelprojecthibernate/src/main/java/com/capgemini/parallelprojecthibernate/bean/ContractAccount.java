package com.capgemini.parallelprojecthibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="forestry-admin")
public class ContractAccount {
	@Id
	@Column(name="id")
	private int contractId;
	@Column(name="name")
	private String contractName;
	@Column
	private String password;
	@Column
	private String gender;
	@Column
	private String role;
	@Override
	public String toString() {
		return "ContractAccount [contractId=" + contractId + ", contractName=" + contractName + ", password=" + password
				+ ", gender=" + gender + ", role=" + role + "]";
	}
	public int getContractId() {
		return contractId;
	}
	public void setContractId(int contractId) {
		this.contractId = contractId;
	}
	public String getContractName() {
		return contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
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
	
}
