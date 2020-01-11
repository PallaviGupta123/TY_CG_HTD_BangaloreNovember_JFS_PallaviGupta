package com.capgemini.retailermainteanancesystemapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermainteanancesystemapplication.dto.Product;
import com.capgemini.retailermainteanancesystemapplication.dto.ProductResponse;
import com.capgemini.retailermainteanancesystemapplication.service.ProductService;
import com.mysql.fabric.Response;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	@PostMapping(path="/addProduct",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public  ProductResponse addCustomer(@RequestBody Product product) {
		ProductResponse responce=new ProductResponse();
		if(service.addProduct(product)){
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
	@GetMapping(path="/getAllProduct",produces=MediaType.APPLICATION_JSON_VALUE)
	public Response getAllProduct()
	{
		ProductResponse responce=new ProductResponse();
		List<Product>customer=service.getAllProdut();
		if(customer.size()==0) {
			responce.setStatusCode(401);
			responce.setMessage("faliue");
			responce.setDescription("Product already Exist");		
		}else {responce.setStatusCode(201);
		responce.setMessage("Successfull");
		responce.setDescription("Product Added to Cart");
		}
		return null;
	}
	
	@GetMapping(path="/searchProduct",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getCustomerByID(@RequestParam ("key") int key) {
		ProductResponse response=new ProductResponse();
		Product product=service.searchProduct(key);
		if(product==null) {
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
