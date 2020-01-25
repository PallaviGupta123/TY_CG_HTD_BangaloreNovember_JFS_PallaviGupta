
package com.capgemini.forestrymanagementsystem.controller;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.forestrymanagementsystem.abstraction.IAdminService;
import com.capgemini.forestrymanagementsystem.abstraction.IClientService;
import com.capgemini.forestrymanagementsystem.abstraction.IContractServices;
import com.capgemini.forestrymanagementsystem.abstraction.IContractorDetailService;
import com.capgemini.forestrymanagementsystem.bean.Admin;
import com.capgemini.forestrymanagementsystem.bean.Client;
import com.capgemini.forestrymanagementsystem.bean.ContractorDetail;
import com.capgemini.forestrymanagementsystem.exception.UnauthorisedException;
import com.capgemini.forestrymanagementsystem.factory.Factory;

public class AdminLogin {
	public static void main(String[] args) {
		try {
			IAdminService service=Factory.objectService();
			IClientService service1=Factory.objectClientService();
			IContractorDetailService serviceContractor=Factory.getContractorServiceDetail();
			boolean isAdminLoginSuccessfull=false;
			Scanner sc=new Scanner(System.in);
			Admin admin=new Admin();
			Client client=new Client();		

			System.out.println("WELCOME TO FORESTRY MANAGEMENT SYSTEM");

			boolean isReturnMain=false;
			while(!isReturnMain)
			{
				boolean isChoiceCompleted=false;
				String choice;
				do {

					System.out.println("1.Admin\n2.Client\n3.Contract\n4.Exit");

					choice=sc.next();
					String choiceregex="^[0-4]$";
					Pattern choicePattern =Pattern.compile(choiceregex);
					Matcher choiceMatch=choicePattern.matcher(choice);
					if(!choiceMatch.matches()) {
						System.err.println("Always in number format between 1 to 4");
					}
					else {
						isChoiceCompleted=true;
					}
				}while(!isChoiceCompleted);
				switch(Integer.parseInt(choice)) {
				case 1:
					while(!isAdminLoginSuccessfull) {
						try {
							System.out.println("Enter the user id");
							String userId=sc.next();
							admin.setUserid(userId);

							System.out.println("Enter the password");
							String password=sc.next();
							admin.setPassword(password);

							Admin adminResponse=service.adminLogin(admin);

							if(adminResponse==null) {
								throw new UnauthorisedException("User Is not authoriesd");
							}else {
								isAdminLoginSuccessfull=true;
								System.out.println("Login successfull");
								System.out.println("Hello "+  adminResponse.getName()+"!!");
								//Giving some space before moving to next
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								
								AdminHome.main();
								break;
							}
						}

						catch(UnauthorisedException unauthorisedException)
						{
							System.err.println("UnAuthorised user");
						}
						catch(Exception e1) {
							System.err.println("Some error occured, Please try again.");
						}
					}

					break;
				case 2:
					boolean isClientLoginSuccessfully=false;
					while(!isClientLoginSuccessfully) {
						try {
							System.out.println("Enter the custid");
							client.setCustName(sc.next());
							System.out.println("Enter the password");
							client.setPassword(sc.next());
							Client clientRespons=service1.clientLogin(client);
							if(clientRespons==null) {
								throw new UnauthorisedException("UnAuthorised client");
							}
							else {
								isClientLoginSuccessfully=true;
								System.out.println("Client Login sucessfully");
								ClientHome.main(clientRespons.getCustId());
								break;
							}
						}

						catch(UnauthorisedException unauthorisedException) {
							System.err.println("UnAuthorised client");
						}
					}
				case 3:	
					
					ContractorDetail contractorDeatil=new ContractorDetail();
					boolean isContractLoginScuccessfully=false;
				while(!isContractLoginScuccessfully) {
					try {
						System.out.println("Enter the userId");
						contractorDeatil.setUserId(sc.next());
						System.out.println("Enter the password");
						contractorDeatil.setPassword(sc.next());
						ContractorDetail contractResponse=serviceContractor.contractLogin(contractorDeatil);
						if(contractResponse==null) {
							throw new UnauthorisedException("UnAuthorised Contractor");
						}
						else {
							isContractLoginScuccessfully=true;
							System.out.println("Contractor Login sucessfully");
							System.out.println("Hello "+contractResponse.getName()+"!!");
							System.out.println("");
							System.out.println("");
							
							ContractLogin.main(contractResponse.getId());
							break;
						}
					}

					catch(UnauthorisedException unauthorisedException) {
						System.err.println("UnAuthorised Contractor");
					}
				}
				break;
				case 4:AdminLogin.main(args);
				break;

				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}