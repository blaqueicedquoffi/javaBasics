package com.syntax.class10;

public class HW1_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create an array of cars and store 6 elements into it.
		 * 
		 * Using 2 different loops print all values from the array.
		 * 
		 */

		String[] cars = { "Audi", "BMW", "Honda", "Ford", "Kia", "Lexus" };

		// Classic For Loop

		for (int c = 0; c < cars.length; c++) {
			System.out.println(cars[c] + " ");

		}
		// For Each Loop
				System.out.println("\n--------------------------");
				
				for (String car : cars) {
					System.out.println(car + " ");
				}

	}
}
