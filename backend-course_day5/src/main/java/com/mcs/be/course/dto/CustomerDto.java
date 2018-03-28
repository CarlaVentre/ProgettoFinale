package com.mcs.be.course.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable{
	private String id;
	private String firstName;
	private String lastName;
	private String password;
	private Long cartId;
	
	public CustomerDto() {

	}

	public CustomerDto(String id, String firstName, String lastName, String password, Long cartId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.cartId = cartId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
}
