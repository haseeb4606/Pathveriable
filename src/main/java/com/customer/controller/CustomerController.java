  package com.customer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.dto.CustomerDto;
import com.customer.service.CustomerService;

@RestController
@RequestMapping(value = "request")
public class CustomerController {

	private CustomerService srvice;

	@RequestMapping(value = ("/get"), method = RequestMethod.GET)
	public CustomerDto getCustInfoByIde(@RequestParam(required = true) Integer id) {

		return srvice.getCustInfoById(id);
	}

	@RequestMapping(value = "/{id}/details")
	public CustomerDto getCustInfoById(@PathVariable Integer id) {

		return srvice.getCustInfoById(id);
	}

	@PostMapping(value="")

	public void creatCustomer(@RequestBody CustomerDto cust) {

		System.out.println(cust.toString());

		
		
	}
	
	@PutMapping(value="")
	public void updateCustomerId(@RequestBody CustomerDto cust) {
		
	}

	public CustomerService getSrvice() {
		return srvice;
	}

	public void setSrvice(CustomerService srvice) {
		this.srvice = srvice;
	}

}
