

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
import java.util.Scanner;

import Utility.Utill;

public class OrderList {

	public static void main(String[] args)throws Exception {
         String[] number;
    	 
    	 int count = 0;
    	 
    	 TestLinked t=new TestLinked();
    	 
    	 File file = new File("/home/bridgeit/Downloads/order.txt"); 
    	  
    	  BufferedReader br = new BufferedReader(new FileReader(file)); 
    	  
    	  String st; 
    	  while ((st = br.readLine()) != null)  
    	  System.out.println(st);
    	
    	  String s=st;
    	  System.out.println();
    	  System.out.println("After Sorting");
    	  
    	  
    	  t.sortList(s);
    	  
    	  t.show();
	

	  
	}

	
}
	



