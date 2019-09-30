

/**  Purpose: implementation of linkedlist.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   21-09-2017
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

import Utility.Utill;

public class OrderList {

	private static final String[] String = null;
	public static int[] array;

	@SuppressWarnings("null")
	public static void main(String[] args)throws Exception {
    /*    String line;
        
       String intfile = new String();
    	 
    	 int count = 0;
    	 
    	 String[] words=new String[10];
    	 
  
    	 FileReader file = new FileReader("/home/bridgeit/Downloads/order.txt");
    	 
    	 BufferedReader br = new BufferedReader(file);  
    	 
    	 while((line = br.readLine()) != null)
    	 {  
    	      intfile = intfile+ line;  
    	      
    	      words=intfile.split(" ");
    	    
    	 }  
    	 
    	  System.out.println(intfile);
    	  
    	 TestLinked t=new TestLinked();
    	
    	  array=new int[words.length];
    	
    	  t.display();
    	  
    	  
    	//  System.out.println("After Sorting");
    	  
    	for(int i=0;i<array.length;i++)
    	{
    		array[i]=Integer.parseInt(words[i]);
    		
    		t.sortList(array);
    	}
	    
    	
    	 t.display(); 
	     t.searchData();
	     t.display();*/
		
		LinkedListUtility.getDataFromFile();
		LinkedListUtility.integerFileReader();
		LinkedListUtility.Display();
	}

	
}
	



