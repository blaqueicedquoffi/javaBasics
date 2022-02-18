package com.syntax.class10;

public class HW3_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create an array of integers and, 
		 * calculate the sum of all elements in array
		 * 
		 */

		int[] numbers = new int[] { 10, 20, 30, 40, 50 };
		
		int size = numbers.length;

		int sum = 0;

		for (int i = 0; i < size; i++) {// or: for(int i = 0; i<numbers.length; i++) can be used without declaring size
			sum = sum + numbers[i];
		}
		System.out.println("Sum of all elements in the array:" + " " + sum);
		
		//Enhanced For loop version:
		
		sum = 0 ;
		
		for (int num : numbers) {
			sum += num;
		}
		
		System.out.println("Sum of all elements in the array:" + " " + sum);

	}
	
	
	

}
