package com.syntax.ReplitsZone2;

import java.util.Scanner;

public class ForLoopBreak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * For you to do:
		 * 
		 * You should input:
		 * 
		 * int end;
		 * 
		 * Write a for loop that will print out a series of numbers starting at 0 and
		 * ending at the doubled value of end(value must be taken from a user),
		 * exclusive.
		 * 
		 * Each number should be on the same line, separated by a space.
		 * 
		 * Example Output:
		 * 
		 * Int: 5 
		 * 
		 * 0 1 2 3 4 5 6 7 8 9
		 * 
		 * Int: 8 
		 * 
		 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		 * 
		 * In: -5
		 * 
		 */
		
		Scanner getNum = new Scanner(System.in);
		System.out.println();
		int end = getNum.nextInt();
		
		for (int num1 = 0; num1 <= (end*2); num1++) {
			if (num1 == (end*2)) {
				break;
			}
			System.out.print(num1+" ");
		}

	}

}
