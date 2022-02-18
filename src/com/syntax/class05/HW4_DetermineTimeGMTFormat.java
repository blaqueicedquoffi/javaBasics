package com.syntax.class05;

import java.util.Scanner;

public class HW4_DetermineTimeGMTFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that will ask user to input the current time (use 24 hour
		 * format). Based on the given time define: if hour is between 1-11 --> Morning
		 * if hour between 12-15 --> Afternoon if hour between 16-20 --> Evening if hour
		 * between 21-24 --> Night
		 * 
		 */

		Scanner getTime = new Scanner(System.in);
		System.out.println("Please input time in 24 hour format");
		double getGMT = getTime.nextDouble();

		if (getGMT >=1 && getGMT <= 11) {
			System.out.println("Morning");
		}

		if (getGMT >= 12 && getGMT <= 15) {
			System.out.println("Afternoon");
		}

		if (getGMT >= 16 && getGMT <= 20) {
			System.out.println("Evening");
		}

		if (getGMT >= 21 && getGMT <= 24) {
			System.out.println("Night");
		}

	}

}
