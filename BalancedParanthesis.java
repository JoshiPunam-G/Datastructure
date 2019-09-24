
/* 
/*  Purpose:Program for checking whether arithmetic expression is balanced or not
 * 
 *  @author  BridgeLabz
 *  @version 1.0 
 *  @since   24-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.Stack;;

public class BalancedParanthesis {
	
     public static String checkBalancedParentesis(String expr)
    {
		/* if (expr.isEmpty())
		 return "Balanced";*/
		 
		// Stack<Character> stack = new Stack<Character>();
		 for (int i = 0; i < expr.length(); i++)
		 {
			 char current = expr.charAt(i);
			 if (current == '{' || current == '(' || current == '[')
			 {
				 Stack.push(current);
			 }
			 if (current == '}' || current == ')' || current == ']')
			 {
				 System.out.println(current);
				 
				   if (Stack.isEmpty())
					System.out.println("Balanced Parenthesis");
				 
				 char last = (char) Stack.peek();
				 
				 if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
				 {
					 Stack.pop();
					 
					 System.out.println(current);
				 }
				 else 
					 return "Not Balanced";
			 }
        }
		 return Stack.isEmpty()?"Balanced":"Not Balanced";
	}
		 
		 
	 public static void main(String[] args) 
	{
	  String Expr1=checkBalancedParentesis("(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)");
	  System.out.println(": "+Expr1);
			
	}
			
 }

		
	
	
   
	

