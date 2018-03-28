package com.mcs.be.course.facade;

public interface UserFacade {

	UserDto login(UserDto userDto);
	
	UserDto register(UserDto userDto);
}
