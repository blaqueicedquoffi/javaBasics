package com.syntax.class04;

import java.util.Scanner;

public class HW6_FindingTheLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Prime example of [nested if statements].
		 * 
		 */

		Scanner getNumber = new Scanner(System.in);
		System.out.println("Please enter 3 different numbers");
		int num1 = getNumber.nextInt();
		int num2 = getNumber.nextInt();
		int num3 = getNumber.nextInt();

		if (num1 > num2) {

			if (num1 > num3) {
				System.out.println(num1 + " is the largest");

			} else {
				System.out.println(num3 + " is the largest");
			}

		} else {
			if (num2 > num3) {
				System.out.println(num2 + " is the largest");
			} else {
				System.out.println(num3 + " is the largest");

			}

		}
	}

}
