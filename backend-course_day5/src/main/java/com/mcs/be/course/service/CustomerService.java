package com.mcs.be.course.service;



import com.mcs.be.course.exception.CustomerNotFound;
import com.mcs.be.course.model.Customer;

public interface CustomerService {
	
	Customer retrieveUserById(final String id) throws CustomerNotFound;
	
	Customer login(String id, String password) throws CustomerNotFound;
	
	Customer register(Customer user);
	
	

}
