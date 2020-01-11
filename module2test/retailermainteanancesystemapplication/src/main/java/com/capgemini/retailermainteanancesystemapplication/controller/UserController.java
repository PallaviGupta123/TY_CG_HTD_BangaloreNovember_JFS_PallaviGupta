package com.capgemini.retailermainteanancesystemapplication.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermainteanancesystemapplication.dto.User;
import com.capgemini.retailermainteanancesystemapplication.dto.UserResponse;
import com.capgemini.retailermainteanancesystemapplication.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	@PostMapping(path="/auth",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)

	public UserResponse auth(@RequestBody User user) {

		User userBean= service.auth(user.getEmail(), user.getPassword());
		UserResponse responce=new UserResponse();
		if(userBean!=null) {
			responce.setStatusCode(201);
			responce.setMessage("Successfull");
			responce.setDescription("Employee Found credential");
			responce.setUser(userBean);
		}
		else{
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("invalid  credential");

		}return responce;
	}
	@PutMapping(path="/change-password",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse changePassword(@RequestBody User user) {
		UserResponse responce=new UserResponse();
		if(service.changePassword(user.getEmail(),user.getPassword())) {
			responce.setStatusCode(201);
			responce.setMessage("Successfull");
			responce.setDescription("Chnaged Password");
		}else {responce.setStatusCode(401);
		responce.setMessage("faliue");
		responce.setDescription("Password not changed");	
		}
		return responce;
	}
	@PostMapping(path="/addUser",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public  UserResponse register(@RequestBody User user) {
		UserResponse responce=new UserResponse();
		if(service.addUser(user)){
			responce.setStatusCode(201);
			responce.setMessage("Successfull");
			responce.setDescription("Employee Found credential");
		}else {
			responce.setStatusCode(401);
			responce.setMessage("faliue");
			responce.setDescription("Email already Exist");

		}
		return responce;
	}
}
