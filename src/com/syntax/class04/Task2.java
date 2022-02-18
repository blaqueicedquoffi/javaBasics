package com.syntax.class04;

public class Task2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy a house, 
		 * otherwise user will consider buying. 
		 * Once user decides to buy a house, 
		 * if price of the house is larger than 50000 than user will take a loan, 
		 * otherwise user will pay cash.
		 * 
		 */
		
		
		
		double mortgageRate = 2.5;
		
		int mortgagePrice = 145000;
		
		if (mortgageRate>=4.5) {
			System.out.println("You can't buy a home!");
		} else {
			System.out.println("You should consider buying a home");
		}
			if (mortgagePrice>=50000) {
				System.out.println("You're eligible for a loan");
			} else {
				System.out.println("You must pay cash");
			}

	}

}
