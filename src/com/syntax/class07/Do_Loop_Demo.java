package com.syntax.class07;

public class Do_Loop_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("    ----- WHILE CHECK CONDITION BEFORE EXECUTION-----   ");

		int num = 10;

		while (num <= 3) { // is more used than do while

			System.out.println("Hello"); // 5 times

			num++;
		}

		System.out.println("    -----  DO WHILE CHECK CONDITION AFTER EXECUTION-----   ");

		int num1 = 10;

		do { // is less used than while
			System.out.println("Hello");
			
			num1++;
			

		} while (num1 <= 3);
		
		System.out.println("I want to print numbers from 1 to 30 using do whileloop");

		int num3 = 1;

		do {
			System.out.print(num3 + " ");
			num3++;

		} while (num3 <= 30);

	}

}
