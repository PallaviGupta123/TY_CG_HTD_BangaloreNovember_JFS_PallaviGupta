
package com.capgemini.parallelprojectcollection.controller;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.parallelprojectcollection.abstraction.IAdminService;
import com.capgemini.parallelprojectcollection.abstraction.IClientService;
import com.capgemini.parallelprojectcollection.bean.Admin;
import com.capgemini.parallelprojectcollection.bean.Client;

import com.capgemini.parallelprojectcollection.exception.UnauthorisedException;
import com.capgemini.parallelprojectcollection.factory.Factory;


public class AdminLogin {
	public static void main(String[] args) {
		try {
			IAdminService service=Factory.objectService();
			IClientService service1=Factory.objectClientService();
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
				
					System.out.println("1.Admin\n2.Client\n3.Contract\n4Exit");

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
								System.out.println("Login successfull`");
								//isAdminLoginSuccessfull=true;
								AdminHome.main();
								break;
							}
						}

						catch(UnauthorisedException unauthorisedException)
						{
							System.err.println("UnAuthorised user");
						}
						catch(Exception e1) {
							e1.printStackTrace();
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
				case 3: ContractLogin.main();
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