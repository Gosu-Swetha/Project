package com.cg.ofda.service;

import java.util.List;

import com.cg.ofda.dto.CustomerDto;
import com.cg.ofda.exception.CustomerException;

public interface ICustomerService {
	
	public CustomerDto addCustomer(CustomerDto customer);
	public CustomerDto updateCustomer(CustomerDto customer);
	public CustomerDto removeCustomer(String custId) throws CustomerException;
	public CustomerDto viewCustomer(String custId) throws CustomerException;
	public List<CustomerDto> viewAllCustomers();

}
