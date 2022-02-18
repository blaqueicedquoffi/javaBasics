package com.syntax.ReplitsZone2;

public class DoWhileLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Using do while loop print even numbers from 20 to 1
		 * 
		 */
		
		int numQ = 21;
		do {
			numQ--;
			if (numQ % 2 == 0)
				System.out.println(numQ);
		} while(numQ >= 2);

	}

}
