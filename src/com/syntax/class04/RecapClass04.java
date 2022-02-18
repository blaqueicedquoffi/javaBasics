package com.syntax.class04;

import java.util.Scanner;

public class RecapClass04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner getData = new Scanner(System.in);
		System.out.println("Please enter your name");
		String getName = getData.next();

		System.out.println("Please enter your age");
		int getAge = getData.nextInt();

		System.out.println("Your name is " + getName + " and your age is " + getAge + ".");

		String getFullName = getData.nextLine(); // (Used for entering multiple strings or full sentences)

		System.out.println("Please enter boolean value");
		boolean booleanValue = getData.nextBoolean();
		System.out.println(booleanValue);

		System.out.println("Please enter decimal value");
		double getDouble = getData.nextDouble();

		System.out.println("Please enter char value");
		char getChar = getData.next().charAt(0);

		System.out.println(getChar);

		System.out.println("End of program");

	}

}
