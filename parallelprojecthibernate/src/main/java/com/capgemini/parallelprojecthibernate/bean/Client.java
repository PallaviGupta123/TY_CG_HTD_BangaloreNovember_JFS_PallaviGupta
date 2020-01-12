package com.capgemini.parallelprojecthibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer")
public class Client {
	@Id
	@Column
private int id;
	@Column
private String customername;
	@Column
private String streetAdd1;
	@Column
private String streetAdd2;
	@Column
private String city;
	@Column
private String zipcode;
	@Column
private String email;
	@Column
private String password;
	@Column
private String mobile;
	@Column
private int createdby;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
@Override
public String toString() {
	return "Client [id=" + id + ", customername=" + customername + ", streetAdd1=" + streetAdd1 + ", streetAdd2="
			+ streetAdd2 + ", city=" + city + ", zipcode=" + zipcode + ", email=" + email + ", password=" + password
			+ ", mobile=" + mobile + ", createdby=" + createdby + "]";
}
public String getStreetAdd1() {
	return streetAdd1;
}
public void setStreetAdd1(String streetAdd1) {
	this.streetAdd1 = streetAdd1;
}
public String getStreetAdd2() {
	return streetAdd2;
}
public void setStreetAdd2(String streetAdd2) {
	this.streetAdd2 = streetAdd2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
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
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public int getCreatedby() {
	return createdby;
}
public void setCreatedby(int createdby) {
	this.createdby = createdby;
}


}
