package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="empl_otherinfo")

public class EmplyoeeOtherInfo {
	@Id
	@Column
	private int id;

	@Column
	private String pancard;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="eid")
	private Emplyoee emp;
	public Emplyoee getEmp() {
		return emp;
	}
	public void setEmp(Emplyoee emp) {
		this.emp = emp;
	}
	
	

}
