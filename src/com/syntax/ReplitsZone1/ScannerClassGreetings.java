package com.syntax.ReplitsZone1;

import java.util.Scanner;

public class ScannerClassGreetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * For you to do:
		 * 
		 * Write a program that takes a user's name and prints it.
		 * 
		 * Example Output:
		 * 
		 * Hello, please enter your name
		 * 
		 * Your name is Manny
		 * 
		 */

		Scanner greeting = new Scanner(System.in);
		System.out.println("Hello, please enter your name");

		String name = greeting.nextLine();
		System.out.println("Your name is " + name);

	}

}
