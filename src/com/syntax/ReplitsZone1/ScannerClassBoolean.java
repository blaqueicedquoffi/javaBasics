package com.syntax.ReplitsZone1;

import java.util.Scanner;

public class ScannerClassBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * For you to do:
		 * 
		 * Create a program that will ask a user to input boolean value
		 * "Input the boolean value"
		 * 
		 * If the input is true or false, then the output should look like below:
		 * 
		 * Example Output:
		 * 
		 * Input the boolean value
		 * 
		 * The value is true
		 * 
		 * Example Output:
		 * 
		 * Input the boolean value
		 * 
		 * The value is false
		 * 
		 */

		Scanner weatherInput = new Scanner(System.in);
		System.out.println("Input the boolean value");

		String answer = weatherInput.next();

		if (answer.equalsIgnoreCase("false")) {
			System.out.println("The value is false");

		} else if (answer.equalsIgnoreCase("true")) {
			System.out.println("The value is true");

		}
	}
}
