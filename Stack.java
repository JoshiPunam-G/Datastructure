
/**
 * Utility class for Stack
 */

package com.bridgelabz.datastructure;

import java.util.*;

	class Stack
	{
		
		/* Declaration and initialization  */
		static int MAX=1000;
		static int top=-1; 
        static int items[] = new int[MAX]; 
  
        /**
         *  Purpose: for insertion of data into stack
         *   
         * @param i
         */
        public static int push(int i)  
        { 
            if (top == MAX-1)  
            { 
                System.out.println("Stack full"); 
            }  
            else 
            { 
                items[++top] = i;
                //top++;
            }
			return i; 
        } 
        
        /**Purpose: method for deletion of data from stack
         * 
         * @return
         */
  
        public static int pop()  
        { 
            if (top == -1)  
            { 
                System.out.println("Underflow error"); 
                return '\0'; 
            }  
            else 
            { 
                int element = items[top]; 
                top--; 
                return element; 
            } 
        } 
        
        /**
         * Purpose: method to check if stack is empty or not
         * @return
         */
  
       public  static boolean isEmpty()  
        { 
            return (top == -1) ? true : false; 
        } 
       
       
       /**
        * Purpose : method for getiing top element of stack
        * @return
        */
       
      public static int peek() 
       { 
           if (top < 0) { 
               System.out.println("Stack Underflow"); 
               return 0; 
           } 
           else { 
               int x = items[top]; 
               return x; 
           } 
       } 
      
      
      public static void show()
      {
    	  if(top == -1)
    	  {
    		  System.out.println("Underflow");
    	  }
    	  else
    	  {
    		  
    	  }
      }
    
      
      
      /**
       * 
       * Purpose :Method for cheking whether expression is balanced or not.
       * @param exp
       * @return
       */

			/* Method for cheking whether expression is balanced or not */
			public static boolean check(String exp)
			{
				/* conversion of string array into char array */
				char[] ch=exp.toCharArray();
				
				/* for loop for traversing character of expression  */
				for(int i=0;i<exp.length();i++) 
			       { 
			          /* if ch[i] contain (,{,[ then push bracket */
			          if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[') 
			            Stack.push(ch[i]);                                 
			          
			          
			          /* it check for closing bracket and stack is empty or not */
			          else if ((ch[i] == '}' || ch[i] == ')' || ch[i] == ']') && (!Stack.isEmpty()))  
			          {    
			        	  
			        	  
		                if((Stack.peek()=='(' &&  ch[i]==')') || ( Stack.peek()=='[' && ch[i]==']') || (Stack.peek()=='{' && ch[i]=='}'))	        	                                                                             //then pop it
		                { 	
		                	
			             Stack.pop();
		                }
		                else
		                {
		                	System.out.println("Not Balanced");
		                	
		                }
			                
			          }
			          else
			          {
			        	  if(ch[i]==')'  || ch[i]==']' || ch[i]=='}')
			        	  {
			        		  System.out.println("not balanced");
			        	  }
			          }
			         
			  	}
				
				return false;
			}

			
			
	}

     


