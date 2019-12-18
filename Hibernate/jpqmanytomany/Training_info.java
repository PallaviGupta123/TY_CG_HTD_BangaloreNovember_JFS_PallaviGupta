package com.capgemini.jpqmanytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.onetoone.Emplyoee;

@Entity
@Table(name="Training_info")
public class Training_info {
	@Id
	@Column
	private int tid;
	@Column
	private String tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="trainig_employee",
	joinColumns=@JoinColumn(name="tid"),
	inverseJoinColumns=@JoinColumn(name="eid"))
	
	private List <Emplyoee> eList;
	public List<Emplyoee> geteList() {
		return eList;
	}
	public void seteList(List<Emplyoee> eList) {
		this.eList = eList;
	}
	

}
