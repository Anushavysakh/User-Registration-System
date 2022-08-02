package com.day19assignment.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Uc2 {

	static String firstName,lastName;
	public void validFirstName() {
		String nameExp= "^[A-Z]{1}+[a-z]{2,}";
		boolean b3 = Pattern.matches(nameExp,firstName);  
		if(b3!=true) {
			System.out.println("Invalid Firstname");
		} else {
            System.out.println("First Name you entered is Valid");

		}
	}
	public void validLastName() {
		String nameExp= "^[A-Z]{1}+[a-z]{2,}";
		boolean b3 = Pattern.matches(nameExp,lastName);  
		if(b3!=true) {
			System.out.println("Invalid Lastname");
		}else {
            System.out.println("Last Name you entered is Valid");

		}
	}
	
	public static void main(String args[]) {
		Uc2 obj =new Uc2();
		Scanner sc=new  Scanner(System.in);
		
		System.out.println("Enter first name : ");
		firstName = sc.next();
		obj.validFirstName();
		System.out.println("Enter last name : ");
		lastName= sc.next();
		obj.validLastName();
		
	}
}


