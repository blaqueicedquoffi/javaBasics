package com.syntax.class05;

import java.util.Scanner;

public class Replit_HW_ComapringLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Prompt user to input two strings : "Please enter two strings"and 
		 * Two integers: "Please enter two numbers"
		 * And make the comparisons:
		 * if (int1 and int2) are equal and (word1 and word2 )are equal, output "AND"
		 * if (int1 and int2) are equal or (word1 and word2) are equal, output "OR"
		 * if (int1 and int2) are not equal and (word1 and word2) are not equal, output "NONE"
		 * 
		 */

		Scanner getInfo = new Scanner(System.in);
		
		System.out.println("Please enter two strings");
		String word1 = getInfo.nextLine();
		String word2 = getInfo.nextLine();
		
	    System.out.println("Please enter two numbers");
		int getNum1 = getInfo.nextInt();
		int getNum2 = getInfo.nextInt();

		if (getNum1 == getNum2 && word1.equals(word2)) {
			System.out.println("AND");
		} else if (getNum1 == getNum2 || word1.equals(word2)) {
			System.out.println("OR");
		} else if (getNum1 != getNum2 && word1 != word2) {
			System.out.println("NONE");
		}

	}

}
