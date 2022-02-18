package com.syntax.class04;

import java.util.Scanner;

public class HW5_BonusPayVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, Otherwise he is not. Once user is eligible, And salary is
		 * larger than 50000 then bonus = 5000, Otherwise bonus=3000.
		 * 
		 */

		Scanner employment = new Scanner(System.in);
		System.out.println("How long have you worked?");

		int yearsEmployed = employment.nextInt();

		Scanner salary = new Scanner(System.in);
		System.out.println("What is your annual salary?");

		int annualSalary = salary.nextInt();

		if (yearsEmployed >= 5) {
			System.out.println("Congratulations! You're eligible for a bonus!");

		} else {
			System.out.println("Sorry, you don't qualify for any bonus!");
		}

		if (annualSalary > 50000) {
			System.out.println("Congrats! You're eligible for a bonus of $5000!");

		} else {
			System.out.println("Attaboy! Here goes your bonus of $3000!");
		}

	}

}
