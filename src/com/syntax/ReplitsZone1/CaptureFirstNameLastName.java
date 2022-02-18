package com.syntax.ReplitsZone1;

import java.util.Scanner;

public class CaptureFirstNameLastName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that takes user's first name and last name and prints in console
         * Instruct the user to enter first name: 
         * "Please Enter First Name" Capture the first name 
         * Instruct the user to enter last name:
         * "Please Enter Last Name" Capture last name 
         * Print first name and last name
         * 
         * Final Output:
		 * Example: 
		 * Please Enter First Name
		 * Please Enter Last Name
		 * Manny Lupin
		 * 
		 */
		
		Scanner input1 = new Scanner(System.in);
		  System.out.println("Please Enter First Name");
		  String firstName = input1.nextLine();

		  // No need for this extra capture: Scanner input2 = new Scanner(System.in);
		  System.out.println("Please Enter Last Name");
		  String lastName = input1.nextLine();

		  System.out.println(firstName+" "+lastName);

	}

}
