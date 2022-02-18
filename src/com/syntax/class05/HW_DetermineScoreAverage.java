package com.syntax.class05;

import java.util.Scanner;

public class HW_DetermineScoreAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 * 
		 */

		Scanner getData = new Scanner(System.in);
		System.out.println("Please enter quiz score");
		int quiz = getData.nextInt();
		System.out.println("Please enter midterm score");
		int midterm = getData.nextInt();
		System.out.println("Please enter final score");
		int finalScore = getData.nextInt();

		int averageScore = ((quiz + midterm + finalScore) / 3);

		if (averageScore >= 90) {
			System.out.println("grade=A");

		}
		if (averageScore>=70 && averageScore<90) {
			System.out.println("grade=B");
		}
		if (averageScore>=50 && averageScore<70) {
			System.out.println("grade=C");
		}
		if (averageScore<50) {
			System.out.println("grade=F");
		}

	}

}
