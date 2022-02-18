package com.syntax.class04;

import java.util.Scanner;// We need to import Scanner into our class

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);//Creating a scanner
		
		System.out.println("Please enter your name");
		
		// If you want to capture a single string --> Use next();
		
		String name = input.next();// Type the string value and hit enter on the keyboard!
		
		System.out.println("Your name is "+name+("!"));
		
		// If an integer value is needed, capture int --> use nextInt()
		
		System.out.println(name+" Please enter your age");
		
		int age = input.nextInt();// Type integer and hit enter
		
		System.out.println("Your name is "+name+" and you're "+age+" years old!");
		
		
		
		

	}

}
