/**  Purpose: take month and year user input and print calendar of that month.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   30-09-2017
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import Utility.Utill;

import com.bridgelabz.datastructure.CalendarQ;


public class CalendarQueue {

	public static void main(String[] args) {
	
	System.out.println("Enter month and year");
	int month=Utill.isInteger();
	int year=Utill.isInteger();
		
	System.out.println("Calendar "+ month + " " + year );
		
	/* array of months*/
	String[] Months= {"0" ,"Jan" , "Feb" , "Mar" ,"Apr" ,"May" ,"Jun" ,"Jul" ,"Aug" ,"Sept" ,"Oct" ,"Nov" , "Dec"};
		
	/* array for no. of days in month*/
	int[] Days= { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
	System.out.println(" "+Months[month]+ "" +year);
		
	CalendarQ<String> q = new CalendarQ<String>();
		
	CalendarQ<String> cal = new CalendarQ<String>();
		
		
		/*Inserting elements into queue*/
		q.enQueue(" SUN");
		
		q.enQueue(" MON");
		
		q.enQueue(" TUE");
		
		q.enQueue(" WED");
		
		q.enQueue(" THU");
		
		q.enQueue(" FRI");
		
		q.show();
		
		System.out.println();
	
		

	/* calculated first day of month*/
	int d = Utill.DayOfWeek(1, month, year);
	
	//System.out.println(d);
		
	/* printing first blank spaces */ 
	for (int i = 0; i < d; i++) {
		cal.enQueue("      ");
	}

	/*inserting dates in calendar*/
	for (int i = 1; i <= Days[month]; i++)
	{
		if (i < 10)
			cal.enQueue("  " + i);
		else
			cal.enQueue(" " + i);
		 if((d+i)%7==0)
				cal.enQueue("\n");
	}
	
	
	
		//printing calendar
		cal.show();
		
		
	}

}
