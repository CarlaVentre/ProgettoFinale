package com.mcs.be.course.service;



import com.mcs.be.course.exception.CustomerNotFound;
import com.mcs.be.course.model.Customer;

public interface CustomerService {
	
	Customer retrieveUserById(final Long id) throws CustomerNotFound;
	
	Customer login(Long id, String password) throws CustomerNotFound;
	
	Customer register(Customer user);
	
	

}
