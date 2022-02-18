package com.syntax.class03;

public class MoreExamples {
	
	public static void main(String[] args) {
		
		/*
		 * I need to declare a Boolean variable hungry (yes or no).
		 * 
		 * If I'm are hungry, then --> "I'm going to eat."
		 * Otherwise, --> "I'll be drinking tea!"
		 */
		
		boolean hungry = true;
		
		if(hungry) {
			System.out.println("I'm going to eat.");
			
		}else {
			System.out.println("I'll be drinking tea!");
		}
		
		boolean traffic = false;
		
		if(traffic) {
			System.out.println("I'll be late.");
		
		}else {
			System.out.println("No traffic, I'll be on time!");
		}
		
		/* Define a variable to store a browser.
		 * If browser is Chrome --> "Test cases will be executed on Chrome."
		 * Otherwise --> "I'm not executing any test cases!"
		 */
		
		String browser = "Chrome";
		
		/* Always use the equals sign to  compare two strings.
		 * Be mindful of the initial characters used since they're case sensitive.
		 * 
		 */
		
		if (browser.equals("Chrome")) {
			System.out.println("Test cases will be executed on Chrome browser.");
		
		}else {
			System.out.println("I'm not executing any test cases!");
		}
		
		//Would work in this example, but not preferred.
		if (browser=="chrome") { 
		System.out.println("Test cases will be executed.");
		}else {
		System.out.println("I'm not executing any test cases!");
		}
		
		/* Type mismatch within the string's initial character will result in a false value.
		 * Line 52 executed the else{} instead of the if{} because of the lower-case 'c'!
		 * If (browser) {  }// Error: type Mismatch: cannot convert from string to boolean.
		 */
		
	}
	
}