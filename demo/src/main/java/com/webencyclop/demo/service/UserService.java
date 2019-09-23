package com.webencyclop.demo.service;

import com.webencyclop.demo.model.User;

public interface UserService {

	public void saveUser(User user);
	
	public boolean isUserAlreadyPresent(User user);
}
