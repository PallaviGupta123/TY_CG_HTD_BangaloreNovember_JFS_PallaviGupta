package com.cape.moduletestjdbc.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.cape.moduletestjdbc.bean.Contact;
import com.cape.moduletestjdbc.factory.ContactFactory;
import com.cape.moduletestjdbc.services.ContactServices;

public class ContactMain {
	public static void main(String[] args) {
		
	ContactServices services=ContactFactory.instanceOfServices();
		List<Contact> list=new ArrayList<Contact>();
		Scanner sc=new Scanner(System.in);
		int choice =sc.nextInt();
		while(true) {
			System.out.println("Enter 1 to add Contact");
			System.out.println("Enter 2 to get All details");
			System.out.println("Enter 3 to delete conatct");
			System.out.println("Enter 4 to search contact");
			System.out.println("Enter 5 to update contact");
		switch(choice)
		{
		case 1:
			System.out.println("Enter the Contact List");
			Contact contact=new Contact();
			System.out.println("Enter the Name Of person");
			contact.setName(sc.next());
			System.out.println("Enter the number if person");
			contact.setNumber(Integer.parseInt(sc.next()));
			System.out.println("Enter the group");
			contact.setGroup(sc.next());
			boolean b1=services.addContact(contact);
			if(b1==true)
			{
				System.out.println("Sucesesfulle added");
			}else {
				System.out.println("Something went wrong");
			}
			break;
		
		case 2:
			List<Contact> c1= services.getAllContactList();
			System.out.println(c1);
			break;
			
		case 3:
			System.out.println("Delete user");
			System.out.println("Enter the contact number you want to delete");
			int p=sc.nextInt();
			boolean b=services.deleteContact(p);
			if(b==true)
			{
				System.out.println("customer deleted sucessfuly");
			}
			else
			{
				System.out.println("Something went wrong");
			}
			break;
		case 4:
			System.out.println("Enter the name to serach a number");
			String s=sc.next();
			Contact conn=new Contact();
			List<Contact> b4=services.search(s, conn);
			
			
			
		}			
		}
		
	}

}
