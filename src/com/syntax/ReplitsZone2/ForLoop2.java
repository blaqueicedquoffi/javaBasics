package com.syntax.ReplitsZone2;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a for loop that prints out even numbers from 10 to 0
		 * 
		 * Must not include the number 0 in the output
		 * 
		 */
		
		int numA = 10;
		
		for (numA = 10; numA >= 2; numA--) {
			if (numA %2 == 0) {
				System.out.println(numA);
			}
		}

	}

}
