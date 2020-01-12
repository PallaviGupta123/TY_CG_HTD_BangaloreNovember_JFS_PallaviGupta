package com.capgemini.parallelprojecthibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.parallelprojecthibernate.abstraction.IClientService;
import com.capgemini.parallelprojecthibernate.abstraction.IProductService;
import com.capgemini.parallelprojecthibernate.bean.Admin;
import com.capgemini.parallelprojecthibernate.bean.Client;
import com.capgemini.parallelprojecthibernate.bean.Product;
import com.capgemini.parallelprojecthibernate.factory.Factory;

public class AdminHome {
	public static void main(Admin admin) {
		Scanner sc=new Scanner(System.in);
		Client customer=new Client();

		IClientService service=Factory.objectClientService();
		IProductService service1=Factory.objectProductService();
		
		//Client customer=new Client();
		boolean logout=false;
		while(!logout) {
			System.out.println("1.Add Customer\n2.GetAll Customer\n3.Delete Customer\n4.Add Product\n5.Get All Product\n6.Delete Product\n7.\n8.Home\n9.");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
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
						customer.setCustomername(name);

					}	
				}
				while(!flag);	
				//Validation.isUserName(name);
				System.out.println("Enter the StreetAddd1");
				customer.setStreetAdd1(sc.next());
				System.out.println("Enter the StreetAdd2");
				customer.setStreetAdd2(sc.next());
				System.out.println("Enter the town");
				customer.setCity(sc.next());

				boolean flag1;
				do {
					String pattern="^[1-9][0-9]{5}$";
					System.out.println("enter the zip code");
					String code=sc.next();
					flag1=code.matches(pattern);
					if(!flag1)System.err.println("OOPs!!!Must Be Digit Intger Number ");
					else {
						customer.setZipcode(code);	
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
				customer.setMobile(sc.next());
				customer.setId(admin.getAdminId());
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
			case 3:List<Client>list1s=service.getAllCustomer();
			Client client=new Client();
				System.out.println("Enter the customer id");
		
			int id=Integer.parseInt(sc.next());
			boolean isDeleted=service.deleteCustomer(id);
			if(isDeleted) {
				System.out.println("Successfully deleted");
			}else {
				System.err.println("Spmething went wrong");
			}
			break;	
			case 4:
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
				
				product.setAddedBy(admin.getAdminId());
				boolean isProductAdded=service1.addProduct(product);
				if(isProductAdded) {
					System.out.println("Product Added sucessfull");

				}else {
					System.err.println("Somthjing went wrong");
				}
				break;
			case 5:
				List<Product> list1=service1.getAllProduct();
				if(list1!=null) {
					for (Product product2 : list1) {
						System.out.println(product2);
						
					}
				}
				break;


			case 6:
				System.out.println("Enter the productId");
				Product product1=new Product();
				int id1=Integer.parseInt(sc.next());
				product1.setProductId(id1);
	            boolean isDeleted1=service1.deleteProduct(id1);
	            if(isDeleted1) {
	            	System.out.println("Product deletde sucessfullyy");	
	            }else {
	            	System.err.println("Something went wrong");
	            }
	           
				
				break;
			case 7:
				/*List<Stock> s1=service2.getAllStock();
				if(s1!=null) {
					for (Stock stock2 : s1) {
						System.out.println(stock2);
						
					}
				}*/
				break;
			case 8:
				System.out.println("Login Out");
				logout=true;
				//isReturnMain=true;
				break;
			case 9:
			}   
		}
	}

}
