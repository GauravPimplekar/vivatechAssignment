package com.user.service;

import com.user.entity.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public User getUser(int userId);
	
	public User deleteUser(int userId);
	
	

}
