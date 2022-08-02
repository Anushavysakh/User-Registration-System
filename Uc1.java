package com.day19assignment.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Uc5 {

	static String number, firstName, lastName, email, password;
	Scanner sc = new Scanner(System.in);

	void validateNumber() {
		String numberExp = "^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$";
		System.out.println("Enter Phone number:");
		number = sc.next();
		boolean b3 = Pattern.matches(numberExp, number);
		if (b3 != true) {
			System.out.println("The Phone Number you Entered is Invalid");
		}else {
            System.out.println("Phone number you entered is Valid");

		}
	}

	void validateFirstName() {
		String nameExp = "^[A-Z]{1}+[a-z]{2,}";
		System.out.println("\nEnter first name : ");
		firstName = sc.next();
		boolean b3 = Pattern.matches(nameExp, firstName);
		if (b3 != true) {
			System.out.println("Invalid Firstname");
		}else {
            System.out.println("First Name you entered is Valid");

		}
	}

	void validateLastName() {
		String nameExp = "^[A-Z]{1}+[a-z]{2,}";
		System.out.println("Enter last name : ");
		lastName = sc.next();
		boolean b3 = Pattern.matches(nameExp, lastName);
		if (b3 != true) {
			System.out.println("Invalid Lastname");
		}else {
            System.out.println("Last Name you entered is Valid");

		}
	}

	void validateEmail() {

		String emailExp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
		System.out.println("Enter Email Id : ");
		email = sc.next();
		boolean b3 = Pattern.matches(emailExp, email);
		if (b3 != true) {
			System.out.println("Invalid Mail Id");
		}else {
            System.out.println("Email you entered is Valid");

		}
	}

	void validatePassword() {

		String passwordExp = "^[A-Z a-z]{8,}$";
		System.out.println("Enter Password:");
		password = sc.next();
		boolean b3 = Pattern.matches(passwordExp, email);
		if (b3 != true) {
			System.out.println("Invalid Password");
		}else {
            System.out.println("Password is Valid");

		}
	}

	public static void main(String args[]) {
		Uc5 obj = new Uc5();
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to User Registration System");

		obj.validateFirstName();

		obj.validateLastName();

		obj.validateEmail();

		obj.validateNumber();
		obj.validatePassword();
	}
}
