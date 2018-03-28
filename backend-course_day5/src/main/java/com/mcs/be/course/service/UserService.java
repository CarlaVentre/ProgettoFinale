package com.mcs.be.course.service;

import java.util.List;

import com.mcs.be.course.exception.UserNotFound;

public interface UserService {
	
	List<User> retrieveUserById(final Long id) throws UserNotFound;
	
	User login(Long id, Strign password) throws UserNotFound;
	
	User register(User user);
	
	

}
