package com.customer.service;

import com.customer.dto.CustomerDto;
import com.customer.database.*;

public class CustomerService {

	public CustomerDto getCustInfoById(int customerId) {

		return CustomerDatabase.customerList.get(customerId);
	}
}