package com.mcs.be.course.facade;

import com.mcs.be.course.dto.CustomerDto;
import com.mcs.be.course.exception.CustomerNotFound;

public interface CustomerFacade {

	CustomerDto login(CustomerDto userDto) throws CustomerNotFound;
	
	CustomerDto register(CustomerDto userDto);
	
	void logout();
	
	CustomerDto retrieveSessionUser();
}
