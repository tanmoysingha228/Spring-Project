package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Customer;
import com.example.demo.repositpory.CustomerRepository;
import com.example.demo.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer addCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	public List<Customer> getAllCustomer() {
		
		return customerRepository.findAll();
	}

}
