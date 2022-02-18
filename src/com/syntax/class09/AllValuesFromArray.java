package com.syntax.class09;

public class AllValuesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] grade = { 'A', 'B', 'C', 'D' };

		// how many elements inside array?
		int size = grade.length;// 4
		System.out.println("Numbers of elements is = " + size);

		/*
		 * System.out.println(grade[1]); System.out.println(grade[2]);
		 * System.out.println(grade[3]);
		 */

		for (int i = 0; i < size; i++) {
			System.out.print(grade[i] + "   ");
		}

		System.out.println(" --------------------------------   ");
		/*
		 * for(int i=0; i<=grade.length;i++) { System.out.print(grade[i]+"   ");
		 * java.lang.ArrayIndexOutOfBoundsException: 4 }
		 */
		String[] cities = { "Washington DC", "Boston", "Miami", "Los Angeles", "New York" };
		// if value is Miami --> I want to live in Miami

		for (int a = 0; a < cities.length; a++) {
			System.out.println(cities[a] + "   ");

			if (cities[a].equals("Miami")) {
				System.out.println("I  want to live in Miami");
			}

	}

}
}
