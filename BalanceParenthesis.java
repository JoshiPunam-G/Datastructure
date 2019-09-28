
/* 
/*  Purpose:Program for checking whether arithmetic expression is balanced or not
 * 
 *  @author  BridgeLabz
 *  @version 1.0 
 *  @since   24-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.Stack;
import Utility.Utill;

public class BalanceParenthesis {
	

	 public static void main(String[] args) {

		  System.out.println("Enter Expression");
		  String exp=Utill.isString();
	      System.out.println( Stack.check(exp)); 
	 }
	 
}
