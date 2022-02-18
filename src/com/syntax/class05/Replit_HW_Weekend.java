package com.syntax.class05;

import java.util.Scanner;

public class Replit_HW_Weekend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * If it is not a weekend --> subject="manual testing" Otherwise -->
		 * subject="Java"
		 * 
		 * Output: Today you will be learning ____
		 * 
		 */

		Scanner getInfo = new Scanner(System.in);
		System.out.println("Is it weekend?");
		boolean weekendFun = getInfo.nextBoolean();

		if (!weekendFun) {
			System.out.println("Today you will be learning manual testing");
		} else {
			System.out.println("Today you will be learning Java");
		}

	}

}
