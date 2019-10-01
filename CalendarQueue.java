/**  Purpose: take month and year user input and print calendar of that month.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   30-09-2017
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.LinkedListNext;

import Utility.Utill;

import com.bridgelabz.datastructure.CalendarQ;


public class CalendarQueue {

	public static <T> void main(String[] args) {
	
	System.out.println("Enter month and year");
	int month=Utill.isInteger();
	int year=Utill.isInteger();
		
	System.out.println("Calendar "+ month + " " + year );
		
	/* array of months*/
	String[] Months= {"0" ,"Jan" , "Feb" , "Mar" ,"Apr" ,"May" ,"Jun" ,"Jul" ,"Aug" ,"Sept" ,"Oct" ,"Nov" , "Dec"};
		
	/* array for no. of days in month*/
	int[] Days= { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
	System.out.println(" "+Months[month]+ "" +year);
		
		
		/*Inserting elements into queue*/
		LinkedListNext<String> list=new LinkedListNext<String>();
		
		list.enQueue("SUN");
		list.enQueue("MON");
		list.enQueue("TUE");
		list.enQueue("WED");
		list.enQueue("THU");
		list.enQueue("FRI");
		list.enQueue("SAT");
		list.show();
		
		System.out.println();
	
		

	/* calculated first day of month*/
	int d = Utill.dayOfWeek(month, year);
	
	//System.out.println(d);
		
	/* printing first blank spaces */ 
	for (int i = 0; i < d; i++) {
		list.enQueue("      ");
	}

	/*inserting dates in calendar*/
	for (int i = 1; i <= Days[month]; i++)
	{
		if (i < 10)
			list.enQueue("  " + i);
		else
			list.enQueue(" " + i);
		 if((d+i)%7==0)
				list.enQueue("\n");
	}
	
	
	
		//printing calendar
		
		
	}

}
