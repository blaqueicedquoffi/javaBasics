package com.syntax.class10;

public class HW2_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create an array of animals and store 5 elements into it. Using 2 different
		 * loops print all elements from the array.
		 * 
		 */

		String[] animals = { "Tiger", "Panda", "Koala", "Panther", "Elephant" };

		// Classic For Loop

		for (int a = 0; a < animals.length; a++) {
			System.out.println(animals[a] + " ");
		}
		// For Each Loop
		System.out.println("\n----------------");

		for (String animal : animals) {
			System.out.println(animal + " ");
		}

	}

}
