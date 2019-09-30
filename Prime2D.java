
/**  Purpose: Printing 2D array if prime number.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   30-09-2017
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import Utility.Utill;

public class Prime2D {
	
	
	/*Logic for printing for loop*/
	
	public static void printRow(int[] row) {
	
        for (int i : row) {
       System.out.println(" Prime starts from :"+ (i*1)); 
            System.out.print("[" +i+ "]");
            System.out.print("\t");
        }
        System.out.println();
    }

	public static void main(String[] args) {
	
		int[][] prime=new int[10][100];
		int[][] anagram=new int[10][100];
		
		int start=1;
		int end=100;
		int str1;
		int str2;
		
		int j1=0 , j2=0;
		
		/*declaration of array*/
		for(int i=0;i<10;i++)
		{
			for(int j=start;j<=end;j++)
			{
				if(Utill.PrimeLogic(j) )
				{
					j1++;
				}
			}
			prime[i]=new int[j1];
			start=end+1;
			end=end+100;
			j1=0;
			
		}
		
	
		
		/*Putting values into array*/
		 start=0;
		 end=100;
		 for(int i=0;i<10;i++)
		 {
			 for(int j=start;j<=end;j++)
			 {
				 if(Utill.PrimeLogic(j) )
				 {
					 prime[i][j2]=j;
					 j2++;
				 }
			 }
			 start=end+1;
			 end=end+100;
			 j2=0;
			 
			 
		 }
		
		

		 /*Printing For loop*/
		 System.out.println("--Prime Numbers Between Range of 0-1000--");
		 System.out.println();
		 for(int[] row : prime) {
	            printRow(row);
	        }
		
		
		
		
    }
}



