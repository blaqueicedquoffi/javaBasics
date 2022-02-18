package com.syntax.class03;

public class PrimitiveCasting {
	
	//main+ctrl+space
	//ctrl+space ---> autocomplete
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 100;
		
		/*
		 * Widening or implicit
		 * We store int value 10 inside double variable.
		 */
		
		double d = 10;
		
		System.out.println(i); //10
		System.out.println(d); //10.0
		
		
		/*int num = 10.0; //Type mismatch: cannot convert from (double) to (int).
		 * Narrowing or explicit casting
		 * We store double value 10.99 into (int) variable
		 */
		
		int num =(int)10.99;
		System.out.println(num);
		
		//float f= 10.99f; //Type mismatch: cannot convert from double to float
		byte b=(byte)1000;
		System.out.println(b);
		
		long number= 11568768768l;
		System.out.println(number);
		
		//narrowing
		int numb=(int)11568768768l;
		
		System.out.println(numb);
		
	}
		
		
		

	}


