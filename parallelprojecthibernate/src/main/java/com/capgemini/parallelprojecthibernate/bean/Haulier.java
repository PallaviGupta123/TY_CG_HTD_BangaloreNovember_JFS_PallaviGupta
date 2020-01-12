package com.capgemini.parallelprojecthibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaportation")
public class Haulier {
	@Id
	@Column
	private int id;
	@Column
	private String driverName;
	@Column
	private String vehicleType;
	@Column
	private String vehicleNo;
	@Column
	private String companyName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Haulier [id=" + id + ", driverName=" + driverName + ", vehicleType=" + vehicleType + ", vehicleNo="
				+ vehicleNo + ", companyName=" + companyName + "]";
	}
	

}
