package com.flipkart.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.models.Flipkart;
import com.flipkart.repository.FlipkartRepository;

@Service
public class FlipkartServiceImpl implements IFlipkartService{
	
	
	@Autowired
	FlipkartRepository flipkartRepository;

	@Override
	public void addFlipkart(Flipkart flipkart) {
		flipkartRepository.save(flipkart);
	}

	@Override
	public void updateFlipkart(Flipkart flipkart) {
		flipkartRepository.save(flipkart);
	}

	@Override
	public void deleteFlipkart(int productId) {
		flipkartRepository.deleteById(productId);
	}

	@Override
	public Flipkart getByProductId(int productId) {
		return null;
	}

	@Override
	public Set<Flipkart> getByCategory(String Category) {
		return null;
	}

	@Override
	public Set<Flipkart> getByFlipkartCustomerName(String name) {
		return null;
	}

	@Override
	public Set<Flipkart> getByFlipkartCustomerMobile(long mobile) {
		return null;
	}

}
