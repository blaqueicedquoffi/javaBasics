package com.syntax.class04;

public class HW2_DMVRepOfficer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver's license to them, 
		 * otherwise you will offer them to get a learners permit.
		 * 
		 */
		
		int ageRequirement = 15;
		
		if(ageRequirement>=18) {
			System.out.println("Congratulations! You're eligible for a valid driver's license!");
			
		} else {
			System.out.println("Sorry, you will be offered a learner's permit for now!");
		}
		

	}

}
