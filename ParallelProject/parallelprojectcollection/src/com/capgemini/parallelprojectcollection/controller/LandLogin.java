package com.capgemini.parallelprojectcollection.controller;

import java.util.Scanner;
import java.util.Set;

import com.capgemini.parallelprojectcollection.abstraction.ILandService;
import com.capgemini.parallelprojectcollection.bean.Land;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class LandLogin {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		Land land=new Land();
		ILandService service=Factory.objectLandService();
		Set<Land> set=service.getAllDetail();
		while(true) {
			System.out.println("1.Add Land\n2.Delete Land\n3.Edit Detail\n4.GetAllDeatils\n5.Back to home");
			int choice=Integer.parseInt(sc.next());
			switch(choice) {
			case 1:
				System.out.println("Enter the Land ID");
				int id=Integer.parseInt(sc.next());
				land.setLandId(id);
				System.out.println("Enter the LandType");
				String type=sc.next();
				land.setLandType(type);
				System.out.println("Enter the Area");
				String area=sc.next();
				land.setArea(area);
				System.out.println("enter the location");
			     land.setLocation(sc.next());
			     System.out.println("Enter the document");
			     land.setDocument(sc.next());
			     System.out.println("Enter the rights/Law avaliable for Land ");
			     land.setRights(sc.next());
			     boolean isAdded=service.addLandDetails(land);
				if(isAdded) {
					System.out.println("Land Deatils Added succssfuly");
				}else {
					System.err.println("Something went wrong");
				}
				break;
			case 2:
				Set<Land> set1=service.getAllDetail();
				System.out.println("Enter the Land Id");
				int id1=Integer.parseInt(sc.next());
				land.setLandId(id1);
				boolean isDeleted=service.deleteLandDetails(id1);
				if(isDeleted) {
					System.out.println("Deletd successfully");
				}else {
					System.err.println("something went wrong");
				}
				break;
			case 3:Set<Land>set2=service.getAllDetail();
			System.out.println(set2.toString());
			break;
			case 4:AdminLogin.main(null);
			break;
				
			}
		}
	}

}
