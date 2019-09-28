package com.bridgelabz.datastructure;

import Utility.Utill;
public class Calendar {
	
	/* method for printing calendar dates */
	 public static int day(int month, int day, int year) 
	 {
	        int y = year - (14 - month) / 12;
	        
	        int x = y + y/4 - y/100 + y/400;
	        
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        
	        int d = (day + x + (31*m)/12) % 7;
	        
	        return d;
	 }

	    /* return true if the given year is a leap year */
	 public static boolean isLeapYear(int year)
	 {
	        if  ((year % 4 == 0) && (year % 100 != 0))
	        	return true;
	        
	        if  (year % 400 == 0) 
	        	return true;
	        
	        return false;
	 }

	public static void main(String[] args) {
		System.out.println("Enter Month");
		
		int month=Utill.isInteger();
		
		System.out.println("Enter year");
		
		int year=Utill.isInteger();
		
	  /* months[i] = name of month i*/
	 String[] months = { "January", "February", "March",
	                     "April"  , "May"     , "June",
	                     "July"   , "August"  , "September",
	                     "October", "November", "December" };

	  /* days[i] = number of days in month i*/
	 int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	  /*check for leap year*/ 
	  if (month == 2 && isLeapYear(year)) days[month] = 29;
	  
	  /*print calendar header*/ 
	  System.out.println("   " + months[month] + " " + year);
	  
	  System.out.println(" S  M Tu  W Th  F  S");
	  
	  /*starting day*/ 
	  int d = day(month, 1, year);

	  /*print the calendar*/ 
	        for (int i = 0; i < d; i++)
	          System.out.println("");
	        
	        for (int i = 1; i <= days[month]; i++) 
	        {
	          System.out.printf("%2d ", i);
	          
	          if (((i + d) % 7 == 0) || (i == days[month])) 
	           System.out.println();
	        }

	}

}
