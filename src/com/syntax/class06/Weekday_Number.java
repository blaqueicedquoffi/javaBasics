package com.syntax.class06;

import java.util.Scanner;

public class Weekday_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ask the user to enter any number from 1-7.
		 * 
		 * Based on the number define the day of the week
		 * 
		 * Example Output:
		 * 
		 * Input a number between 1-7
		 * 
		 * Friday
		 * 
		 * Example Output:
		 * 
		 * Input a number between 1-7
		 * 
		 * Invalid
		 * 
		 */

		int weekNum = 1;
		Scanner getWeek = new Scanner(System.in);
		System.out.println("Input a number between 1-7");
		weekNum = getWeek.nextInt();

		int weekday;
		switch (weekNum) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
		case 8:
			System.err.println("Invalid");

		}

	}

}
