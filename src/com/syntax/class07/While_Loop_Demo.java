package com.syntax.class07;

public class While_Loop_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while (i <= 5) {// i increases 5x
			System.out.println(i);
			i++;
		}
		System.out.println("The value of i outside of while loop = " + i);
		
		// I need to print values from 2 to 20 ( a increases 20x
		int a = 2;
		while (a <= 20) {
			System.out.println(a);
			a++;
		}
		// I need to print values from 1 to 50 all in 1 line
		int b = 1;
		while (b <= 50) {
			System.out.print(b + " ");
			b++;
		}
		System.out.println(" --  I NEED NUMBERS FROM 20 TO 1--");
		int c = 20;
		while (c >= 1) {
			System.out.print(c + " ");
			c--;
		}
		System.out.println("The End");
		// TASK
		System.out.println("    PRINT ONLY EVEN NUMBERS FROM 1 TO 30    ");
		int d = 2;
		while (d <= 30) {
			System.out.print(d + " ");
			d += 2;// same as d=d+2;
		}
		System.out.println("another way to print even numbers from 1 to 30");

		int e = 1;

		while (e <= 30) {
			if (e % 2 == 0) {
				System.out.print(e + " ");
				
			}
			e++;
		}
		System.out.println("End of the code");

	}

}
