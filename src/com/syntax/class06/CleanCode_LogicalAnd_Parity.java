package com.syntax.class06;

public class CleanCode_LogicalAnd_Parity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*                                             
   		 * Given 3 #s, determine the largest                                          
   		 *  Then determine the parity-(if result is even or odd)                                         
		 */                                          
                                                      
       		int num1 = 1000;                              
       		int num2 = 2000;                              
       		int num3 = 3001; 
       		
       		int largest = 0;
       		
                                                      
       		if (num1 > num2 && num1 > num3) {            
                                                      
       			largest = num1;
                                                      
       		} else if (num2 > num1 && num2 > num3) {     
       			                                            
       			largest = num2;
                                                      
       		} else if (num3>num1 && num3>num2) {         
       			                                            
       			largest = num3;
       			
       		} 
       		
       		System.out.println(largest);
       		
       		if (largest%2==0) {
       			System.out.println(largest+" is an even number.");
       			
       		} else {
       			System.out.println(largest+" is an odd number.");
       		}

	}

}
