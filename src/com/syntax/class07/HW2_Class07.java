package com.syntax.class07;

import java.util.Scanner;

public class HW2_Class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a program that will keep asking user to apply for a credit card. As
		 * soon you get “yes” from a user program should stop asking.
		 * 
		 */

		int goalScore = 700;

		Scanner getScore = new Scanner(System.in);

		System.out.println("Please enter your credit score");

		int creditScore;

		creditScore = getScore.nextInt();

		while (creditScore != goalScore) {
			//if (creditScore >= goalScore) {
				System.out.println("Please apply for credit card");

				creditScore = getScore.nextInt();
			}
			System.out.println("Yes");

		}

	}

