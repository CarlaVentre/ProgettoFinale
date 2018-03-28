package com.mcs.be.course.service;

import com.mcs.be.course.dto.CustomerDto;

public interface SessionService {

	CustomerDto retrieveCustomer();
	
	void saveCustomer(CustomerDto customer);
	
	void removeCustomer();
}
