package com.syntax.class10;

public class Task1_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a 2D array (longer way)where you will store the following values:
		 *  Mr, Mrs, Ms, Miss and  
		 *  Smith, Jordan, Jackson, Obama.
		 *  After storing values print following String:
		 *  Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 * 
		 */
		
		String [][] celebrity = new String [4][4];
		
		celebrity[0][0] = "Mr Smith";
		celebrity[0][1] = "Mr Jordan";
		celebrity[0][2] = "Mr Jackson";
		celebrity[0][3] = "Mr Obama";
		
		celebrity[1][0] = "Mrs Smith";
		celebrity[1][1] = "Mrs Jordan";
		celebrity[1][2]	= "Mrs Jackson";
		celebrity[1][3] = "Mrs Obama";
		
		celebrity[2][0] = "Ms Smith";
		celebrity[2][1] = "Ms Jordan";
		celebrity[2][2] = "Ms Jackson";
		celebrity[2][3] = "Ms Obama";
		
		celebrity[3][0] = "Miss Smith";
		celebrity[3][1] = "Miss Jordan";
		celebrity[3][2] = "Miss Jackson";
		celebrity[3][3] = "Mrs Obama";

	}

}
