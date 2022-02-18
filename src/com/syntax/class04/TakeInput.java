package com.syntax.class04;
/*
 * To import in MacOs: cmd+shit+o
 * To import in Windows: ctrl+shift+o
 */
import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Create a Scanner and assign to a variable
		
		Scanner scan = new Scanner(System.in);
		
		//2. Be specific about the instructions
		System.out.println("Please enter your country of origin");
		
		//3. At this point, the String value is needed --> use next()
		
		String country = scan.next();
		System.out.println("You are from "+country+"!");
		
		/* 
		 * If you're from USA --> You speak English! 
		 * IF you're from France --> You speak French!
		 */
		
		if(country.equalsIgnoreCase("America")) {
			System.out.println("You speak English!");
			
		} else if(country.equalsIgnoreCase("France")) {
			System.out.println("You speak French!");
			
		} else if(country.equalsIgnoreCase("Italy")) {
			System.out.println("You speak Italian!");
			
		} else {
			System.out.println("I'm sorry. I do not know which language you speak!");
		}
		
		
		
	}

}
