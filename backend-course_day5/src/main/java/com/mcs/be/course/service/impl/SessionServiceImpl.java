package com.mcs.be.course.service.impl;

import org.springframework.stereotype.Service;

import com.mcs.be.course.dto.CustomerDto;
import com.mcs.be.course.dto.SessionDto;
import com.mcs.be.course.service.SessionService;

@Service
public class SessionServiceImpl implements SessionService {

	private SessionDto sessionDto = new SessionDto();
	
	@Override
	public CustomerDto retrieveCustomer(){
		return sessionDto.getCurrentCustomer();
	}

	@Override
	public void saveCustomer(CustomerDto customer) {
		sessionDto.setCurrentCustomer(customer);
	}

	@Override
	public void removeCustomer() {
		sessionDto = null;
	}
}