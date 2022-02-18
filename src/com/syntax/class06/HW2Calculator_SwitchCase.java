package com.syntax.class06;

import java.util.Scanner;

public class HW2Calculator_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user.
		 */

		int num1;
		
		int num2;
		
		char operator;
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Plesae enter first number");
		
		num1 = sc.nextInt();
		
		System.out.println("Please enter second number");
		
		num2 = sc.nextInt();
		
		System.out.println("What is the operator");
		
		operator = sc.next().charAt(0);
		
		int result = 0;
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("We cannot devide a number by " + num2);
			}
			break;
		case '*':
			result = num1 * num2;
			break;
		default:
			System.out.println("Invalid Operator");
		}
		System.out.println(result);

	}

}
