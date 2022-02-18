package com.syntax.class04;

import java.util.Scanner;

public class Issue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner getData = new Scanner(System.in);
		
		System.out.println("Using next");
		
		/*
		 * getData.nextLine();// (next.Line) is able to pause the 
		 * program at this point to ask the user to input the value of city. 
		 * Without it the prog jumps to Line 21 
		 * then to Line 26.
		 */
		String value = getData.next();
		System.out.println(value);
		
		getData.nextLine();//Inserting the nextLine, will resolve the issue of skipping. Comment it out to see result
		
		System.out.println("Using nextLine");
		String anotherValue = getData.nextLine();
		System.out.println(anotherValue);
		
		System.out.println("End of the program");
		

	}

}
