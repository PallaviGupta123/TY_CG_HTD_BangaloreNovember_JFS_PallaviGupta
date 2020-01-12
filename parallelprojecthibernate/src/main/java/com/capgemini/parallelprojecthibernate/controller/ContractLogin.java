package com.capgemini.parallelprojecthibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.parallelprojecthibernate.abstraction.IClientService;
import com.capgemini.parallelprojecthibernate.abstraction.IContractService;
import com.capgemini.parallelprojecthibernate.abstraction.IProductService;
import com.capgemini.parallelprojecthibernate.abstraction.IRequestService;
import com.capgemini.parallelprojecthibernate.bean.Client;
import com.capgemini.parallelprojecthibernate.bean.Contract;
import com.capgemini.parallelprojecthibernate.bean.Product;
import com.capgemini.parallelprojecthibernate.factory.Factory;
import com.capgemini.parallelprojecthibernate.service.ContractService;

public class ContractLogin {
	public static void main()   {
		Scanner sc=new Scanner(System.in);
		Contract contract=new Contract();
		   IClientService service5=Factory.objectClientService();
		IRequestService service=Factory.objectRequestService();
		IProductService service2=Factory.objectProductService();
		//IStockService service3=Factory.objectStockService();
		List<Product> list1=service2.getAllProduct();
		System.out.println(list1.toString());
		IContractService service4=new ContractService();
		List<Client> list2=service5.getAllCustomer();
		System.out.println(list2.toString());
		while(true) {
			System.out.println("1.Accept Order\n2.Reject Order\n3.Haulier Details");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter the request ID");
				    contract.setRequestId(Integer.parseInt(sc.next()));
				    System.out.println("Enter the amount");
				    contract.setAmount(Integer.parseInt(sc.next()));
				    System.out.println("Enter the transportation id");
				    contract.setTransaportid(Integer.parseInt(sc.next()));
				    System.out.println("Enter the delievryDate");
				    contract.setDelivery_date(sc.next());
		      boolean  isAccepted=service4.acceptRequest(contract);
				 if(isAccepted) {
					 System.out.println("Order Delievered Successfully");
				 }else {
					 System.err.println("Something went wrong");
				 }
				break;
			case 2:
				Contract contract1=new Contract();
				System.out.println("Enter the orderID");
				int id=Integer.parseInt(sc.next());
				contract1.setOrderId(id);
				boolean isRejected=service4.rejectRequest(id);
				if(isRejected) {
					System.out.println("Order is Canclled");
				}else {
					System.err.println("Something went wrong");
				}
				break;
			case 3:
				HaulierLogin.main();
				break;
				
			}
		}
		
	}

}
