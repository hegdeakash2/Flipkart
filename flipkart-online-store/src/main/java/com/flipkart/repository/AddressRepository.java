package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flipkart.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
