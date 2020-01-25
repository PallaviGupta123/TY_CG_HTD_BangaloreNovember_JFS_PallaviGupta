package com.capgemini.parallelprojectcollection.controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import javax.xml.bind.ValidationException;

import com.capgemini.parallelprojectcollection.abstraction.IContractServices;
import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.services.ContractServices;

public class ContractLogin {
	@SuppressWarnings("unused")
	public static void main() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		IContractServices service=new ContractServices();
		boolean logout=false;
		while(!logout) {
			boolean isChoiceCompleted=false;
			String choice;
			do {


				System.out.println("1.Deliever Order\n2.Reject Order \n3.Get All Order\n4.Update Order\n5.Exit");
				choice=sc.next();
				String choiceregex="^[1-5]$";
				Pattern choicePattern =Pattern.compile(choiceregex);
				Matcher choiceMatch=choicePattern.matcher(choice);
				if(!choiceMatch.matches()) {
					System.err.println("Always in number format between 1 to 5");
				}
				else {
					isChoiceCompleted=true;
				}
			}while(!isChoiceCompleted);
			switch(Integer.parseInt(choice)) {
			case 1:
				Contract contract=new Contract();
				System.out.println("Enter Contract id: ");
				String contractId=null;
				do {
					try {
					contractId = sc.next();
					if (Validation.isNumber(contractId)) {
						contract.setContractId(Integer.parseInt(contractId));
					} else {
						
							throw new ValidationException("Please enter 3 digit id only!");
						} 
					}
					catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}
					
				} while (!Validation.isNumber(contractId));
				
				
				System.out.println("Enter Customer Id: ");
				String customerID=null;
				do {
					try {
						customerID = sc.next();
					if (Validation.isNumber(customerID)) {
						contract.setCustId(Integer.parseInt(customerID));
					} else {
						
							throw new ValidationException("Please enter 3 digit id only!");
						} 
					}
					catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}
					
				} while (!Validation.isNumber(customerID));	
				
				System.out.println("Enter Haulier Id: ");
				String haulerId=null;
				do {
					try {
						haulerId = sc.next();
					if (Validation.isNumber(haulerId)) {
						contract.setHaulierId(Integer.parseInt(customerID));
					} else {
						
							throw new ValidationException("Please enter 3 digit id only!");
						} 
					}
					catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}
					
				} while (!Validation.isNumber(haulerId));	
				
				System.out.println("Enter Request Id: ");
				String requestID=null;
				do {
					try {
						requestID = sc.next();
					if (Validation.isNumber(requestID)) {
						contract.setRequestId(Integer.parseInt(requestID));
					} else {
						
							throw new ValidationException("Please enter 3 digit id only!");
						} 
					}
					catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}
					
				} while (!Validation.isNumber(requestID));
				
				
				System.out.println("Enter the  Quantity: ");
				String quantity=null;
				do {
					try {
						quantity = sc.next();
					if (Validation.isNumber(quantity)) {
						contract.setQuantity(Integer.parseInt(quantity));
					} else {
						
							throw new ValidationException("Please enter 3 digit id only!");
						} 
					}
					catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}
					
				} while (!Validation.isNumber(requestID));
				System.out.println("Enter the delievery date");
				contract.setDelievryDate(sc.next());
				
				boolean isOrdered=service.delieverOrder(contract);
				if(isOrdered) {
					System.out.println("Deliever Product");
				}else {
		         System.err.println("Something went wrong");
				}
				break;
			case 2:
				Contract contractRejectBean=new Contract();
				System.out.println("Enter Contract id: ");
				String contractRejectId=null;
				do {
					try {
					contractId = sc.next();
					if (Validation.isNumber(contractRejectId)) {
						contractRejectBean.setContractId(Integer.parseInt(contractRejectId));
					} else {
						
							throw new ValidationException("Please enter 3 digit id only!");
						} 
					}
					catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}
					
				} while (!Validation.isNumber(contractRejectId));
				int contractRejectId1=Integer.parseInt(contractRejectId);
				
				boolean isDeleted=service.rejectOrder(contractRejectId1);
				if(isDeleted) {
					System.out.println("Ordder Rejecteed Successfully");
				}
				else {
					System.err.println("Order IS not Rejcted");
				}
				break;
			case 3: 
				Contract contractBean=new Contract();
				System.out.println("Enter Contract id: ");
				String contractIdToUpdate=null;
				do {
					try {
						contractIdToUpdate = sc.next();
					if (Validation.isNumber(contractIdToUpdate)) {
						contractBean.setContractId(Integer.parseInt(contractIdToUpdate));
					} else {
						
							throw new ValidationException("Please enter 3 digit id only!");
						} 
					}
					catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}
					
				} while (!Validation.isNumber(contractIdToUpdate));
				int contractIdToUpdate1=Integer.parseInt(contractIdToUpdate);
				
				
				boolean logoutUpdate=false;
				while(!logoutUpdate) {
					boolean isChoiceCompletedUpdate=false;
					String choiceUpdate=null;
					do {


						System.out.println("1.Edit Customer Id\n2.Edit  Request Id \n3.Edit  Haulier Id\n4.Exit");
						choice=sc.next();
						String choiceregex="^[1-5]$";
						Pattern choicePattern =Pattern.compile(choiceregex);
						Matcher choiceMatch=choicePattern.matcher(choice);
						if(!choiceMatch.matches()) {
							System.err.println("Always in number format between 1 to 5");
						}
						else {
							isChoiceCompletedUpdate=true;
						}
					}while(!isChoiceCompletedUpdate);
					switch(Integer.parseInt(choiceUpdate)) 
					{
					
					
					case 1:
						Contract contractUpdateBean=new Contract();
						System.out.println("Enter Customer Id: ");
					String customerIDToUpate=null;
					do {
						try {
							customerIDToUpate = sc.next();
						if (Validation.isNumber(customerIDToUpate)) {
							contractUpdateBean.setCustId(Integer.parseInt(customerIDToUpate));
						} else {
							
								throw new ValidationException("Please enter 3 digit id only!");
							} 
						}
						catch (ValidationException validationException) {
								System.err.println(validationException.getMessage());
							}
						
					} while (!Validation.isNumber(customerIDToUpate));	
					int customerIDToUpate1=Integer.parseInt(customerIDToUpate);
					if(service.updateOrder(customerIDToUpate1, contractBean))
					{
						System.out.println("Customer Id Updated Successfully");
					}
					else {
						System.err.println("Customer Id is updated");
					}
					case 2:
						Contract contractUpdateRequestBean=new Contract();
						System.out.println("Enter Request Id: ");
						String requestIdToUpdate=null;
						do {
							try {
								requestIdToUpdate = sc.next();
							if (Validation.isNumber(requestIdToUpdate)) {
								contractUpdateRequestBean.setRequestId(Integer.parseInt(requestIdToUpdate));
							} else {
								
									throw new ValidationException("Please enter 3 digit id only!");
								} 
							}
							catch (ValidationException validationException) {
									System.err.println(validationException.getMessage());
								}
							
						} while (!Validation.isNumber(requestIdToUpdate));
						int requestIdToUpdate1=Integer.parseInt(requestIdToUpdate);
						if(service.updateOrder(requestIdToUpdate1, contractBean))
						{
						System.out.println("Request Id Updated Successfulyy");	
						}
						else {
							System.err.println("Request Id is not updated");
						}
					case 3: 
						Contract contractHaulierBean=new Contract();
						System.out.println("Enter Haulier Id: ");
						String haulerIdToUpdate=null;
						do {
							try {
								haulerIdToUpdate = sc.next();
							if (Validation.isNumber(haulerIdToUpdate)) {
								contractHaulierBean.setHaulierId(Integer.parseInt(haulerIdToUpdate));
							} else {
								
									throw new ValidationException("Please enter 3 digit id only!");
								} 
							}
							catch (ValidationException validationException) {
									System.err.println(validationException.getMessage());
								}
							
						} while (!Validation.isNumber(haulerIdToUpdate));	
						int haulerIdToUpdate1=Integer.parseInt(haulerIdToUpdate);
						if(service.updateOrder(haulerIdToUpdate1, contractBean));
							System.out.println("Haulier Id is successg=fully update");
						
						{
							System.err.println("Hauier ID is not updated");
						}
					}
					
						
					}
			break;
			case 4:
				AdminLogin.main(null);
				
				
			}
		}
		
	}

}
