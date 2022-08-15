package com.day19assignment.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Uc10 {

	 public String validateFirstName(String firstName) {
		 
		 String firstNameExp = "^[A-Z]{1}+[a-z]{2,}";
	     
		 if(Pattern.matches(firstNameExp, firstName)) 
	            return "HAPPY";
	 	 else 
	 			System.out.println("Invalid First name");
	            return "SAD";
	    
	 }
	 public String validateLastName(String lastName) {
		 
		 String lastNameExp = "^[A-Z]{1}+[a-z]{2,}";
	     
		 if(Pattern.matches(lastNameExp, lastName))
	            return "HAPPY";
	        else
	        	System.out.println("Invalid LastName");
	            return "SAD";
	 }

	 public String validateEmail(String email) {
	   
		 String emailExp = "^([a-z0-9]+[-._+]?[a-zA-Z0-9]+)+@[a-z0-9]+.[a-z]{2,3}.[a-z]{2,3}$";
		 
		 if(Pattern.matches(emailExp, email))
		   return "HAPPY";
		 else
			System.out.println("Invalid Email-id");
		 	return "SAD";
	 }

	 public String validateMobNum(String phone) {
	        
		 String phoneExp = "[0-9]{2}\\s[0-9]{10}";
	        
		 if(Pattern.matches(phoneExp, phone))
	            return "HAPPY";
	        else
	        //	System.out.println("Invalid Phone number");
	            return "SAD";
	 }

	 public String validatePassword(String password) {
	        
		 String passwordExp = "^.*(?=.*[A-Z])(?=.*[0-9])([a-z])(?=.*[@#$%^&+=])(?=.{8,}).*$";
	     
		 if(Pattern.matches(passwordExp, password))
			 return "HAPPY";
		 else
			 System.out.println("Invalid password");
			 return "SAD";
	    }



	 public static void main(String[] args) {
	 
		 System.out.println("Welcome to User Registration Program");
	     
		 Uc10 obj = new Uc10();
		 Scanner scan = new Scanner(System.in);
	        // First Name
	     System.out.print("Please enter you first name: ");
	     String firstName = scan.next();
	     obj.validateFirstName(firstName);

	        // Last Name
	     System.out.print("Please enter you last name: ");
	     String lastName = scan.next();
	     obj.validateLastName(lastName);

	        // Email
	     System.out.print("Please enter you Email: ");
	     String email = scan.next();
	     obj.validateEmail(email);

	        // Phone Number
	     System.out.print("Please enter you Phone Number: ");
	     String phone = scan.next();
	     obj.validateMobNum(phone);

	        // Password
	     System.out.print("Please enter your Password of choice: ");
	     String password = scan.next();
	     obj.validatePassword(password);

	 }
}
 

