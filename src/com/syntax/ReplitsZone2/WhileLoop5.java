package com.syntax.ReplitsZone2;

public class WhileLoop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Step 1: Initialize the i value as int i=7.

         * Step 2: Write a program to print a sequence of numbers
         * starting from 7 to 98.
		 * 
		 * 
		 */
		
		int num = 7;
		while (num <= 98) {
			if (num % 7 == 0) {
				System.out.println(num);
			}
			num++;
		}

	}

}
