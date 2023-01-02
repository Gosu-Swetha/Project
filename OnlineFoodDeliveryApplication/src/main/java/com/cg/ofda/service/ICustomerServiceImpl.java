package com.cg.ofda.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.ofda.dto.CustomerDto;
import com.cg.ofda.dto.RestaurantDto;
import com.cg.ofda.exception.CustomerException;
import com.cg.ofda.exception.RestaurantException;
import com.cg.ofda.repository.ICustomerRepository;
@Service
public class ICustomerServiceImpl implements ICustomerService {
	@Autowired
	ICustomerRepository customerRepository;

	/* @author : Swetha
	 * @return : Customer 
	 * @description : This method adds customer to the repository and returns customer
	 */
	@Override
	public CustomerDto addCustomer(CustomerDto customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		return customer;
	}

	/* @author : Swetha
	 * @return : Customer 
	 * @description : This method updates customer to the repository and returns customer
	 */
	@Override
	public CustomerDto updateCustomer(CustomerDto customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		return customer;
	}

	/* @author : Swetha
	 * @return : Customer 
	 * @description : This method removes customer to the repository and returns customer
	 */
	@Override
	public CustomerDto removeCustomer(String custId) throws CustomerException {
		if(customerRepository.existsById(custId)) {
		CustomerDto customer = customerRepository.findById(custId).get();
		customerRepository.deleteById(custId);
		return customer;
		}
		else {
			throw new CustomerException("Customer Id not found");
		}
	}
	
	/* @author : Swetha
	 * @return : Customer 
	 * @description : This method gets customer to the repository and returns customer
	 */

//	@Override
//	public CustomerDto viewCustomer(String custId) throws CustomerException {
//		if(customerRepository.existsById(custId)) {
//		return customerRepository.findById(custId).get();
//		}
//		else {
//			throw new CustomerException("Customer Id not found");
//		}
//	}
	@Override
	public CustomerDto viewCustomer(String custId) {
		Optional<CustomerDto> findById = customerRepository.findById(custId);

		return findById.orElseThrow(() -> new CustomerException("There are no customer having id:" + custId));
	}

	@Override
	public List<CustomerDto> viewAllCustomers() {
		List<CustomerDto> crts = customerRepository.findAll();
		return crts;
	}
 
	
	
}
