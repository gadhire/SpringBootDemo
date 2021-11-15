package com.mapping.enquiry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.entity.Customer;
import com.mapping.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer addCustomer(Customer customer) {
		Customer customer2=customerRepository.save(customer);
		//System.out.println(customer2);
		return customer2;
	}

}
