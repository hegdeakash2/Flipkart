package com.flipkart.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.flipkart.models.Address;
import com.flipkart.models.Customer;
@Service
public interface ICustomerService {
	
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int customerId);
	Set<Address> getAll();
	
	Set<Customer> getCustomerName(String name);
	Set<Customer> getCustomerCity(String city);
	Set<Customer> getCustomerState(String state);
	Set<Customer> getCustomerPincode(long pincode);
	

}
