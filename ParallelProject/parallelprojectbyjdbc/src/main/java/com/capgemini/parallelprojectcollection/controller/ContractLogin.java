package com.capgemini.parallelprojectcollection.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.parallelprojectcollection.abstraction.IContractServices;
import com.capgemini.parallelprojectcollection.abstraction.IProductService;
import com.capgemini.parallelprojectcollection.abstraction.IRequestService;
import com.capgemini.parallelprojectcollection.abstraction.IStockService;
import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.bean.Product;
import com.capgemini.parallelprojectcollection.factory.Factory;
import com.capgemini.parallelprojectcollection.services.ContractServices;
import com.mysql.fabric.xmlrpc.Client;

public class ContractLogin {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		Contract contract=new Contract();

		IRequestService service=Factory.objectRequestService();
		IProductService service2=Factory.objectProductService();
		IStockService service3=Factory.objectStockService();
		List<Product> list1=service2.getAllProduct();
		IContractServices service4=new ContractServices();
		while(true) {
			System.out.println("1.Accept Order\n2.Reject Order\n3.Deleiever Product");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the productId");
				contract.setProductId(Integer.parseInt(sc.next()));
				System.out.println("Enter the requestId");
				System.out.println("Enter the requestId");
				contract.setRequestID(Integer.parseInt(sc.next()));
				System.out.println("Enter the Customer Id");
				contract.setCustomerId(Integer.parseInt(sc.next()));
				System.out.println("Enter the transportId");
				contract.setTransportId(Integer.parseInt(sc.next()));
				System.out.println("Enter the delivery_date");
				contract.setDelievery_date(sc.next());
				boolean isOrdered=service4.acceptRequest(contract);
				if(isOrdered) {
					System.out.println("Deliever Product");
				}else {System.err.println("Something went wrong");
				}
				break;
			case 2:
				Contract contract1=new Contract();
				System.out.println("Enter the RequestID");
				int requestId=Integer.parseInt(sc.next());
				boolean isRejected=service4.rejectRequest(requestId);
				if(isRejected) {
					System.out.println("Order is Canclled");
				}else {
					System.err.println("Something went wrong");
				}
				
				
			}
		}
		
	}

}
