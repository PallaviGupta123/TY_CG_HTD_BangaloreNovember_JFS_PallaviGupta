package com.capgemini.parallelprojecthibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.parallelprojecthibernate.abstraction.IHaulierService;
import com.capgemini.parallelprojecthibernate.bean.Haulier;
import com.capgemini.parallelprojecthibernate.factory.Factory;

public class HaulierLogin {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		IHaulierService service=Factory.objectHaulierService();
		System.out.println("1.Add Haulier\n2.Delete Haulier\n3.Edit Haulier\n4.Get All Haulier");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Haulier haulier=new Haulier();
			System.out.println("Enter the Driver Name");
			haulier.setDriverName(sc.next());
			System.out.println("Enter the Vehicle type");
			String vehicle=sc.next();
			haulier.setVehicleType(vehicle);
			System.out.println("Enter the Vehicle no.");
			haulier.setVehicleNo(sc.next());
			System.out.println("Enter the Cmpany Name");
			haulier.setCompanyName(sc.next());
			boolean isAdded=service.addHaulier(haulier);
			if(isAdded) {
				System.out.println("Added  Successfully");
			}else {
				System.err.println("Something went wrong");
			}break;
		case 2:
			Haulier haulier1=new Haulier();
			System.out.println("enter the id");
			int id=sc.nextInt();
			haulier1.setId(id);
			boolean isDeleted=service.deleteHaulier(id);
			if(isDeleted) {
				System.out.println("Deleted succesfully");
			}else {
				System.err.println("Something went wrong");
			}
			break;
		case 3:
			Haulier haulier2=new Haulier();
			System.out.println("Enter the haulier id");
			int haulierId=sc.nextInt();
			haulier2.setId(haulierId);;
			
			System.out.println("1.Edit Driver Name\n2.Edit Vehicle\n3.Vehicle No.\n4.Company Name");
			int choice1=sc.nextInt();
			switch(choice1) {
			case 1:System.out.println("Enter the driver name");
              haulier2.setDriverName(sc.next());
		     break;
			case 2:System.out.println("Enter the vhicle name");
			haulier2.setVehicleType(sc.next());
			break;
			case 3:System.out.println("Enter the vehicle number");
			haulier2.setVehicleNo(sc.next());
			break;
			case 4:System.out.println("Enter the company name");
			haulier2.setCompanyName(sc.next());
			break;
			}
			boolean isEdited=service.editHaulier(haulierId, haulier2);
			if(isEdited) {
				System.out.println("Edited succesfully");
			}else {
				System.err.println("Something went wrong");
			}
			break;
		case 4:
			List<Haulier> list=service.getAllHaulier();
			System.out.println(list.toString());
			break;
		}
		
		
	}


}
