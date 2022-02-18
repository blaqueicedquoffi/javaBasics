package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Logical not is used to reverse the conditional statement

		boolean value = !false;
		System.out.println(value);

		System.out.println("--------------------------------");

		boolean traffic = false;

		if (!traffic) {
			 System.out.println("I will be punctual");

		}
		
		System.out.println("--------------------------------");
		
		String day = "Saturday";
		
		if (!day.equals("Saturday")) {
			System.out.println("Today is not Saturday");
		}
		
		System.out.println("--------------------------------");
		
		boolean checkboxChecked = false;
		
		if(!checkboxChecked) {
			System.out.println("I will click on that checkbox");
		}
		
		System.out.println("--------------------------------");
		
		String java = "easy";
		
		if (!java.equals("hard")) {
			System.out.println("You're genius");
		}
		
		System.out.println("------------THE END-------------");

	}

}
