package com.syntax.class05;

import java.util.Scanner;

public class HW_WeekDayWeekendValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”, 
		 * anyday from 6-7 → output “It is a weekend”, 
		 * any other day → output “Invalid day
		 * 
		 */

		Scanner getDay = new Scanner(System.in);
		System.out.println("Please enter a day number");

		int numDay = getDay.nextInt();
		
		if (numDay>1 && numDay<=5) {
			System.out.println("It is a weekday");
			
		} else if (numDay==6 || numDay==7) {
			System.out.println("It is a weekend");
			
		} else {
			System.out.println("Invalid day");
		}
		
		System.out.println("---------------------");
		
		if (numDay>1 && numDay<=5) {
			System.out.println("It is a weekday");
			
		} else if (numDay>=6 && numDay<=7 ) {
			System.out.println("It is a weekend");
			
		} else {
			System.out.println("Invalid day");
		}
		
		System.out.println("---------------------");
		
		if (numDay==1 || numDay==2 || numDay==3 || numDay==4 ||numDay==5) {
			System.out.println("It is a weekday");
		} else if (numDay==6 || numDay==7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}
	}
}