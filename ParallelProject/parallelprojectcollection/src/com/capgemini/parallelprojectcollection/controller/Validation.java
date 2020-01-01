package com.capgemini.parallelprojectcollection.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.parallelprojectcollection.bean.Client;

public class Validation {
	static Client customer=new Client();
	public static void isUserName(String name) {
		boolean flag=true;
		do {
			String pattern="[a-zA-Z_]+";
			flag=name.matches(pattern);
			if(!flag) {
				System.err.println("OOPs!!!Only Alphabet ");
			flag=false;
			}
			else {
				customer.setCustName(name);
				flag=true;
			}	
		}
		while(flag!=true);	
	}
}
