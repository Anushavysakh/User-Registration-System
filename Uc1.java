package com.day19assignment.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Uc1 {
	static String name;
	Scanner sc=new  Scanner(System.in);

	public void valideFirstName() {
		String nameExp= "^[A-Z]{1}+[a-z]{2,}";
		System.out.println("Enter first name : ");
		 name= sc.next(); 
		if(Pattern.matches(nameExp, name)) {
	            System.out.println("First Name you Entered is Valid");
		 }else {
	            System.out.println("First Name you entered is Invalid");
		 		}
	}	 
	public static void main(String args[]) {
		Uc1 obj =new Uc1();
		System.out.println("Welcome to User Registration System");
		obj.valideFirstName();
	}
}
