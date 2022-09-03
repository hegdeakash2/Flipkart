package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flipkart.models.Flipkart;

@Repository
public interface FlipkartRepository extends JpaRepository<Flipkart, Integer>{

}
