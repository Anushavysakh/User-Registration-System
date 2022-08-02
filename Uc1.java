package com.day19assignment.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Uc9 {
	
	Scanner sc =new Scanner(System.in);
	static void validateEmail(ArrayList <String> email) {

		String emailExp =  "^[a-zA-Z0-9]+([.+_-]{0,1}+[a-zA-Z0-9])*+@+[a-zA-Z0-9]+.+([a-zA-Z]{2,4})+([.]{1}+[a-zA-Z]{0,2})*$";
		for (String mail : email) {
	            if (Pattern.matches(emailExp, mail)) {
	                System.out.println("The Email ID: " + mail + " is Valid");
	            } else {
	                System.out.println("The Email ID:" + mail + " is Invalid");
	            	}
	    }
	}
	
	public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");

        ArrayList<String> email = new ArrayList<String>();
        email.add("abc@yahoo.com");
        email.add("abc-100@yahoo.com");
        email.add("abc.100@yahoo.com");
        email.add("abc111@abc.com");
        email.add("abc-100@abc.net");
        email.add("abc.100@abc.com.au");
        email.add("abc@1.com");
        email.add("abc@gmail.com.com");
        email.add("abc");
        email.add("abc@.com.my");
        email.add("abc123@gmail.a");
        email.add("abc123@.com");
        email.add("abc123@.com.com");
        email.add(".abc@abc.com");
        email.add("abc()*@gmail.com");
        email.add("abc..2002@gmail.com");
        email.add("abc.@gmail.com");
        email.add("abc@gmail.com.1a");
        email.add("abc@gmail.com.aa.au");
        validateEmail(email);
    }
}
