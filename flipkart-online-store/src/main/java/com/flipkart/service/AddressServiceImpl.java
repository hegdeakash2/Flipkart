package com.flipkart.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.flipkart.models.Address;
import com.flipkart.repository.AddressRepository;

public class AddressServiceImpl implements  IAddressService{
	
	@Autowired
	AddressRepository addressRepository;

	@Override
	public void addAddress(Address address) {
		addressRepository.save(address);
	}

	@Override
	public void updateAddress(Address address) {
		addressRepository.save(address);
	}

	@Override
	public void deleteAddress(int addressId) {
		addressRepository.deleteById(addressId);
	}

	@Override
	public Set<Address> getAll() {
		return null;
	}

}
