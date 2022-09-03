package com.flipkart.models;
  

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Flipkart {
	@Id
	@GeneratedValue(generator = "flip_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "flip_id", sequenceName ="flipkart_id", initialValue = 10,allocationSize = 1)
	private Integer flipkartId;
	private String productName;
	private String category;
	private String topoffers;
	private double price;

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name = "flipkart_id")
	private Customer customer;

	public Flipkart(String productName, String category, String topoffers, double price, Customer customer) {
		super();
		this.productName = productName;
		this.category = category;
		this.topoffers = topoffers;
		this.price = price;
		this.customer = customer;
	}

	public Integer getProductId() {
		return flipkartId;
	}

	public void setProductId(Integer flipkartId) {
		this.flipkartId = flipkartId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTopoffers() {
		return topoffers;
	}

	public void setTopoffers(String topoffers) {
		this.topoffers = topoffers;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Flipkart [flipkartId=" + flipkartId + ", productName=" + productName + ", category=" + category
				+ ", topoffers=" + topoffers + ", price=" + price + ", customer=" + customer + "]";
	}
	
	
}