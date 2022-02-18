package com.syntax.class05;

import java.util.Scanner;

public class ReplitHW_ThirstQuench {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Take 2 boolean inputs from a user: "Are you thirsty?" "Are you sleepy?" If
		 * user is thirsty and not sleepy--> drink=water If user is thirsty and
		 * sleepy--> drink=coffee If user is not thirsty and sleepy --> drink=tea
		 * Otherwise drink="nothing" Output: Looks like you need to drink ___
		 * 
		 * 
		 */

		Scanner getData = new Scanner(System.in);
		
		System.out.println("Are you thirsty?");
		boolean thirstyQ = getData.nextBoolean();
		System.out.println("Are you sleepy");
		boolean sleepyZ = getData.nextBoolean();

		if (thirstyQ == !sleepyZ) {
			System.out.println("Looks like you need to drink water");
		}

		if (thirstyQ == sleepyZ) {
			System.out.println("Looks like you need to drink coffee");
		}

		if (thirstyQ != sleepyZ) {
			System.out.println("Looks like you need to drink tea");
		}

		else {
			System.out.println("Looks like you need to drink nothing");
		}

	}

}
