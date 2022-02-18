package com.syntax.ReplitsZone1;

public class IntToStringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a String variable "name" and assign a value of "Chen" to it
		 * Create an integer variable "age" and assign a value of 50 to it
		 * Create an integer variable "iq" and assign the value of age to it (do NOT use ' = 50')
		 * Print the value of a name
		 * Print the value of "age" and the value of "iq" on the same line.
		 * 
		 * Output:
		 * Chen
		 * 5050
		 * 
		 */
		
		String name = "Chen";
		
		int age = 50;
		
		int iq = 50;
		
		String s1 = Integer.toString(age);
		
		String s2 = Integer.toString(iq);
		
		System.out.println(name);
		
		System.out.println(s1 + s2);
		
		

	}

}
