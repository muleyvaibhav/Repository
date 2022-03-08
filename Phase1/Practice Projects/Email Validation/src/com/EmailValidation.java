package com;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class EmailValidation{
	 public static boolean isValidEmail(String email) {
		   String regex = "^(.+)@(.+)$";
		 //initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();

	       
	   }

	public static void main(String[] args) {
		 List<String> emails = new ArrayList<String>();
	       // valid email addresses
	       emails.add("vaibhav@gmail.com");
	       emails.add("abcd@example.com");
	       emails.add("zyx3@example.me.org");
	       //invalid email addresses
	       emails.add("ram.example.com");
	       emails.add("mahesh..drexample.com");
	       emails.add("naresh.ex.com");

	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter any email address to check");
	       try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();
			   System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
		}

	}

}
