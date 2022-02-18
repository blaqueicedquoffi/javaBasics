package com.syntax.class06;

import java.util.Scanner;

public class HW4_CalculatorUsingIfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/).
		 *  Based on operator provide the result to user.
		 * 
		 */
		
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Please enter your first value.");
		
		int val1 = calc.nextInt();
		
		System.out.println("Please enter desired operation:+,-,*,/");
		char op = calc.next().charAt(0);
		
		System.out.println("Please enter your second value.");
		int val2 = calc.nextInt();
		
		int result = 0;
		
		if (op == '+') {
		result = val1 + val2;
		
		} else if (op == '-') {
		result = val1 - val2;
		
		} else if (op == '*') {
		result = val1 * val2;
		
		} else if (op == '/') {
		result = val1 / val2;
		
		} else {
		System.out.println("Invalid entry.");
		}
		
		System.out.println(result);

	}

}
