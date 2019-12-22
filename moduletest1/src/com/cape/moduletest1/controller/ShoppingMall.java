package com.cape.moduletest1.controller;

import java.util.Scanner;

public class ShoppingMall {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("!!!!!!!!WELCOME TO FLIPKART MAHASALE!!!!!!!!!!!!");
		while(true) {
			System.out.println("Press the button to perform operation");
			System.out.println("1.Show All Product\n2.Search Product");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:ShowAllProduct.main();
			break;
			case 2:SearchProduct.main();
			break;
			case 3:ShoppingMall.main(args);
			break;
			}
		}
		
	}

}
