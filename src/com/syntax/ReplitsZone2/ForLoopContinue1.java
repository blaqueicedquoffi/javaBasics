package com.syntax.ReplitsZone2;

public class ForLoopContinue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * For you to do:
		 * 
		 * Using for loop Print 1 to 10 Numbers except 5 and 6
		 */
		
		for (int p=1; p <=10; p++) {
			if (p == 5 || p == 6) {
				continue;
			}
			System.out.println(p);
		}

	}

}
