package com.syntax.ReplitsZone2;

import java.util.Scanner;

public class ForLoopContinue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given the following inputs:
		 * 
		 * int x;
		 * 
		 * Write a for loop that will print out a series of numbers starting at 0 and
		 * ending at the x(value must be taken from a user), exclusive.
		 * 
		 * Example Output:
		 * 
		 * In: 3
		 * 
		 * 0 1 2
		 * 
		 * In: 8
		 * 
		 * 0 1 2 3 4 5 6 7
		 * 
		 * In: 5
		 * 
		 * 0 1 2 3 4
		 * 
		 */

		Scanner getNum = new Scanner(System.in);
		System.out.println();
		int x = getNum.nextInt();

		for (int num1 = 0; num1 <= x; num1++) {
			if (x == num1) {
				continue;
			}
			System.out.print(num1+ " ");

		}

	}

}
