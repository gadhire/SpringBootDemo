package com.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.enquiry.service.CustomerService;
import com.mapping.entity.Customer;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Customer addCustomer(@RequestBody Customer customer) {
		System.out.println(customer);
		Customer saveCustomer = customerService.addCustomer(customer);
		return saveCustomer;
	}

}
