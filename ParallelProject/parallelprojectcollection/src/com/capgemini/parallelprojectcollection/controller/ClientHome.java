package com.capgemini.parallelprojectcollection.controller;

import java.util.List;
import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

import org.omg.PortableServer.ServantRetentionPolicyValue;

import com.capgemini.parallelprojectcollection.abstraction.IClientService;
import com.capgemini.parallelprojectcollection.abstraction.IProductService;
import com.capgemini.parallelprojectcollection.abstraction.IRequestService;
import com.capgemini.parallelprojectcollection.abstraction.IStockService;
import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.bean.Product;
import com.capgemini.parallelprojectcollection.bean.Request;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class ClientHome {
	public static void main(int custId) {
		Scanner sc=new Scanner(System.in);
		Request request=new Request();
		IRequestService service=Factory.objectRequestService();
		IProductService service2=Factory.objectProductService();
		//IStockService service3=Factory.objectStockService();
		IClientService clientService=Factory.objectClientService();
		Client client=clientService.getCustomerbyID(custId);
		List<Product> list1=service2.getAllProduct();
		System.out.println(list1.toString());
		System.out.println("Hello "+ client.getCustName());
		while(true) {
			System.out.println("1.Place Order\n2.Cancel Order\n3.View Total Order\n4.Exit\n5.View Product\n6.Edit Profile");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Request id");
				request.setRequestId(Integer.parseInt(sc.next()));
				System.out.println("Enter the product id");
				request.setProductId(Integer.parseInt(sc.next()));
				System.out.println("Enter the Product Type");
				request.setProductType(sc.next());
				System.out.println("On What Date you want to Get Delievery");
				request.setDelieveryDate(sc.next());
				System.out.println("On what Day you want to Get Delievry");
				request.setDelieveyDay(sc.next());
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
				System.out.println("Enter the client id");
			//	cus
				
				
			}
		}
		
	}

}
