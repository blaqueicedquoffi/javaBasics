package com.syntax.class10;

public class Task2_ArrayRetrieval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] countries = { "Poland", "Germany", "Russia", "UK" };

		String capital = null;

		for (int i = 0; i < countries.length; i++) {
			switch (countries[i]) {
			case "Poland":
				capital = "Warsaw";
				break;
			case "Germany":
				capital = "Berlin";
				break;
			case "Ukraine":
				capital = "Kiev";
				break;
			case "Russia":
				capital = "Moscow";
				break;
			case "UK":
				capital = "London";
				break;
			}
			System.out.println("The capital of " + countries[i] + " is " + capital);
		}

		System.out.println(" -----   Another way -------  ");

		for (String country : countries) {

			if (country.equals("Poland")) {
				capital = "Warsaw";
			} else if (country.equals("Germany")) {
				capital = "Berlin";
			} else if (country.equals("Ukraine")) {
				capital = "Kiev";
			} else if (country.equals("Russia")) {
				capital = "Moscow";
			} else if (country.equals("UK")) {
				capital = "London";
			}
			System.out.println("The capital of " + country + " is " + capital);
		}

	}

}
