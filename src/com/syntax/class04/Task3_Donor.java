package com.syntax.class04;

public class Task3_Donor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Create a Java program and call it a Donor.
         * In order to be eligible to donate your blood you have to be 18 years old. 
         * Also once you identify age eligibility then we have to see if person matches weight requirements. 
         * If person weight it more than 110 Lbs → then he/she is eligible, 
         * otherwise we cannot accept such a patient.
		 */

		int donorAge = 23;

		int donorWeight = 178;

		if (donorAge >= 18) {
			System.out.println("You're eligible to donate blood!");

		} else {
			System.out.println("You're underage!");
		}

		if (donorWeight >= 110) {
			System.out.println("You're a blood donor!");
		
		} else {
			System.out.println("Your blood donor application has been denied!");
		}
		/* Else code block cannot exist by itself
		 * else {
		 * 				System.out.println("Condition is false");
		 * }
		 */
	}

}
