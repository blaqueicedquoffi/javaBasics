package com.syntax.class05;

import java.util.Scanner;

public class Replit_HW_ExamMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A school has following rules for grading system: a. 1 to 25 - F b. 25 to 45 -
		 * E c. 45 to 50 - D d. 50 to 60 - C e. 60 to 80 - B f. Above 80 - A Ask the
		 * user to enter marks and print the corresponding grade.
		 * 
		 * Example Output:
		 * 
		 * Please enter your mark
		 * 
		 * Your grade is A
		 * 
		 * Example Output:
		 * 
		 * Please enter your mark
		 * 
		 * Please enter valid mark
		 * 
		 */

		Scanner getMarks = new Scanner(System.in);
		System.out.println("Please enter marks");
		int examMarks = getMarks.nextInt();

		if (examMarks > 80) {
			System.out.print("Your grade is A");
		}

		if (examMarks >= 60 && examMarks <= 80) {
			System.out.println("Your grade is B");
		}

		if (examMarks >= 50 && examMarks <= 60) {
			System.out.println("Your grade is C");
		}

		if (examMarks >= 45 && examMarks <= 50) {
			System.out.println("Your grade is D");
		}

		if (examMarks >= 25 && examMarks <= 45) {
			System.out.println("Your grade is E");
		}

		if (examMarks >= 1 && examMarks <= 25) {
			System.out.println("Your grade is F");

		} else if (examMarks < 1) {
			System.out.println("Please enter valid mark");

		}

	}

}
