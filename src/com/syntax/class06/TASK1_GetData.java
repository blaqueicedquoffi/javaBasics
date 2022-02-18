package com.syntax.class06;

import java.util.Scanner;

public class TASK1_GetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ask user to enter their country and capture it. Once values are captured:
		 * Print which language user speaks.
		 */

		Scanner getData = new Scanner(System.in);
		System.out.println("Where are you from?");
		String country = getData.nextLine();
		String language;

		switch (country.toLowerCase()) {

		case "usa":
			language = "English";
			break;
		case "italy":
			language = "Italian";
			break;
		case "germany":
			language = "Deutsche";
			break;
		case "china":
			language = "Chinese";
			break;
		default:
			language = "unknown";

		}
		
		getData.close();
		 
		System.out.println("In " +country+ " people speak "+ language);

	}

}
