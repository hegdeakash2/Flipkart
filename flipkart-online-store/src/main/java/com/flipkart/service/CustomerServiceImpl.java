package com.flipkart.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.flipkart.models.Address;
import com.flipkart.models.Customer;
import com.flipkart.repository.CustomerRepository;

public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	@Override
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(int customerId) {
		customerRepository.deleteById(customerId);
	}

	@Override
	public Set<Address> getAll() {
		return null;
	}

	@Override
	public Set<Customer> getCustomerName(String name) {
		return null;
	}

	@Override
	public Set<Customer> getCustomerCity(String city) {
		return null;
	}

	@Override
	public Set<Customer> getCustomerState(String state) {
		return null;
	}

	@Override
	public Set<Customer> getCustomerPincode(long pincode) {
		return null;
	}

	

}
