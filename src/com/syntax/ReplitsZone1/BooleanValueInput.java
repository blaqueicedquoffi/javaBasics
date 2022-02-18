package com.syntax.ReplitsZone1;

import java.util.Scanner;

public class BooleanValueInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Create a program that will ask a user to input boolean value "Input the boolean value"

         * If the input is true or false, then the output should look like below:

         * Example Output:

         * Input the boolean value

         * The value is true

         * Example Output:

         * Input the boolean value

         * The value is false
		  
		 */
		
		Scanner dice = new Scanner(System.in);
	    System.out.println("Input the boolean value");

	    String answer = dice.next();

	    if(answer.equalsIgnoreCase("False")) {
	      System.out.println("The value is false");

	    } else if(answer.equalsIgnoreCase("True")) {
	      System.out.println("The value is true");

	    }
	}

}
