package com.customer.database;

import java.util.HashMap;
import java.util.Map;

import com.customer.dto.CustomerDto;

public class CustomerDatabase {

	public static Map<Integer, CustomerDto>customerList;
	
	static { customerList = new HashMap<Integer, CustomerDto>();
	
	CustomerDto cust = new CustomerDto();
	
	cust.setCustomerId(2532);
	cust.setFirstName("Hasib");
	cust.setLastName("Haidary");
	cust.setAddress("177 Yellowstone Dr");
	cust.setCity("Charlottesville");
	cust.setState("VA");
	cust.setZipcode(22903);
	cust.setCountry("USA");
	customerList.put(2532, cust);
	
CustomerDto cust1 = new CustomerDto();
	
	cust1.setCustomerId(4525);
	cust1.setFirstName("John");
	cust1.setLastName("Michael");
	cust1.setAddress("2532 New York ave");
	cust1.setCity("Bronze");
	cust1.setState("NY");
	cust1.setZipcode(22584);
	cust1.setCountry("USA");
	
	customerList.put(4525, cust1);
	
	
CustomerDto cust2 = new CustomerDto();
	
	cust2.setCustomerId(4525);
	cust2.setFirstName("John");
	cust2.setLastName("Michael");
	cust2.setAddress("2532 New York ave");
	cust2.setCity("Bronze");
	cust2.setState("NY");
	cust2.setZipcode(22584);
	cust2.setCountry("USA");
	
	customerList.put(4525, cust1);
	
	
}
}