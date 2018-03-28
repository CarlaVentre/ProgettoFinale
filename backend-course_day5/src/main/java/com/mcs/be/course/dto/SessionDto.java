package com.mcs.be.course.dto;

import java.io.Serializable;

public class SessionDto implements Serializable{
	private CustomerDto currentCustomer;

	//costruttori
	public SessionDto() {
		this.currentCustomer = new CustomerDto();
	}
	public SessionDto(CustomerDto currentCustomer) {
		this.currentCustomer = currentCustomer;
	}
	//getters&setters
	public CustomerDto getCurrentCustomer() {
		return currentCustomer;
	}

	public void setCurrentCustomer(CustomerDto currentCustomer) {
		this.currentCustomer = currentCustomer;
	}
}
