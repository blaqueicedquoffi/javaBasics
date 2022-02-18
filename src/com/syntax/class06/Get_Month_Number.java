package com.syntax.class06;

import java.util.Scanner;

public class Get_Month_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to input number "Input a number between 1-12" when you input
		 * a number it should display the month using Scanner and Switch statement.
		 * case: 1 will display January case: 12 will display December Anything outside
		 * of 12 will display "Invalid"
		 * 
		 * Example Output:
		 * 
		 * Input a number between 1-12
		 * 
		 * Invalid
		 * 
		 * Example Output:
		 * 
		 * Input a number between 1-12
		 * 
		 * January
		 * 
		 */

		int monthNum = 1;
		Scanner getMonth = new Scanner(System.in);
		System.out.println("Input a number between 1-12");
		monthNum = getMonth.nextInt();

		int month;
		switch (monthNum) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid");

		}

	}

}
