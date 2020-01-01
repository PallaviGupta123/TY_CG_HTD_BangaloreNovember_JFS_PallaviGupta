package com.capgemini.parallelprojectcollection.controller;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.parallelprojectcollection.abstraction.IClientService;
import com.capgemini.parallelprojectcollection.abstraction.IProductService;
import com.capgemini.parallelprojectcollection.abstraction.IStockService;
import com.capgemini.parallelprojectcollection.bean.Admin;
import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.bean.Product;
import com.capgemini.parallelprojectcollection.bean.Stock;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class AdminHome {
	public static void main(Admin admin) {
		Scanner sc=new Scanner(System.in);
		Client customer=new Client();

		IClientService service=Factory.objectClientService();
		IProductService service1=Factory.objectProductService();
		IStockService service2=Factory.objectStockService();
		//Client customer=new Client();
		boolean logout=false;
		while(!logout) {
			System.out.println("1.Add Customer\n2.GetAll Customer\n3.Add Product\n4.Get All Product\n5.Add Stock\n6.Get ALL Stock\n7.Home");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the customer id");
				String cid=sc.next();
				customer.setCustId(cid);
				System.out.println("Enter the customer name");
				String name=sc.next();
				boolean flag;
				do {
					String pattern="[a-zA-Z_]+";
					flag=name.matches(pattern);
					if(!flag) {
						System.err.println("OOPs!!!Only Alphabet ");
					}
					else {
						customer.setCustName(name);

					}	
				}
				while(!flag);	
				//Validation.isUserName(name);
				System.out.println("Enter the StreetAddd1");
				customer.setStreetAdd1(sc.next());
				System.out.println("Enter the StreetAdd2");
				customer.setStreetAdd2(sc.next());
				System.out.println("Enter the town");
				customer.setTown(sc.next());

				boolean flag1;
				do {
					String pattern="^[1-9][0-9]{5}$";
					System.out.println("enter the zip code");
					String code=sc.next();
					flag1=code.matches(pattern);
					if(!flag1)System.err.println("OOPs!!!Must Be Digit Intger Number ");
					else {
						customer.setZipCode(code);	
					}	
				}while(!flag1);
				// Validation for email;
				boolean flag2;
				do {
					String pattern="^(.+)@(.+)\\.(.+)?$";
					System.out.println("enter the email ");
					String email=sc.next();
					flag2=email.matches(pattern);
					if(!flag2)System.err.println("OOPs!!!Must Be Digit Intger Number ");
					else {
						customer.setEmail(email);
					}	
				}while(!flag2);
				//Validation for Telephone
				System.out.println("Enter the mobile no");
				customer.setMobileNo(Integer.parseInt(sc.next()));
				customer.setAdminId(admin.getId());
				boolean isAdded=service.addCustomer(customer);
				if(isAdded) {
					System.out.println("Customer Added Succesfully");
				}else {
					System.err.println("Something went wrong");
				}
				break;
			case 2:
				List<Client>list=service.getAllCustomer();
				if(list!=null) {
					for (Client client : list) {
						System.out.println(client);
					}
				}
				//System.out.println(list.toString());
				break;
			case 3:
				Product product=new Product();
				//System.out.println("Enter the id");
				//product.setProductId(Integer.parseInt(sc.next()));
				System.out.println("Enter the product name");
				product.setProductName(sc.next());
				System.out.println("Enter the product type");
				product.setProductType(sc.next());
			
				System.out.println("Enter the weight");
				product.setWeight(Integer.parseInt(sc.next()));
				System.out.println("Enter the stock");
				product.setStock(Integer.parseInt(sc.next()));
				
				product.setAddedBy(admin.getId());
				boolean isProductAdded=service1.addProduct(product);
				if(isProductAdded) {
					System.out.println("Product Added sucessfull");

				}else {
					System.err.println("Somthjing went wrong");
				}
				break;
			case 4:
				List<Product> list1=service1.getAllProduct();
				if(list1!=null) {
					for (Product product2 : list1) {
						System.out.println(product2);
						
					}
				}
				break;


			case 5:
				Stock stock=new Stock();
				System.out.println("Enter the stockid");
				stock.setStockId(Integer.parseInt(sc.next()));
				System.out.println("Enter the Weight");
				stock.setWeight(Float.parseFloat(sc.next()));
				System.out.println("Enter the total no. of product");
				stock.setCount(Long.parseLong(sc.next()));
				boolean isStockAdded=service2.addStock(stock);
				if(isStockAdded) {
					System.out.println("Stock added sucessfully");
				}else {
					System.err.println("Something went wrong");
				}
				break;
			case 6:
				List<Stock> s1=service2.getAllStock();
				if(s1!=null) {
					for (Stock stock2 : s1) {
						System.out.println(stock2);
						
					}
				}
				break;
			case 7:
				System.out.println("Login Out");
				logout=true;
				//isReturnMain=true;
				break;
			}   
		}
	}
}

