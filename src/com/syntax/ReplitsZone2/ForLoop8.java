package com.syntax.ReplitsZone2;

public class ForLoop8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that uses for loop to prints multiplication of number 3 from 1 to 10
		 * 
		 * Expected Output:
		 * 
		 * 3*1=3
		 * 3*2=6
		 */
		
		int numP = 3;
		
		int result;
		
		for (int i = 1; i <= 10; i++) {
			result = numP * i;
			System.out.println(numP +"*"+i+"="+result);
		}

	}

}
