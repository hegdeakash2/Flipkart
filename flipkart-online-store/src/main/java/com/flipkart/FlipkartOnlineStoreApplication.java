package com.flipkart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flipkart.models.Address;
import com.flipkart.models.Customer;
import com.flipkart.models.Flipkart;
import com.flipkart.service.IFlipkartService;

@SpringBootApplication
public class FlipkartOnlineStoreApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FlipkartOnlineStoreApplication.class, args);
	}
	
	@Autowired
	IFlipkartService iflipkartService;

	@Override
	public void run(String... args) throws Exception {
		Address address=new Address("Poojanahalli", 560024, "Bangalore", "Karnataka");
		Customer customer=new Customer("Rajath", 9876541230l, address);
		Flipkart flipkart= new Flipkart("protin","Suppliments","Big  billion day",4000,customer);
		
		iflipkartService.addFlipkart(flipkart);
	}

}
