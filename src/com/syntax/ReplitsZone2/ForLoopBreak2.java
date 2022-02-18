package com.syntax.ReplitsZone2;

import java.util.Scanner;

public class ForLoopBreak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given the following inputs:
		 * 
		 * int x;
		 * 
		 * Write a for loop that will print out a series of numbers starting at one less
		 * than x and ending at 0.
		 * 
		 * Sample input/outputs:
		 * 
		 * In: 7
		 * 
		 * 6 5 4 3 2 1 0
		 * 
		 * In: 12
		 * 
		 * 11 10 9 8 7 6 5 4 3 2 1 0
		 * 
		 * In: 20
		 * 
		 * 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
		 * 
		 * 
		 */

		Scanner getNum = new Scanner(System.in);
		System.out.println();
		int x = getNum.nextInt();

		for (int num1 = (x - 1); x >= 0; num1--) {
			if (num1 == -1) {
				break;
			}
			System.out.print(num1 + " ");
		}

	}

}
