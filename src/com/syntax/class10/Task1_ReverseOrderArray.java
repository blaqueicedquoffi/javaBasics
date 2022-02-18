package com.syntax.class10;

public class Task1_ReverseOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array and retrieve all elements in reverse order
		
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);	
		}
		
		System.out.println(" Reverse order ");
		
		for (int i = arr.length-1; i >= 0; i--) {
			
			System.out.println(arr[i]);
		}
		
		System.out.println(" Another way ");
		
		int [] arrs = { 45, 23, 15, 30 };
		
		for (int i = 0 ; i < arrs.length; i++) {
			
			System.out.print(arrs[arrs.length-i-1] + " ");//System.out.println((arrays.length-i)-1);
		}

	}

}
