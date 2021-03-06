package com.syntax.class08;

import java.util.Scanner;

public class TASK_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3
		 */
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println("             ");
		/*
		 * Create a program that will keep asking user to apply for a credit card. As
		 * soon you get from a user program should stop asking.
		 */

		Scanner sc = new Scanner(System.in);
		
		String answer;
		do {
			System.out.println("Do you want to apply for a credit card?");
			answer = sc.nextLine();
		} while (!answer.equalsIgnoreCase("yes"));
		System.out.println("Congrats! Here's your card");
	}

}
