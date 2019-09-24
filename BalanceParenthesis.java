package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.Stack;;

public class BalanceParenthesis {

	 public static void main(String[] args) {
		 
		 String exp="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) ";
		
	        boolean isBalanced = true;
	 
	        for (int i = 0; i < exp.length(); i++) 
	        {
	            char bracket = exp.charAt(i);
	            
	            if (bracket == '{' || bracket == '[' || bracket == '(')
	            {
	                Stack.push(bracket);
	            } 
	            else
	            {
	                if (bracket == '}' && bracket == ')' && bracket == ']') 
	                {
	                   Stack.pop();
	                } 
	               
	                if (Stack.isEmpty()) 
	                {
	                	
	                    isBalanced = false;
	                    break;
	                }
	                if (bracket == Stack.peek())
	                {
	                    Stack.pop();
	                } 
	                else
	                {
	                    isBalanced = false;
	                    break;
	                }
	            }
	        }
	 
	        if (isBalanced) 
	        {
	            System.out.println("YES");
	        }
	        else 
	        {
	            System.out.println("NO");
	        }
	    }

}
