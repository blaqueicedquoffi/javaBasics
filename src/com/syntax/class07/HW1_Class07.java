package com.syntax.class07;

public class HW1_Class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3
		 * 
		 */

		int num = 1;

		while (num <= 50) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
			num++;
		}
		System.out.println("End of code!");

	}

}
