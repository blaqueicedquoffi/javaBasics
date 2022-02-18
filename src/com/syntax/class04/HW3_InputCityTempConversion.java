package com.syntax.class04;

import java.util.Scanner;

public class HW3_InputCityTempConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print 
		 * “The temperature of the city __ is __”
		 * 
		 */
		float celsius,fahrenheit;
		
		Scanner capture = new Scanner(System.in);
		System.out.println("In which city are you currently located?");
		
		String city = capture.nextLine();
		/*
		 * ^^^
		 * Using (.nextLine) resolves the issue of getting just one value. 
		 * For example [String city = capture.next();] 
		 * will only yield Los instead of Los Angeles.
		 */
		
		Scanner temp = new Scanner(System.in);
		
		System.out.println("What is the current temperature in Fahrenheit of your location?");
		
		 fahrenheit = temp.nextInt();
		
		 celsius=(fahrenheit - 32)*5/9;
		 
		 System.out.println("The temperature of "+city+" is "+celsius+" degrees Celsius!");
		 
		}

}
