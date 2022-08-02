package com.day19assignment.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Uc3 {

	static String firstName, lastName, email;

	void validateFirstName() {
		String nameExp = "^[A-Z]{1}+[a-z]{2,}";
		boolean b3 = Pattern.matches(nameExp, firstName);
		if (b3 != true) {
			System.out.println("Invalid Firstname");
		}else {
            System.out.println("First Name you entered is Valid");

		}
	}

	void validateLastName() {
		String nameExp = "^[A-Z]{1}+[a-z]{2,}";
		boolean b3 = Pattern.matches(nameExp, lastName);
		if (b3 != true) {
			System.out.println("Invalid Lastname");
		}else {
            System.out.println("Last Name you entered is Valid");

		}
	}

	void validateEmail() {
		String emailExp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
		boolean b3 = Pattern.matches(emailExp, email);
		if (b3 != true) {
			System.out.println("Invalid Mail Id");
		}else {
            System.out.println("Last Name you entered is Valid");

		}
	}


	public static void main(String args[]) {
		Uc3 obj = new Uc3();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first name : ");
		firstName = sc.next();
		obj.validateFirstName();
		
		System.out.println("Enter last name : ");
		lastName = sc.next();
		obj.validateLastName();

		System.out.println("Enter Email Id : ");
		email = sc.next();
		obj.validateEmail();
	}

}
