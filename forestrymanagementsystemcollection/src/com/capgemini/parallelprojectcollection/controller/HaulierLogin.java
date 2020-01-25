package com.capgemini.parallelprojectcollection.controller;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.parallelprojectcollection.abstraction.IHauliersService;
import com.capgemini.parallelprojectcollection.bean.Hauliers;
import com.capgemini.parallelprojectcollection.bean.Product;
import com.capgemini.parallelprojectcollection.exception.Forestry_AdminException;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class HaulierLogin {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		Hauliers haulier=new Hauliers();
		IHauliersService service=Factory.objectHaulierService();
		Product product=new Product();
		boolean logout=false;
		while(!logout) {
			boolean isChoiceCompleted=false;
			String choice;
			do {


				System.out.println("1.Add Haulier\n2.Get All HAulier\n3.Delete Haulier\n4.Update Haulier\n5.Exit");
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
				System.out.println("Enter Haulier id: ");
				String haulierId;
				do {
					haulierId = sc.next();
					if (Validation.isNumber(haulierId)) {
						haulier.setHaulierId(Integer.parseInt(haulierId));
					} else {
						try {
							throw new Forestry_AdminException("Please enter 3 digit id only!");
						} catch (Forestry_AdminException e) {
							e.printStackTrace();
						}
					}
				} while (!Validation.isNumber(haulierId));

				
				System.out.println("Enter Driver name: ");
				String driverName;
				do {
					driverName = sc.next();
					if (Validation.isWord(driverName)) {
						haulier.setDriverName(driverName);
					} else {
						
							throw new Forestry_AdminException("Please enter name only in alphabets!");
						} 
						
					
				} while (!Validation.isWord(driverName));



				System.out.println("Enter Company name: ");
				String companyName;
				do {
					companyName = sc.next();
					if (Validation.isWord(companyName)) {
						haulier.setCompanyName(companyName);
					} else {
						
							throw new Forestry_AdminException("Please enter name only in alphabets!");
						} 
						
					
				} while (!Validation.isWord(companyName));


				System.out.println("Enter Transport Type: ");
				String transaportType;
				do {
					transaportType = sc.next();
					if (Validation.isWord(transaportType)) {
						haulier.setTransportationType(transaportType);
					} else {
						
							throw new Forestry_AdminException("Please enter name only in alphabets!");
						} 
						
					
				} while (!Validation.isWord(transaportType));
				
				System.out.println("Enter Vehicle Number: ");
				String vehicleNumber;
				do {
					vehicleNumber = sc.next();
					if (Validation.isNumber(vehicleNumber)) {
						haulier.setVehicleNo(vehicleNumber);
					} else {
						try {
							throw new Forestry_AdminException("Please enter 3 digit id only!");
						} catch (Forestry_AdminException e) {
							e.printStackTrace();
						}
					}
				} while (!Validation.isNumber(vehicleNumber));

				
				boolean isAdded=service.addHaulier(haulier);
				if(isAdded) {
					System.out.println("Haulier Account Added Successfully");
					List<Hauliers> set=service.getAllHauliers();
					System.out.println(set.toString());
				}else {
					System.err.println("Something went wrong");
				}
				break;
			case 2:
				List<Hauliers> set=service.getAllHauliers();
				System.out.println(set.toString());
				System.out.println("Enter Haulier id: ");
				String haulierId1;
				do {
					haulierId1 = sc.next();
					if (Validation.isNumber(haulierId1)) {
						haulier.setHaulierId(Integer.parseInt(haulierId1));
					} else {
						try {
							throw new Forestry_AdminException("Please enter 3 digit id only!");
						} catch (Forestry_AdminException e) {
							e.printStackTrace();
						}
					}
				} while (!Validation.isNumber(haulierId1));
				int haulierId2=Integer.parseInt(haulierId1);
					boolean isDeleted=service.deleteHaulier(haulierId2);
					if(isDeleted) {
						System.out.println("Account is deleted successfully");
					}else {
						System.err.println("Something went wrong");
					}break;
			case 3:
				List<Hauliers> set1=service.getAllHauliers();
				System.out.println(set1.toString());
				break;
			case 4:
				boolean logou1t=false;
				while(!logout) {
					boolean isChoice=false;
					String select;
					do {


						System.out.println("1.edit driverNAme\n2.Edit Company NAme\n3.Edit Transaport Type\n4.Edit Vehicle Number\n5.Exit");
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
						System.out.println("Enter Haulier id: ");
						String haulierIdToUpate;
						do {
							haulierIdToUpate = sc.next();
							if (Validation.isNumber(haulierIdToUpate)) {
								haulier.setHaulierId(Integer.parseInt(haulierIdToUpate));

							} else {
								try {
									throw new Forestry_AdminException("Please enter 3 digit id only!");
								} catch (Forestry_AdminException e) {
									e.printStackTrace();
								}
							}
						} while (!Validation.isNumber(haulierIdToUpate));

						
						System.out.println("Enter Driver name: ");
						String driverNameToUpdate;
						do {
							driverNameToUpdate = sc.next();
							if (Validation.isWord(driverNameToUpdate)) {
								haulier.setDriverName(driverNameToUpdate);
							} else {
								
									throw new Forestry_AdminException("Please enter name only in alphabets!");
								} 
								
							
						} while (!Validation.isWord(driverNameToUpdate));



						System.out.println("Enter Company name: ");
						String companyNameToUpdate;
						do {
							companyNameToUpdate = sc.next();
							if (Validation.isWord(companyNameToUpdate)) {
								haulier.setCompanyName(companyNameToUpdate);
							} else {
								
									throw new Forestry_AdminException("Please enter name only in alphabets!");
								} 
								
							
						} while (!Validation.isWord(companyNameToUpdate));


						System.out.println("Enter Transport Type: ");
						String transaportTypeToUpdate;
						do {
							transaportTypeToUpdate = sc.next();
							if (Validation.isWord(transaportTypeToUpdate)) {
								product.setProductName(transaportTypeToUpdate);
							} else {
								
									throw new Forestry_AdminException("Please enter name only in alphabets!");
								} 
								
							
						} while (!Validation.isWord(transaportTypeToUpdate));
						
						System.out.println("Enter Vehicle Number: ");
						String vehicleNumberToUpdate;
						do {
							vehicleNumberToUpdate = sc.next();
							if (Validation.isWord(vehicleNumberToUpdate)) {
								haulier.setVehicleNo(vehicleNumberToUpdate);
							} else {
								try {
									throw new Forestry_AdminException("Please enter 3 digit id only!");
								} catch (Forestry_AdminException e) {
									e.printStackTrace();
								}
							}
						} while (!Validation.isNumber(vehicleNumberToUpdate));
						
						int haulierIdToUpate1=Integer.parseInt(haulierIdToUpate);
						boolean isUpdate=service.editHaulier(haulierIdToUpate1, haulier);
						if(isUpdate) {
							System.out.println("Haulier Deatils Updated Sccessfully");
						}
						else {
							System.err.println("Something went Wrong");
						}
						
					}
				}
				break;
			case 5:
				AdminLogin.main(null);
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
