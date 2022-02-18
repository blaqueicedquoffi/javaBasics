package com.syntax.class06;

import java.util.Scanner;

public class Whip_Make {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Prompt user with questions: "Please enter your favorite car make" if user
		 * enters BMW --> carOrigin = "german car if user enters Toyota --> carOrigin =
		 * " japanese car" if user enters Maserati --> carOrigin = "italian car"
		 * anything else besides those values --> carOrigin = "unknown"
		 * 
		 * The output of your program should be:
		 * 
		 * "Your favorite car is ___"
		 * 
		 */

		String carOrigin = "BMW";
		Scanner getCar = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		carOrigin = getCar.nextLine();

		String whip;
		switch (carOrigin) {
		case "BMW":
			whip = "german car";
			break;
		case "Toyota":
			whip = "japanese car";
			break;
		case "Maserati":
			whip = "italian car";
			break;
		default:
			whip = "unknown";

		}

		System.out.println("Your favorite car is " + whip);

	}

}
