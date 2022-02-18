package com.syntax.class10;

public class HW4_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * From an array of integer elements find the largest number.
		 * 
		 */
		
		int [] number = new int[] {15, 45, 10, 32};
		
		int largest = number[0];
		
		for (int n = 1; n<number.length; n++) {
			
			if (number[n] > largest) {
				
				largest = number[n];	
			}
		}
		
		System.out.println(largest);
		
		largest = number[0];//Enhanced for loop is unidirectional and always begins with the first index
		
		for (int num : number) {
			
			if (num > largest) {
				
				largest = num;
			}
			
			System.out.println(largest);
		}
		
	}

}
