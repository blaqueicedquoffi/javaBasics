package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "Saturday";

		if (day.equals("Saturday") || day.equals("Sunday")) {

			//System.out.println("I have java class");

		}

		//System.out.println("Code outside of if statement");
		
		/* Ask user what the day it is
		 * 
		 * Based on the day, let's define the class on schedule
		 * 
		 * if (Monday or Friday) --> there is no class today
		 * else if (Tuesday or Wednesday) --> Manual Class
		 * else if (Thursday) --> Review class
		 * else if (Saturday or Sunday) -->Java class
		 * 
		 */
		
		Scanner getDay = new Scanner(System.in);
		System.out.println("Please enter a weekday");
		
		 String day1 = getDay.nextLine();
		
		
		if (day.equalsIgnoreCase("Monday") || day.equals("Friday")) {
			System.out.println("There is no class");
			
		} else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")) {
			System.out.println("There is Manual Testing Class");
			
		} else if (day.equalsIgnoreCase("Thursday")) {
			System.out.println("There is Review Class");
			
		} else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
			System.out.println("There is Java programming class");
			
		} else {
			System.out.println("INVALID ENTRY!");
		}
		
		
		
		
		

	}

}
