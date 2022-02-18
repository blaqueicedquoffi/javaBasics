package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 100;
		
		int num2 = 500;
		
		//To determine the larger number, use the relational operators.
		
		if (num1>num2) {
			System.out.println(num1+" is less than "+num2);
		}else {
			System.out.println(num2+" is larger than "+num1);
			
			int temp = 45;
			
			//If temperature is more than 45--> "I'm going for a walk"
			//Otherwise,--> "I'm staying home"
			
			if(temp>=45) {
				System.out.println("I'm going for a walk.");
			}else {
				System.out.println("I'm staying home!");
				
			}
			
			/* I need a variable that stores a gender
			 * If gender is F (female) --> "Please use front of train"
			 * Otherwise, --> "Please use rear of train"
			 * Always note, using char and string values, we are permitted to use (==) the equals assignment
			 */
			
			char gender = 'F';
			
			if (gender=='f') {
				System.out.println("Please use front of train");
			}else {
				System.out.println("Please use rear of train");
				
			}
			
			/*  The assigned gender value represented by Char 'F', should be the same when the boolean is declared. 
			 *  Otherwise, the value will return a false or true value in the else code block.
			 * 
			 */
			
		}
		
	}



}
