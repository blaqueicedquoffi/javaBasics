package com.syntax.class06;

import java.util.Scanner;

public class Student_Roll_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program using the switch statement
		 * 
		 * Let us consider there are three students in the class with
		 *
		 * roll number starting from (101 to 103)
		 *
		 * if any number other than 101-103 are present display
		 *
		 * "Not found Student name: in Class"
		 * 
		 * First Output: "Enter the roll number of the Child"
		 * 
		 * case 101: if roll number is 101 print as "Student name: Ramesh"
		 * 
		 * case 102 :if roll number is 102 print as "Student name: Mahesh"
		 *
		 */

		int rollNum = 101;
		Scanner getNum = new Scanner(System.in);
		System.out.println("Enter the roll number of the Child");
		rollNum = getNum.nextInt();

		int student;
		switch (rollNum) {
		case 101:
			System.out.println("Student name: Ramesh");
			break;
		case 102:
			System.out.println("Student name: Mahesh");
			break;
		case 103:
			System.out.println("Student name: Mukesh");
			break;
		default:
		case 110:
			System.out.println("Not found Student name: in Class");

		}

	}

}
