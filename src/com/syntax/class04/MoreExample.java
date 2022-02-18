package com.syntax.class04;

import java.util.Scanner;

public class MoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner fullName= new Scanner(System.in);
		
		System.out.println("Please enter your full name");
		
		// If you need to capture more than one word --> [use nextLine()]
		
		String fullName1 = fullName.nextLine();
		
		System.out.println(fullName1);
		

	}

}
