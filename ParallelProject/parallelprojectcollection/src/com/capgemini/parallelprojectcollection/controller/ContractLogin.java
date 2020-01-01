package com.capgemini.parallelprojectcollection.controller;

import java.util.Scanner;

import com.capgemini.parallelprojectcollection.abstraction.IContractServices;
import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.services.ContractServices;

public class ContractLogin {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		Contract contract=new Contract();
		IContractServices service=new ContractServices();
		while(true) {
			System.out.println("1.Accept Order\n2.Reject Order\n3.Deleiever Product");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the ContractID");
				contract.setContractId(Integer.parseInt(sc.next()));
				System.out.println("Enter the Customer Id");
				contract.setCustId(sc.next());
				System.out.println("Enter the request id");
				contract.setRequestId(Integer.parseInt(sc.next()));
				System.out.println("Enter the transport(Haulier) type");
				contract.setHaulierId(sc.next());
				System.out.println("Enter the quantity");
				contract.setQuantity(Integer.parseInt(sc.next()));
				System.out.println("Enter the delievery date");
				contract.setDelievryDate(sc.next());
				System.out.println("Enter the Delievry Day");
				contract.setDelievryDay(sc.next());
				boolean isOrdered=service.acceptRequest(contract);
				if(isOrdered) {
					System.out.println("Deliever Product");
				}else {
		         System.err.println("Something went wrong");
				}
				break;
			case 2:
				System.out.println("Enter the request id");
				contract.setRequestId(Integer.parseInt(sc.next()));
				
				
				
			}
		}
		
	}

}
