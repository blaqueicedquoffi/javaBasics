package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* create a variable and assign a value
		 * 
		 * declare a variable and initialize
		 */
		//1
		int age=25;
		
		//2
		int num1; //declare a variable
		num1=10; //initialize it
		num1=100;//reassign the value
		System.out.println(num1);
		System.out.println(age);
		
		int n1, n2, n3; // 3 variables are declaring the integer type.
		n1=10;
		n2=20;
		n3=26;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		//int Age=26; // Variable Age can be reassigned
		
		//Age=26.5; // Error: Age variable can hold only int value
		age =57;
		age =75;
		System.out.println(age);
		
		//Java allows the use of "_" or "$" as identifiers. Refer to Oracle guide rules.
		double $price=1.99;
		
		double _value=2.99;
		
		char character1= 'a';
		
		boolean Break=true;
		
		System.out.println($price);
		System.out.println(_value);
		System.out.println(character1);
		System.out.println(Break);
		
		int bigNumber = 1324378;
		
		System.out.println(bigNumber);
		
		
		
	}

}
