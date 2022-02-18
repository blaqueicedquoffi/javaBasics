package com.syntax.ReplitsZone2;

public class WhileLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * For you to do:

         * Using while loops that print out even numbers from 1 to 13

         * Example Output:**
		 * 2
		 * 4
		 * 6
		 * 8
		 * 10
		 * 12
		 * 
		 */
		
		int p = 1;
		while (p <=13) {
			if (p % 2 == 0) {
				System.out.println(p);
			}
			p++;
		}

	}

}
