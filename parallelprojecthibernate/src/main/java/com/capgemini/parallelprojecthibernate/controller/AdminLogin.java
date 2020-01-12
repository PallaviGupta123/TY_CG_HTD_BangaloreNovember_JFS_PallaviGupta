
package com.capgemini.parallelprojecthibernate.controller;

import java.util.Scanner;

import com.capgemini.parallelprojecthibernate.abstraction.IAdminService;
import com.capgemini.parallelprojecthibernate.abstraction.IClientService;
import com.capgemini.parallelprojecthibernate.bean.Admin;
import com.capgemini.parallelprojecthibernate.bean.Client;
import com.capgemini.parallelprojecthibernate.factory.Factory;

public class AdminLogin {
	public static void main(String[] args) {
		IAdminService service=Factory.objectService();
		IClientService service1=Factory.objectClientService();
		boolean isAdminLoginSuccessfull=false;
		Scanner sc=new Scanner(System.in);
		Admin admin=new Admin();
		Client client=new Client();
		System.out.println("WELCOME TO FORESTRY MANAGEMENT SYSTEM");
		boolean isReturnMain=false;
		while(!isReturnMain) {
			System.out.println("1.Admin\n2.Client\n3.Contract\n4.Return to Home");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				while(!isAdminLoginSuccessfull) {
					System.out.println("Enter the user name");
					String username=sc.next();
					admin.setAdminName(username);

					System.out.println("Enter the password");
					String password=sc.next();
					admin.setAdminPassword(password);
					Admin adminResponse=service.adminLogin(username,password);

					if(adminResponse==null) {
						System.err.println("UnAuthorised user");
					}else {
						isAdminLoginSuccessfull=true;
						System.out.println("Login successfull`");
						//isAdminLoginSuccessfull=true;
						AdminHome.main(adminResponse);
						break;
					}
				}
				break;
			case 2:
				boolean isClientLoginSuccessfully=false;
				while(!isClientLoginSuccessfully) {
					System.out.println("Enter the custName");
					client.setCustomername(sc.next());
					System.out.println("Enter the password");
					client.setPassword(sc.next());
					Client clientRespons=service1.clientLogin(client);
					if(clientRespons==null) {
						System.err.println("UnAuthorised client");
					}
					else {
						isClientLoginSuccessfully=true;
						System.out.println("Client Login sucessfully");
						ClientHome.main(clientRespons.getId());
						break;
					}
				}
			case 3: ContractLogin.main();
			break;
			case 4:AdminLogin.main(args);
			break;


			}
		}
	}

}
