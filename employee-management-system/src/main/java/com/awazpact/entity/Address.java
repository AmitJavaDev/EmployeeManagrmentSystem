package com.awazpact.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address_tbl")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private int  cityId;
	private int employeeId;
    private int deparmentId;
	public Address(int addressId, int cityId, int employeeId, int deparmentId) {
		super();
		this.addressId = addressId;
		this.cityId = cityId;
		this.employeeId = employeeId;
		this.deparmentId = deparmentId;
	}
	public Address() {
		super();
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getDeparmentId() {
		return deparmentId;
	}
	public void setDeparmentId(int deparmentId) {
		this.deparmentId = deparmentId;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", cityId=" + cityId + ", employeeId=" + employeeId
				+ ", deparmentId=" + deparmentId + "]";
	}
    
    

}
