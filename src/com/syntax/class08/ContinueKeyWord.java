package com.syntax.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue; // skip current iteration/cycle
			}
			System.out.println("Hello " + i);
			System.out.println("We are Batch 12");
		}
		// I want to print all numbers from 1 to 10 except for 4 and 7
		for (int i = 1; i <= 10; i++) {
			if (i == 4 || i == 7) {
				continue;
			}
			System.out.print(i + "  ");
		}
	}

}
