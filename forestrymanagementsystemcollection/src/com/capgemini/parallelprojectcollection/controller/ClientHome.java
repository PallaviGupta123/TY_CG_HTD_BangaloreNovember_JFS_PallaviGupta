package com.capgemini.parallelprojectcollection.controller;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.parallelprojectcollection.abstraction.IClientService;
import com.capgemini.parallelprojectcollection.abstraction.IProductService;
import com.capgemini.parallelprojectcollection.abstraction.IRequestService;
import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.bean.Product;
import com.capgemini.parallelprojectcollection.bean.Request;
import com.capgemini.parallelprojectcollection.exception.ValidationException;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class ClientHome {
	public static void main(int custId) {
		Scanner sc=new Scanner(System.in);
		Request request=new Request();
		Client client=new Client();
		IRequestService service=Factory.objectRequestService();
		IProductService service2=Factory.objectProductService();
		
		IClientService clientService=Factory.objectClientService();
		Client client2=clientService.getCustomerbyID(custId);
		List<Product> list1=service2.getAllProduct();
		System.out.println(list1.toString());

		while(true) {
			System.out.println("1.Place Order\n2.Cancel Order\n3.View Total Order\n4.Exit\n5.Update Profile ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				Request requestBean=new Request();
				System.out.println("Enter Request Id: ");
				String requestId=null;
				do {
					try {
						requestId = sc.next();
					if (Validation.isNumber(requestId)) {
						requestBean.setRequestId(Integer.parseInt(requestId));
					} else {
							throw new ValidationException("Please enter 3 digit id only!");
						} 
					}catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}
				} while (!Validation.isNumber(requestId));
	
					System.out.println("Enter Product Id: ");
				String productId=null;
				boolean isMatch=true;
				do {
					try {
						productId = sc.next();
					if (Validation.isNumber(productId)) {
						int prodId=Integer.parseInt(productId);

						if(service2.isProductIdExist(prodId))
						{			
							System.err.println("Product Id already Exist!!!");
							isMatch=false;
						}
						else
						{
							requestBean.setProductId(Integer.parseInt(productId));
							isMatch=true;
						}
						} 
					else {
							throw new ValidationException("Please enter 3 digit id only!");
						} 
					}
					catch (ValidationException validationException) 
					{
							System.err.println(validationException.getMessage());
						}	
			} while (!Validation.isNumber(productId));
				System.out.println("Enter customer id: ");
				String customerId=null;
				do {try {
					customerId = sc.next();
					if (Validation.isNumber(customerId)) {
						request.setCustomerId(Integer.parseInt(customerId));
					} else {
						
							throw new ValidationException("Please enter 3 digit id only!");
						} 
				}
				catch (ValidationException validationException) {
					
						System.err.println(validationException.getMessage());
					}
				} while (!Validation.isNumber(customerId));
				
				System.out.println("Enter Stock : ");
				String stock=null;
				do {
					try {
						stock = sc.next();
					if (Validation.isNumber(stock)) {
						requestBean.setRequestId(Integer.parseInt(stock));
					} else {
							throw new ValidationException("Please enter 3 digit id only!");
						} 
					}catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}
				} while (!Validation.isNumber(stock));
				
			    boolean isRequested=service.createRequest(request);
			    if(isRequested) {
			    	System.out.println("Order Placed Successfully");	
			    }else {
			    	System.err.println("Something went wrong");
			    }
			    break;
			    
			case 2:
				Request requestDeleteBean=new Request();
				System.out.println("Enter the Request Id : ");
			String requestId1=null;
			do {
				try {
					requestId1 = sc.next();
				if (Validation.isNumber(requestId1)) {
					requestDeleteBean.setRequestId(Integer.parseInt(requestId1));
				} else {
						throw new ValidationException("Please enter 3 digit id only!");
					} 
				}catch (ValidationException validationException) {
						System.err.println(validationException.getMessage());
					}
			} while (!Validation.isNumber(requestId1)); 
			int requestId2=Integer.parseInt(requestId1);
			     
			     boolean isDelelted=service.cancelOrder(requestId2);
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
			case 4:
				AdminHome.main();
				break;
			case 5:
				while(true) {
				System.out.println("1.Edit Email\n2.Edit Telephone\n3.Edit City\n4.Edit zipcode\n5.Back To Home\n6.Exit");
				int count=sc.nextInt();
				System.out.println("Enter the customerID");
				int id1=Integer.parseInt(sc.next());
				Client client1=new Client();
				client1.setCustId(id1);
				switch(count) {
				case 1:
					// Validation for email;
					boolean flag4;
					do {
						String pattern="^(.+)@(.+)\\.(.+)?$";
						System.out.println("enter the email ");
						String email=sc.next();
						flag4=email.matches(pattern);
						if(!flag4)System.err.println("OOPs!!!Must Be Digit Intger Number ");
						else {
							client1.setEmail(email);
						}	
					}while(!flag4);
					boolean isUpdated=clientService.updateCustomer(id1, client1);
					if(isUpdated)
					{
						System.out.println("Profile Upated");
					}
					else {
						System.err.println("Profile is not update");
					}
					
					break;
				case 2:
					Client clientUpdate=new Client();
					boolean flag5=true;
					String telephone;
					do {
						System.out.println("Enter the Telephone number");
					 telephone=sc.next();
					 clientUpdate.setMobileNo(Integer.parseInt(telephone));
					String regex5="^[0-9]{3,15}$";
					Pattern pattern5 =Pattern.compile(regex5);
					Matcher matcher5=pattern5.matcher(telephone);
					if(!matcher5.matches()) {
						System.err.println("OOPSS ONLY NUMBER IS VALID!!!");
				//=false;
					}else {
						clientUpdate.getMobileNo();
						flag5=true;
					}
				}while(flag5!=true);
					
					boolean isTelePhoneUpdate=clientService.updateCustomer(custId, clientUpdate);
					if(isTelePhoneUpdate) {
						System.out.println("Profile Updated Scuccessfully");
					}
					else {
						System.err.println("Profile Not Updated");
					}
				case 3:
					Client clientAddressBean=new Client();
					boolean flag2=true;
					do {
						System.out.println("Enter the Address ");
						String address=sc.next();
						clientAddressBean.setTown(address);
						String regex="^[A-Za-z]{3,15}$";
						Pattern pattern2 =Pattern.compile(regex);
						Matcher matcher2=pattern2.matcher(address);
						if(!matcher2.matches()) {
							System.err.println("OOPSS ONLY ALPHABET AND NUMBER IS VALID!!!");
							flag2=false;
						}else {
							clientAddressBean.getTown();
							flag2=true;
						}
					}while(flag2!=true);
					boolean isUpdate=clientService.updateCustomer(custId, clientAddressBean);
					if(isUpdate) {
						System.out.println("Profile Updated Successfuly");
					}else {
						System.err.println("Something went wrongs");
					}
				case 4:
					Client clientZipCodeBean=new Client();
					boolean flag01;
					do {
						String pattern="^[1-9][0-9]{5}$";
						System.out.println("enter the zip code");
						String code=sc.next();
						flag01=code.matches(pattern);
						if(!flag01)System.err.println("OOPs!!!Must Be Digit Intger Number ");
						else {
							clientZipCodeBean.setZipCode(code);
							flag01=true;
						}	
					}while(!flag01);
				
				boolean isEdited=clientService.updateCustomer(custId, clientZipCodeBean);
				if(isEdited) {
					System.out.println("Edit successfully");
				}else {
					System.err.println("Something went wrong");
				}
						
				case 5:
					ClientHome.main(custId);
				break;
				case 6:
					AdminHome.main();
					break;
				}
				}
				
				case 7:
					AdminHome.main();
					break;
				}
			
		
		
	}
	}
}

