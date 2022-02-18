package com.syntax.ReplitsZone1;

import java.util.Scanner;

public class RequestUserAgeAdd10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that asks the user's age: "Enter your age " Then display it
		 * by adding 10 (i.e age + 10) in your final output. Example Output: Enter your
		 * age 30 Your age after 10 years is 40
		 */

		Scanner i = new Scanner(System.in);
		System.out.println("Enter your age");

		int j = i.nextInt();

		j += 10;

		System.out.println("Your age after 10 years is " + j);

	}

}
