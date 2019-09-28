
/**  Purpose: implementation of linkedlist.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   21-09-2017
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Utility.Utill;
  

public class UnorderList
{
     public static void main(String[] args) throws IOException {  
    	 String line;
    	 
    	 int count = 0;
    	 
    	 String[] words=new String[10];
    	 
    	 //Opens a file in read mode
    	 
    	 FileReader file = new FileReader("/home/bridgeit/Downloads/test.txt");
    	 
    	 BufferedReader br = new BufferedReader(file);  
    	              
    	 //Gets each line till end of file is reached
    	 
    	 while((line = br.readLine()) != null)
    	 {  
    	    //Splits each line into words
    		 
    	      words = line.split(" ");
    	       
    	      //Counts each word
    	      
    	      count = count + words.length;  
    	 }  
    	           
    //	System.out.println("Number of words present in given file: " + count);
    	 
    	 System.out.println("---Words present in given file---");
    	
    	    LinkedList l=new LinkedList();
    	
    	       	    
    	   for(int i=0;i<words.length;i++)   
    	   {
    		   String str=words[i];
    		   
    		   l.insert(str);
    	   }
    	   
    	   
    	   l.show();
    	  
    	System.out.println("Enter element which you want?");
    	   
    	   String element=Utill.isString();
    	 //  System.out.println(l.searchNode(element));
    	   l.searchNode(element);
           l.show();
    	  	
    	
    	  
    	   //System.out.println("Length of LinkedList is:"+l.lengthOfLinkedList()); 
    	   
    	   br.close();
    	   

       }  
	}  	   


	    	
	





























/* String line;  
int count = 0;  
         
//Opens a file in read mode  
FileReader file = new FileReader("/home/bridgeit/Downloads/test.txt");  
BufferedReader br = new BufferedReader(file);  
             
//Gets each line till end of file is reached  
while((line = br.readLine()) != null)
{  
   //Splits each line into words  
     String words[] = line.split(" ");  
     //Counts each word  
     count = count + words.length;  
}  
          
  System.out.println("Number of words present in given file: " + count);  
  br.close();
*/





