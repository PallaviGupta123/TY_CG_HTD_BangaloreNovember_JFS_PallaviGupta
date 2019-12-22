package com.cape.moduletest1.controller;

import java.util.List;
import java.util.Scanner;

import com.cape.moduletest1.bean.ProductBean;
import com.cape.moduletest1.factory.Factory;
import com.cape.moduletest1.service.ProductService;

public class ShowAllProduct {
	public static void main(){
		Scanner sc=new Scanner (System.in);
		ProductService service=Factory.getService();
		List<ProductBean> list=service.showProduct();
		if(list!=null) {
			for (ProductBean productBean : list) {
				System.out.println(productBean);
			}
		}else {
			System.out.println("Something went wrong");
		}
	}

}
