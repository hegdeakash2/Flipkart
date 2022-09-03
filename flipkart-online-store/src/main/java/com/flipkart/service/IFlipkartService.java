package com.flipkart.service;

import java.util.Set;

import com.flipkart.models.Flipkart;


public interface IFlipkartService {

	void addFlipkart(Flipkart flipkart);
	void updateFlipkart(Flipkart flipkart);
	void deleteFlipkart(int productId);
	
	
	
	Flipkart getByProductId(int productId);
	Set<Flipkart> getByCategory(String Category);
	Set<Flipkart> getByFlipkartCustomerName(String name);
	Set<Flipkart> getByFlipkartCustomerMobile(long mobile);
	

	
	
	
	
}
