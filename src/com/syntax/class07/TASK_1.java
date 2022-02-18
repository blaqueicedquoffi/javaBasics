package com.syntax.class07;

public class TASK_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Print numbers from 1 to 100 in 1 line with space
		 * 
		 * Print numbers from 100 to 1
		 * 
		 * Print even numbers from 20 to 100
		 * 
		 * Print only odd numbers from 100 to 1
		 * 
		 */

		int num = 1;
		while (num <= 100) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println();

		int jay1 = 100;
		while (jay1 >= 1) {
			System.out.print(jay1 + " ");
			jay1--;

		}
		System.out.println();

		int evenNum = 20;
		while (evenNum <= 100) {
			if (evenNum % 2 == 0) {
				System.out.print(evenNum + " ");
			}
			evenNum++;

		}
		System.out.println();
		
		int oddNum = 100;
		while (oddNum >=1) {
			if (oddNum != 0) {
				System.out.print(oddNum + " ");
			}
			oddNum--;
		}

	}

}
