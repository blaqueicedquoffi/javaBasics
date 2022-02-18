package com.syntax.class04;

import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// next() v. nextLine();
		
		Scanner getData = new Scanner(System.in);
		
		System.out.println("Please enter temperature");//nextIn(); nextDouble(); nextBoolean(); next().charAt(0):
		
		int getTemp = getData.nextInt();
		System.out.println(getTemp);
		
		getData.nextLine();// (next.Line) is able to pause the program at this point to ask the user to input the value of city. without it the prog jumps to Line 21 then to Line 26.
		
		System.out.println("Please enter city");
		
		String getValue2 = getData.nextLine();
		System.out.println(getValue2);
		
		System.out.println("End of the program");
		
		
		

	}

}
