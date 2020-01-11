package com.capgemini.retailermainteanancesystemapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermainteanancesystemapplication.dao.UserDao;
import com.capgemini.retailermainteanancesystemapplication.dto.User;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao dao;

	@Override
	public boolean addUser(User user) {
		return dao.addUser(user);
	}

	

	@Override
	public boolean changePassword(String email, String password) {
		return dao.changePassword(email, password);
	}

	@Override
	public User auth(String email, String password) {
		return dao.auth(email, password);
	}

}
