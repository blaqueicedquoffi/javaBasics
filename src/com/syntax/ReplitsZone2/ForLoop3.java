package com.syntax.ReplitsZone2;

public class ForLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a for loop that prints out even numbers from 2 to 14 using if condition
		 * 
		 * Must include the number 14 in the output
		 * 
		 */
		
		int numL = 2;
		
		for (numL = 2; numL <=14; numL++) {
			if (numL %2 == 0) {
				System.out.println(numL);
			}
		}
	}
}
