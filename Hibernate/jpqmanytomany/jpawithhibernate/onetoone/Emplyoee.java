package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.ToString.Exclude;

@Entity
@Table(name="empl_info")
public class Emplyoee {
	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	@Column
	private String email;
	@Column
	private String password;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	@Exclude
	@OneToOne(cascade =CascadeType.ALL,mappedBy="emp")
	private EmplyoeeOtherInfo other;
	@Override
	public String toString() {
		return "Emplyoee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", password=" + password + ", other="
				+ other + "]";
	}
	public EmplyoeeOtherInfo getOther() {
		return other;
	}
	public void setOther(EmplyoeeOtherInfo other) {
		this.other = other;
	}

}
