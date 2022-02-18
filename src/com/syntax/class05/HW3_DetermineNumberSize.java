package com.syntax.class05;

import java.util.Scanner;

public class HW3_DetermineNumberSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ask user to enter a number and 
		 * then define if number is small, medium or large 
		 * Small number is value between 1 and 10
		 * Medium number is value between 11 and 100
		 * Large number is value between 101 and 1000
		 * 
		 */
		
		Scanner getNumber = new Scanner(System.in);
		System.out.println("Please enter number");
		
		int num1 = getNumber.nextInt();
		
		if (num1>1 && num1<10) {
			System.out.println("The number is small");
			
		} else if (num1>10 && num1<100) {
			System.out.println("The number is medium");
			
		} else if (num1>100 && num1<1000) {
			System.out.println("The number is large");
		} else {
			System.out.println("Invalid value");
		}

	}

}
