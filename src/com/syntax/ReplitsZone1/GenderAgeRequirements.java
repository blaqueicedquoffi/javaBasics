package com.syntax.ReplitsZone1;

import java.util.Scanner;

public class GenderAgeRequirements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ask the user to enter his/her gender 
		 * "Please enter your gender: M or F" and 
		 * their age "Please enter your age"
		 * You have 2 conditions:
		 * If age is above 25, then check if a user entered F 
		 * then the output should be "Woman" 
		 * otherwise it should say "Man"
		 * If age is below 25, 
		 * then check if a user entered F 
		 * then the output should be "Girl" 
		 * otherwise it should say "Boy"

		 *Example Output:
		 * Please enter your gender: M or F
		 * Please enter your age
		 * 
		 * Example Output:
		 * 
		 * Please enter your gender: M or F
		 * Please enter your age
		 * Boy
		 * 
		 * Example Output:
		 * 
		 * Please enter your gender: M or F
		 * Please enter your age
		 * Woman
		 * 
		 * Example Output:
		 * 
		 * Please enter your gender: M or F
		 * Please enter your age
		 * Girl
		 * 
		 * 
		 */
		
		Scanner getInfo = new Scanner(System.in);System.out.println("Please enter your gender: M or F");
        char getGender = getInfo.next().charAt(0);
        System.out.println("Please enter your age");
        int getAge = getInfo.nextInt();
		
        if (getAge>=25) {
            
            if (getGender=='F') {
                System.out.println("Woman");
            } else {
              System.out.println("Man");
            }
              
            } else {
                if (getGender=='F') {
                 System.out.println("Girl");
                 
                 }else {
                 System.out.println("Boy");
               }

            }

	}

}
