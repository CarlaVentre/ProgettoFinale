package com.mcs.be.course.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mcs.be.course.dto.CustomerDto;
import com.mcs.be.course.exception.CustomerNotFound;
import com.mcs.be.course.facade.CustomerFacade;
import com.mcs.be.course.model.Customer;
import com.mcs.be.course.service.CustomerService;
import com.mcs.be.course.service.SessionService;

import ma.glasnost.orika.MapperFacade;

@Component
public class CustomerFacadeImpl implements CustomerFacade {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private SessionService sessionService;
	
	@Autowired
	private MapperFacade mapperFacade;

	@Override
	public CustomerDto login(CustomerDto userDto) throws CustomerNotFound {
		Customer customer = customerService.login(userDto.getId(), userDto.getPassword());
		if (customer != null) 
			sessionService.saveCustomer(mapperFacade.map(customer, CustomerDto.class));
		return mapperFacade.map(customer, CustomerDto.class);
	}

	@Override
	public CustomerDto register(CustomerDto userDto) {
		Customer customer = mapperFacade.map(userDto, Customer.class);
		customer = customerService.register(customer);
		return mapperFacade.map(customer, CustomerDto.class);
	}

	@Override
	public void logout() {
		if (sessionService.retrieveCustomer() != null)
			sessionService.removeCustomer();
		
	}

	@Override
	public CustomerDto retrieveSessionUser() {
		return sessionService.retrieveCustomer();
	}
	
}
