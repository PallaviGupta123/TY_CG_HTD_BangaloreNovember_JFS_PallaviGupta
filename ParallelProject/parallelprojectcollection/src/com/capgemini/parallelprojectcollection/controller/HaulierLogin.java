package com.capgemini.parallelprojectcollection.controller;

import java.util.Scanner;
import java.util.Set;

import com.capgemini.parallelprojectcollection.abstraction.IHauliersService;
import com.capgemini.parallelprojectcollection.bean.Hauliers;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class HaulierLogin {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		Hauliers haulier=new Hauliers();
		IHauliersService service=Factory.objectHaulierService();
		while(true) {
			System.out.println("1.Add Haulier\n2.DeleteAccount\n3.Get All\n4.Edit Profile\n5.Exit");
			int choice=Integer.parseInt(sc.next());
			switch(choice) {
			case 1:
				System.out.println("Enter the Haulier Id");
				haulier.setHaulierId(sc.next());
				System.out.println("Enter the Company Name");
				haulier.setCompanyName(sc.next());
				System.out.println("Enter the Driver Name");
				haulier.setDriverName(sc.next());
				System.out.println("Enter the transaport type");
				haulier.setTransportationType(sc.next());
				System.out.println("Enter the vehicle type");
				haulier.setVehicleNo(sc.next());;
				boolean isAdded=service.addHaulier(haulier);
				if(isAdded) {
					System.out.println("Haulier Account Added Successfully");
					Set<Hauliers> set=service.getAllHauliers();
					System.out.println(set.toString());
				}else {
					System.err.println("Something went wrong");
				}
				break;
			case 2:
				Set<Hauliers> set=service.getAllHauliers();
				System.out.println(set.toString());
					System.out.println("Enter the Haulier ID");
					String id=sc.next();
					haulier.setHaulierId(id);
					boolean isDeleted=service.deleteHaulier(id);
					if(isDeleted) {
						System.out.println("Account is deleted successfully");
					}else {
						System.err.println("Something went wrong");
					}break;
			case 3:
				Set<Hauliers> set1=service.getAllHauliers();
				System.out.println(set1.toString());
				break;
				 
			case 4:
				AdminLogin.main(null);
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
