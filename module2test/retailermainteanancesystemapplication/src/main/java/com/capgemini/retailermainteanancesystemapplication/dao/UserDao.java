package com.capgemini.retailermainteanancesystemapplication.dao;

import com.capgemini.retailermainteanancesystemapplication.dto.User;

public interface UserDao {
	public boolean addUser(User user);
	//public boolean register(User user);
	public boolean changePassword(String email,String password);
	public User auth(String email,String password);
}
