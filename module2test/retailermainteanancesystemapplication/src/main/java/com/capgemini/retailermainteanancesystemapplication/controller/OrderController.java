package com.capgemini.retailermainteanancesystemapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermainteanancesystemapplication.dto.Order;
import com.capgemini.retailermainteanancesystemapplication.dto.OrderResponse;
import com.capgemini.retailermainteanancesystemapplication.dto.Product;
import com.capgemini.retailermainteanancesystemapplication.dto.ProductResponse;
import com.capgemini.retailermainteanancesystemapplication.service.OrderService;
import com.capgemini.retailermainteanancesystemapplication.service.ProductService;
import com.mysql.fabric.Response;
@RestController
public class OrderController {
	@Autowired
	OrderService service;
	@PostMapping(path="/addOrder",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public  OrderResponse addOrder(@RequestBody Order order) {
		OrderResponse responce=new OrderResponse();
		if(service.addOrder(order)){
			responce.setStatusCode(201);
			responce.setMessage("Successfull");
			responce.setDescription("Product Found credential");
			//responce.setProduct(product);
		}else {
			responce.setStatusCode(401);
			responce.setMessage("faliue");
			responce.setDescription("Email already Exist");

		}
		return responce;
	}
	@GetMapping(path="/getAllOrder",produces=MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse getAllOrdre()
	{
		OrderResponse responce=new OrderResponse();
		List<Order>order=service.getAllOrder();
		if(order.size()==0) {
			responce.setStatusCode(401);
			responce.setMessage("faliue");
			responce.setDescription("Product already Exist");		
		}else {responce.setStatusCode(201);
		responce.setMessage("Successfull");
		responce.setDescription("Product Added to Cart");
		}
		return null;
	}
	@GetMapping(path="/searchOrder",produces=MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse getCustomerByID(@RequestParam ("key") int key) {
		OrderResponse response=new OrderResponse();
		Order order=service.searchOrder(key);
		if(order==null) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Record with particular key doesnot exist");
			
		}
		else {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Details of employee");
		}
		return response;
		
	}
	
	

}
