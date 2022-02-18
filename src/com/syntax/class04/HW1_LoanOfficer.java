package com.syntax.class04;

public class HW1_LoanOfficer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * You are a loan specialist and you need to ask 
		 * user the amount of loan the lender requests. 
		 * If loan is less or equal to 200,000 then you would lend the money, 
		 * Otherwise you would reject the client.
		 *
		 */
		
		int loan = 95000;
		
		if(loan<=200000) {
			System.out.println("Congratulations! You're eligible for the loan!");
			
		} else {
			System.out.println("Dear Client, we're sorry to inform you that your loan request has been denied!");
		}

	}

}
