package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * create a secret number
		 * 
		 * we want user to guess our secret number
		 * 
		 * the moment user guessed my secret number --> my program should stop otherwise
		 * it should continue asking to guess my number
		 * 
		 */

		int secretNumber = 12;
		
		Scanner scan = new Scanner(System.in);
		
		int guessNumber;

		do {
			System.out.println("Please enter a number to to win");

			guessNumber = scan.nextInt();//NB: guessNumber is a local variable that thrives only in the "do" block.

		} while (guessNumber != secretNumber);
		
		System.out.println("Congratulations");

	}

}
