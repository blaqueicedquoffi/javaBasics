package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scenario: I need to compare two numbers to determine the larger value
		 */
		
		int num1 = 100;
		
		int num2 = 50;
		
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
			
		double money = 5;
		
		double priceCoffee = 4.99;
		
		/* 
		  * If I have more money than the price of coffee --> I'm buying coffee.
		  * N.B: Always remember, a conditional statement opens with a code block!
		  * When condition is true, then result will be executed within the code block
		  * Otherwise , it will fail to execute because, the code block will not allow false values to be executed.
		  */
		
		if (money>=priceCoffee) {  // N.B: Always remember, a conditional statement automatically opens with a code block!  
			
			System.out.println("I'm buying the coffee!");
				
		}
		/*
		 * if (money=priceCoffee); { //Error because, the declared "If" condition must always be a boolean operator. 
		 *  There was an error because the assignment operator was used. 
		 */
		
		}
	}
	
}




	


	
