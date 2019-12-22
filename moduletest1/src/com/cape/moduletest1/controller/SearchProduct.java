package com.cape.moduletest1.controller;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

import com.cape.moduletest1.bean.ProductBean;
import com.cape.moduletest1.factory.Factory;
import com.cape.moduletest1.service.ProductService;

public class SearchProduct 
{ 
	public static void main() {

	ProductService service=Factory.getService();
	Scanner sc=new Scanner(System.in);
	ProductBean bean=new ProductBean();
	System.out.println("Enter the name to search the product");
	String pname=sc.next();
	while(true) {
		System.out.println("1.Buy\n2.search\n3.home");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the pid");
			int pid=Integer.parseInt(sc.next());
			bean.setPid(pid);
			System.out.println("enter the pname");
			String pName=sc.next();
			bean.setPname(pName);
			System.out.println("Enter the color");
			String color=sc.next();
			bean.setColor(color);
			System.out.println("enter the cost of product");
			int cost=Integer.parseInt(sc.next());
			bean.setCost(cost);
			System.out.println("enter the Description of product");
			String desp=sc.next();
			bean.setDescription(desp);
			System.out.println("Enter total product");
			int total=Integer.parseInt(sc.next());
			bean.setTotalProduct(total);
			boolean isBuy=service.buyProduct(bean);
			if(isBuy) {
				System.out.println("User buy");
			}else{
			System.err.print("wrong");	
			}
		case 2:
			ProductBean bean1=new ProductBean();
			System.out.println("enter the prodcut name");
			String name=sc.next();
			bean1.setPname(name);
			boolean isSerach=service.searchProduct(name);
			if(isSerach) {
				System.out.println("Corect deatil");
			}else {
				System.out.println("Something wrong");
			}
			break;
		case 3:
			service.showProduct();
			break;	}
	
}}

}
