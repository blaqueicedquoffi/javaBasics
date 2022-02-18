package com.syntax.class04;

import java.util.Scanner;

public class HW4_CreditCard_Verification_Offer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a Java program that will ask if user has a credit card or not. 
		 * If user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, tell them to pay off immediately, 
		 * Otherwise you can tell them to spend more.
		 */
		
		Scanner verify = new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		
		String creditCard = verify.next();
	
		if(creditCard.equalsIgnoreCase("No")) {
			System.out.println("You're eligible for a credit card!");
			
		} else  {
			System.out.println("What's the balance on your credit card?");
			
			int balance = verify.nextInt();
			
			if(balance>1000) {
				System.out.println("Please pay off your balance immediately!");
					
		} else {
			System.out.println("Take a vacation and go on a spending spree!");
			
		} 
			}
		}
		
}


