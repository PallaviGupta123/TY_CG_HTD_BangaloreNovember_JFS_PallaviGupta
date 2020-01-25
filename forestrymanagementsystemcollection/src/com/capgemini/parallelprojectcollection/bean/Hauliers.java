package com.capgemini.parallelprojectcollection.bean;

import java.io.Serializable;

public class Hauliers implements Serializable{
	private int haulierId;
	private String companyName;
	private String driverName;
	private String transportationType;
	private String vehicleNo;
	@Override
	public String toString() {
		return "Hauliers [haulierId=" + haulierId + ", companyName=" + companyName + ", driverName=" + driverName
				+ ", transportationType=" + transportationType + ", vehicleNo=" + vehicleNo + "]";
	}
	public int getHaulierId() {
		return haulierId;
	}
	public void setHaulierId(int haulierId) {
		this.haulierId = haulierId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getTransportationType() {
		return transportationType;
	}
	public void setTransportationType(String transportationType) {
		this.transportationType = transportationType;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	
	
	

}
