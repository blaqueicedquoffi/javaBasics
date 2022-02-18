package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean vaccine = true;

		int dose = 2;

		if (vaccine) {
			System.out.println("How many doses do you have?");

			if (dose == 1) {
				System.out.println("You need another shot.");

			} else {

				System.out.println("You are fully vaccinated!");
			}

		}
		System.out.println(" --------------------------------------------  ");
		/*
		 * declare a variable for allergy
		 * 
		 * if you have allergy --> if you have pollen if you have peanut if you have
		 * wheat if no allergy --> you are lucky
		 */

		boolean allergy = true;

		if (allergy) { // outer if
			System.out.println("Let's check for allergies.");

			String allergyType = "Peanut";

			// (nested if) --> always has a dependency on outer if.
			// outer if MUST be true in order for (nested if) to be checked.

			if (allergyType.equals("Pollen")) {
				System.out.println("Please stay home when trees are blooming. Take med A!");

			} else if (allergyType.equals("Peanut")) {
				System.out.println("Please do not eat food that contains nuts. Take med B!");

			} else if (allergyType.equals("Gluten")) {
				System.out.println("Please follow gluten free diet. Take med c!");

			} else {
				System.out.println("I don't have any diagnosis to offer.");

			}

		} else {
			System.out.println("You're allergy free!");
		}

	}

}
