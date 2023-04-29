package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

public class CustomerController {
	
private CustomerService customerService;
	
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return this.customerService.addCustomer(customer);
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		return this.customerService.getAllCustomer();
	}

}
