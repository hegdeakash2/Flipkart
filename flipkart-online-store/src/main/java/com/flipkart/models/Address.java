package com.flipkart.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {
	@Id
	@GeneratedValue(generator = "add_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "add_id", sequenceName = "address_id")
	private Integer addressId;
	private String streetName;
	private long pincode;
	private String city;
	private String state;
	
	public Address(String streetName, long pincode, String city, String state) {
		super();
		this.streetName = streetName;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}
	
	
	public Integer getAddressId() {
		return addressId;
	}


	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}


	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", pincode=" + pincode + ", city=" + city + ", state=" + state
				+ "]";
	}
	
}
