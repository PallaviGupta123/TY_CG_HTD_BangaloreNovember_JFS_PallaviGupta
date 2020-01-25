package com.capgemini.forestrymanagementsystem.controller;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.ValidationException;

import com.capgemini.forestrymanagementsystem.abstraction.IClientService;
import com.capgemini.forestrymanagementsystem.abstraction.IProductService;
import com.capgemini.forestrymanagementsystem.bean.Client;
import com.capgemini.forestrymanagementsystem.exception.SystemUnavailableException;
import com.capgemini.forestrymanagementsystem.factory.Factory;

public class AdminHome {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		Client customer=new Client();

		IClientService service=Factory.objectClientService();
		IProductService service1=Factory.objectProductService();
		//Client customer=new Client();
		boolean logout=false;
		while(!logout) {
			boolean isChoiceCompleted=false;
			String choice;
			do {

				System.out.println("1.Add Customer\n2.GetAll Customer\n3.Delete Customer");
				System.out.println("______________");
				System.out.println("4Product");
				System.out.println("________________");
				System.out.println("5.Haulier\n6.Logout");
				choice=sc.next();
				String choiceregex="^[0-6]$";
				Pattern choicePattern =Pattern.compile(choiceregex);
				Matcher choiceMatch=choicePattern.matcher(choice);
				if(!choiceMatch.matches()) {
					System.err.println("Always in number format between 1 to 6");
				}
				else {
					isChoiceCompleted=true;
				}
			}
			while(!isChoiceCompleted);			

			switch(Integer.parseInt(choice)) {
			case 1:
				try {
					Client client=new Client();


					System.out.println("Enter customer name: ");
					String customerName=null;
					do {
						try {
							customerName = sc.next();
							if (Validation.isWord(customerName)) {
								client.setCustName(customerName);
							} else {

								throw new ValidationException("Please enter name only in alphabets!");
							} 
						}
						catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());


						}
					} while (!Validation.isWord(customerName));


					System.out.println("Enter street address1: ");
					String streetAdd1=null;
					do {
						try {
							streetAdd1 = sc.next();
							if (Validation.isWord(streetAdd1)) {
								client.setStreetAdd1(streetAdd1);
							} else {

								throw new ValidationException("Please enter name only in alphabets!");
							} 
						}
						catch (ValidationException validationException) {

							System.err.println(validationException.getMessage());
						}

					} while (!Validation.isWord(streetAdd1));



					System.out.println("Enter street address2: ");
					String streetAdd2=null;
					do {
						try {
							streetAdd2 = sc.next();
							if (Validation.isWord(streetAdd2)) {
								client.setStreetAdd2(streetAdd2);
							} else {

								throw new ValidationException("Please enter name only in alphabets!");
							}
						}
						catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}

					} while (!Validation.isWord(streetAdd2));



					System.out.println("Enter City: ");
					String city=null;
					do {
						try {
							city = sc.next();
							if (Validation.isWord(city)) {
								client.setTown(city);
							} else {

								throw new ValidationException("Please enter town only in alphabets!");
							}
						}catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}

					} while (!Validation.isWord(city));

					System.out.println("Enter Zip code: ");
					String code=null;
					do {
						try {
							code = sc.next();
							if (Validation.isPostalCode(code)) {
								client.setZipCode(code);
							} else {
								throw new ValidationException("Please enter only 6 digit postal code!");
							} 
						}catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}

					} while (!Validation.isPostalCode(code));

					System.out.println("Enter email: ");
					String email =null;
					do {
						try {
							email = sc.next();
							if (Validation.valEmail(email)) {
								client.setEmail(email);
							} else {
								throw new ValidationException("Please enter valid email-id!");
							} 
						}
						catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}

					} while (!Validation.valEmail(email));

					System.out.println("Enter telephone number: ");
					String phoneNumber =null;
					do {
						try {
							phoneNumber = sc.next();
							if (Validation.isTelePhoneNumber(phoneNumber)) {
								client.setMobileNo(Integer.parseInt(phoneNumber));
							} else {

								throw new ValidationException("Please enter valid 10 digit telephone number!");
							} 
						}
						catch (ValidationException validationException) {
							System.err.println(validationException.getMessage());
						}

					}
					while (!Validation.isTelePhoneNumber(phoneNumber));

					boolean isAdded=service.addCustomer(client);

					if (isAdded) 
					{
						System.out.println("Customer is added successfully.");
					} else {
						System.err.println("Something went wrong. Please contact Administrator.");
					}
					break;
				}
				catch(SystemUnavailableException ex)
				{
					System.err.println(ex.getMessage());	
					break;
				}
				catch( Exception ex)
				{
					System.err.println("Something went wrong. Please contact Administrator.");
					break;
				}
			case 2:
				List<Client> list=service.getAllCustomer();
				System.out.println(list.toString());
				break;
			case 3:
				Client client1=new Client();
				System.out.println("Enter customer id: ");
				String custtomerId =null;
				do {
					try {
						custtomerId = sc.next();
						if (Validation.isNumber(custtomerId)) {
							client1.setCustId(Integer.parseInt(custtomerId));
						} else {
							throw new ValidationException("Please enter 4 digit id in number format!");
						} 
					}
					catch (ValidationException validationException) {
						System.out.println(validationException.getMessage());
					}

				} while (!Validation.isNumber(custtomerId));

				int customerId1=Integer.parseInt(custtomerId);
				boolean isDeleted=service.deleteCustomer(customerId1);

				if (isDeleted) {
					System.out.println("Customer deleted...");
				} else {
					System.err.println("Something went wrong...");
				}
				break;

			case 4:ProductHome.main();
			break;

			case 5:
				HaulierLogin.main();

				break;
			case 6:
				AdminLogin.main(null);
				break;
			}   
		}
	}
}

