package com.mcs.be.course.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mcs.be.course.dto.CustomerDto;
import com.mcs.be.course.exception.CustomerNotFound;
import com.mcs.be.course.facade.CustomerFacade;

@RestController
@RequestMapping(value="/customers")
public class RestCustomerController {
	
	@Autowired
	private CustomerFacade customerFacade;
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public CustomerDto login(@RequestBody CustomerDto customerDto) throws CustomerNotFound {
		return customerFacade.login(customerDto);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public CustomerDto register(@RequestBody CustomerDto customerDto) {
		return customerFacade.register(customerDto);
	}
	
	

}
