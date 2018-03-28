package com.mcs.be.course.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcs.be.course.dao.CustomerDao;
import com.mcs.be.course.exception.CustomerNotFound;
import com.mcs.be.course.model.Customer;
import com.mcs.be.course.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer retrieveUserById(final String id) throws CustomerNotFound {
		Customer customer = customerDao.findOne(id);
		
		if (customer == null) {
			throw new CustomerNotFound("Customer with id " + id + " not exists");
			}
		return customer;
	}

	@Override
	public Customer login(String id, String password) throws CustomerNotFound {
		Customer customer = this.retrieveUserById(id);
		if (customer == null) {
			throw new CustomerNotFound("Customer with id " + id + " not exists");
		}
		if (!customer.getPassword().equals(password))
			return null;
		return customer;
	}

	@Override
	public Customer register(Customer user) {
		if (customerDao.findOne(user.getId()) != null)
			return null;
		return customerDao.save(user);
	}

}
