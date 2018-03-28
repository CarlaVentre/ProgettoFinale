package com.mcs.be.course.facade;

import com.mcs.be.course.dto.CustomerDto;

public interface CustomerFacade {

	CustomerDto login(CustomerDto userDto);
	
	CustomerDto register(CustomerDto userDto);
}
