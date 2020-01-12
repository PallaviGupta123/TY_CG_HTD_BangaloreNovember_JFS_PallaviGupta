package com.capgemini.parallelprojecthibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.parallelprojecthibernate.abstraction.IClientService;
import com.capgemini.parallelprojecthibernate.abstraction.IProductService;
import com.capgemini.parallelprojecthibernate.abstraction.IRequestService;
import com.capgemini.parallelprojecthibernate.bean.Client;
import com.capgemini.parallelprojecthibernate.bean.Product;
import com.capgemini.parallelprojecthibernate.bean.Request;
import com.capgemini.parallelprojecthibernate.factory.Factory;

public class ClientHome {
	public static void main(int custId) {
		Scanner sc=new Scanner(System.in);
		Request request=new Request();
		Client client=new Client();
		IRequestService service=Factory.objectRequestService();
		IProductService service2=Factory.objectProductService();
		//IStockService service3=Factory.objectStockService();
		IClientService clientService=Factory.objectClientService();
		//Client client=clientService.getCustomerbyID(custId);
		List<Product> list1=service2.getAllProduct();
		System.out.println(list1.toString());
		System.out.println("Hello ");
		while(true) {
			System.out.println("1.Place Order\n2.Cancel Order\n3.View Total Order\n4.Exit\n5.View Product\n6.Edit Profile");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the product id");
				request.setProductId(Integer.parseInt(sc.next()));
				System.out.println("Enter the Product Type");
				request.setProductType(sc.next());
				System.out.println("Enter the Qunaityt");
				request.setQuantity(Integer.parseInt(sc.next()));
				System.out.println("On What Date you want to Get Delievery");
				request.setExpectedDelieveryDate(sc.next());
				//.setCustomerId(client.getId());
			    boolean isRequested=service.createRequest(request);
			    if(isRequested) {
			    	System.out.println("Order Placed Successfully");
			    	
			    }else {
			    	System.err.println("Something went wrong");
			    }
			    break;
			case 2: Request request1=new Request();
				System.out.println("Enter the Request id");
			      int id=Integer.parseInt(sc.next());
			     request1.setRequestId(id);
			     boolean isDelelted=service.cancelOrder(id);
			     if(isDelelted) {
			    	 System.out.println("Order Cancel");
			     }else {
			    	 System.err.println("Something went wrong");
			     }
				break;
			case 3:
				List<Request> list=service.getAllRequest();
				System.out.println(list.toString());
				break;
			case 4:AdminLogin.main(null);
			       break;
			case 5:
				/*List<Product> list1=service2.getAllProduct();
				System.out.println(list1.toString());
				break;*/
			case 6:
				System.out.println("1.Edit Email\n2.Edit Telephone\n3.Edit City\n4.Edit zipcode");
				int count=sc.nextInt();
				System.out.println("Enter the customerID");
				int id1=Integer.parseInt(sc.next());
				Client client1=new Client();
				client1.setId(id1);
				switch(count) {
				case 1:
					System.out.println("Enter the Customer Email");
					String email=sc.next();
					client1.setEmail(email);
					break;
				case 2:
					System.out.println("Enter the Telephone number");
					String telephone=sc.next();
					client1.setMobile(telephone);
					break;
					
				case 3:
					System.out.println("Enter the city");
					String city=sc.next();
					client1.setCity(city);
					break;
				case 4:
					System.out.println("Enter the zipcode");
					String code=sc.next();
					client1.setZipcode(code);	
				}
				boolean isEdited=clientService.updateCustomer(id1, client1);
				if(isEdited) {
					System.out.println("Edit successfully");
				}else {
					System.err.println("Something went wrong");
				}
					break;
		}
		
	}
	}

}
