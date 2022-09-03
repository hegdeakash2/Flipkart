package com.flipkart.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Customer {
	@Id
	@GeneratedValue(generator = "cust_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "cust_id", sequenceName = "customer_id")
	private Integer customerId;
	private String name;
	private long mobile;

	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "address_id")
	private Address address;
	
//	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Flipkart.class)
//	private Flipkart flipkart;

	public Customer(String name, long mobile, Address address) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}

}
