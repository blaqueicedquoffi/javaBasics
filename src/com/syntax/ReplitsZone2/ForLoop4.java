package com.syntax.ReplitsZone2;

public class ForLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a for loop that prints out odd numbers from 5 to 22 
		 * Must not include the number 22 in the output
		 *  
		 */

		int numB = 5;

		for (numB = 5; numB <= 22; numB++) {
			if (numB % 2 != 0) {
				System.out.println(numB);
			}
		}
	}
}
