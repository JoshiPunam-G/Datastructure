package com.bridgelabz.datastructure;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import Utility.Utill;

public class OrderList {

	public static void main(String[] args)throws Exception {
         String line;
    	 
    	 int count = 0;
    	 
    	 String[] words=new String[10];
    	 
    	 //Opens a file in read mode
    	 
    	 FileReader file = new FileReader("/home/bridgeit/Downloads/order.txt");
    	 
    	 BufferedReader br = new BufferedReader(file);  
    	              
    	 //Gets each line till end of file is reached
    	 
    	 while((line = br.readLine()) != null)
    	 {  
    	    //Splits each line into words
    		 
    	      words = line.split(",");
    	       
    	      //Counts each word
    	      
    	      count = count + words.length;  
    	 }  
    	           
    //	System.out.println("Number of words present in given file: " + count);
    	 
    	 System.out.println("---Words present in given file---");
    	
    	    TestLinked t=new TestLinked();
    	
    	       	    
    	   for(int i=0;i<words.length;i++)   
    	   {
    		   String str=words[i];
    		  
    		   t.insert(str);
    		   
    		  
    	   }
    	 
    	   
    	   
    	   t.show();
    	   
           System.out.println("Enter element which you want?");
    	   
    	   String element=Utill.isString();
    	   
    	   if(t.search(element))  
	        {
    		   System.out.println("Element is present "); 
	           t.deleteNode(element);
	           t.show();
	        }
	        else  
	        {
	            System.out.println("insert data");
	            t.insert(element);
	            t.show();
	        }
    	
    	   br.close();
    	   


	  
	}
	
}
	



