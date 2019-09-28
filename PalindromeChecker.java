package com.bridgelabz.datastructure;


import com.bridgelabz.datastructure.Dequeue;
import Utility.Utill;



public class PalindromeChecker {
	
public static void main(String[] args) throws Exception
{
		System.out.println("-Enter String-");
		
		String inputString=Utill.isString();
		
		char[] ch=inputString.toCharArray();
		
		Dequeue deque=new Dequeue(ch.length);
		
        int flag=0;
		 //adding each character to the rear of the deque
		    for(int i=0;i<ch.length;i++)
		    {
			  //System.out.println(ch);
			  //char element =inputString.charAt(i);
			  char element=ch[i];
			   Dequeue.insertrear(element);
		    }
//		    if(ch.length % 2 == 0) {
//		    	length = ch.length/2 - 1;
//		    }
//		    else {
//		    	length = ch.length/2;
//		    }
		    
		   for(int i=0;i<ch.length/2 - 1;i++)
		   {
//			   System.out.println("Dequeue.deletefront():"+Dequeue.deletefront());
//			   System.out.println("Dequeue.deleterear():"+Dequeue.deleterear());
			   
				   if(Dequeue.deletefront()!= Dequeue.deleterear())
				   {
					   flag=1;
					   break;
				   }
			   
		   }
		   System.out.println(flag);
		   if(flag==1)
		   {
			   System.out.println(" not Palindrome");
		   }
		   else
		   {
			   System.out.println(" palindrome");
		   }
	
	}

}
