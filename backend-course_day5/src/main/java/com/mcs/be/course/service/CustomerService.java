package com.mcs.be.course.service;

import java.util.List;

import com.mcs.be.course.exception.UserNotFound;
import com.mcs.be.course.model.Customer;

public interface CustomerService {
	
	List<Customer> retrieveUserById(final Long id) throws UserNotFound;
	
	Customer login(Long id, String password) throws UserNotFound;
	
	Customer register(Customer user);
	
	

}
