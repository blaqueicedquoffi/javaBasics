package com.syntax.class04;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to store a boolean value of whether user has diploma or not.
		 * If user has a diploma, you should say congratulations, otherwise program
		 * should suggest to get a degree. Then if user has a degree program should
		 * check a gpa score. If gpa score is higher or equals to 3.5 You are eligible
		 * for scholarship
		 * 
		 */

		boolean diploma = true;

		if (diploma) {
			System.out.println("Congratulations, Manny!");
		} else {
			System.out.println("Please get a diploma.");
		}
			double gpa = 3.1;
			
			if (gpa>=3.5) {
				System.out.println("Great Manny.You're eligible for scholarship!");
			
			} else {
				System.out.println("You should've studied harder");
			}

	}
}
