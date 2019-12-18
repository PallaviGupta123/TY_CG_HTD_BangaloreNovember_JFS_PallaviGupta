package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.capgemini.jpawithhibernate.onetoone.Emplyoee;


@Entity
@Table (name="EmplyoeeExperience")
public class EmplyoeeExperience {
	@Id
	private int exid;
	@Column
	private String company;
	public int getExid() {
		return exid;
	}

	public void setExid(int exid) {
		this.exid = exid;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Emplyoee getEmp() {
		return emp;
	}

	public void setEmp(Emplyoee emp) {
		this.emp = emp;
	}

	@Column
	private int year;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private Emplyoee emp;
	
	


}
