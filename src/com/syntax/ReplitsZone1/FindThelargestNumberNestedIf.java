package com.syntax.ReplitsZone1;

import java.util.Scanner;

public class FindThelargestNumberNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to find the largest number among three distinct numbers 
		 * using nested if condition
		 * Please use Scanner class to take input from users
		 * 
		 * Expected Output:
		 * Please enter 3 distinct numbers 4 5  and 14
		 * The largest number is 14
		 * 
		 * 
		 */
		
		Scanner getNumber = new Scanner(System.in);

		  System.out.println("Please enter 3 distinct numbers");
		  
		  int getNum1 = getNumber.nextInt();// Ask user to insert any # including (-#) without printing the value
		  
		  int getNum2 = getNumber.nextInt();
		  
		  int getNum3 = getNumber.nextInt();
		  

		  if (getNum1>=getNum2 && getNum1>getNum3) {
		    
		      System.out.println("The largest number is "+getNum1);
		     
		    }   
		    else if (getNum2>=getNum1 && getNum2>=getNum3) {
		        System.out.println("The largest number is "+getNum2);

		      } else{
		      System.out.println("The largest number is "+getNum3);
		    }
		  
		  

	}

}
