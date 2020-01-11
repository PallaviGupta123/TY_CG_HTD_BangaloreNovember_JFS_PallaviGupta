package com.capgemini.retailermainteanancesystemapplication.service;

import com.capgemini.retailermainteanancesystemapplication.dto.User;

public interface UserService {
	public boolean addUser(User user);
	//public boolean register(User user);
	public boolean changePassword(String email,String password);
	public User auth(String email,String password);
}
