package com.flipkart.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.flipkart.models.Address;
@Service
public interface IAddressService {

	void addAddress( Address address);
	void updateAddress( Address address);
	void deleteAddress(int addressId );
	
	Set<Address> getAll();
	
}
