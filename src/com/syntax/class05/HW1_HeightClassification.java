package com.syntax.class05;

import java.util.Scanner;

public class HW1_HeightClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Prompt the user to enter person heights in inches. 
		 * Person should be classified as one of the following:
		 * short (under 60 inch)
		 * medium(between 60 -72 inch)
		 * tall (over 72 inch)
		 * 
		 */

		Scanner getHeight = new Scanner(System.in);

		System.out.println("Please enter your height in inches");

		int height1 = getHeight.nextInt();

		if (height1 < 60) {
			System.out.println("short");

		} else if (height1 > 72) {
				System.out.println("tall");

			} else if (height1 > 60 || height1 > 72) {
				System.out.println("medium");

			}

		}
	}


