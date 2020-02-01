package com.capgemini.loanprocessingsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")
public class CustomerDetails {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	@Column
	private String customerName;
	@Column
	private long customerContactNo;
	@Column
	private String customerAddress;
	@Column
	private String aadharNo;
	@Column
	private String occupation;
	@Column
	private double annualIncome;
	@Column
	private double loanAmount;
	@Column
	private int assertId;
	@Column
	private String nomineeName;
	@Column
	private String nomineePanId;
	@Column
	private long nomineeContactNo;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContactNo() {
		return customerContactNo;
	}
	public void setCustomerContactNo(long customerContactNo) {
		this.customerContactNo = customerContactNo;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getAssertId() {
		return assertId;
	}
	public void setAssertId(int assertId) {
		this.assertId = assertId;
	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public String getNomineePanId() {
		return nomineePanId;
	}
	public void setNomineePanId(String nomineePanId) {
		this.nomineePanId = nomineePanId;
	}
	public long getNomineeContactNo() {
		return nomineeContactNo;
	}
	public void setNomineeContactNo(long nomineeContactNo) {
		this.nomineeContactNo = nomineeContactNo;
	}	
	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName + ", customerContactNo="
				+ customerContactNo + ", customerAddress=" + customerAddress + ", aadharNo=" + aadharNo
				+ ", occupation=" + occupation + ", annualIncome=" + annualIncome + ", loanAmount=" + loanAmount
				+ ", assertId=" + assertId + ", nomineeName=" + nomineeName + ", nomineePanId=" + nomineePanId
				+ ", nomineeContactNo=" + nomineeContactNo + "]";
	}
}//end of class
