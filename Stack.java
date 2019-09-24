
/* 
/*  Purpose:Program for checking whether arithmetic expression is balanced or not
 * 
 *  @author  BridgeLabz
 *  @version 1.0 
 *  @since   24-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

public class Stack {
	
	  static final int MAX = 1000;
	  
	  static int top;
	    
	  static int a[] = new int[MAX]; // Maximum size of Stack 
	  
	  /**
	   * check if stack is empty or not
	   * @return
	   */
	    static boolean isEmpty() 
	    { 
	        return (top < 0); 
	    } 
	   
	  //initially stack is in empty state
	   
	    Stack() 
	    { 
	        top = -1; 
	    } 
	  
	  /**
	   * insert element into the 
	   * @param x
	   */
	  public static  void push(int x) 
	    { 
	        if (top >= (MAX - 1)) 
	        { 
	            System.out.println("Stack Overflow"); 
	           // return false; 
	        } 
	        else 
	        { 
	            a[++top] = x; 
	           // System.out.println(x + " pushed into stack"); 
	           // return true; 
	        } 
	    } 
	  
	   //delete elements from stack 
	  public static  int pop() 
	    { 
	        if (top < 0 )
	        { 
	            System.out.println("Stack Underflow"); 
	            return 0; 
	        } 
	        else 
	        { 
	            int x = a[top--]; 
	            return x; 
	        } 
	    } 
	  
	   //peek return the starting element of stack.
	   public static int peek() 
	    { 
	        if (top < 0) { 
	            System.out.println("Stack Underflow"); 
	            return 0; 
	        } 
	        else { 
	            int x = a[top]; 
	            return x; 
	        } 
	    } 
	
	   
	   /*function for check Balanced Parenthesis */
	   public static String check(String exp)
		{
		  
			 if (exp.isEmpty())
			 return "Balanced";
			 
			 //Stack<Character> stack = new Stack<Character>();
			 for (int i = 0; i < exp.length(); i++)
			 {
				 char current = exp.charAt(i);
				 
				 if (current == '{' || current == '(' || current == '[')
				 {
					 Stack.push(current);
				 }
				 if (current == '}' || current == ')' || current == ']')
				 {
					 if (!Stack.isEmpty())
						 return " ***Not Balanced";
					 char last = (char) Stack.peek();
					 if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
						 Stack.pop();
					 else 
						 return "Not Balanced***";
				 }	
			 }
			// return Stack.isEmpty()?"Balanced":"Not Balanced";
			 if(Stack.isEmpty())
			 {
				 System.out.println("balance");
			 }
			 else
			 {
				 System.out.println("Not balanced");
			 }
			return exp;
			 
	   }
	   
	   
	   public static void show()
	   {
		   System.out.println("Elements deleted");
		   for(int i=0;i<MAX;i++)
		   {
			   System.out.println(""+a[i]);
		   }
		  
		   
	   }
	
		  
	
	   


	

	

}
