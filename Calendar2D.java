package com.bridgelabz.datastructure;
import Utility.Utill;
public class Calendar2D {

		static int[][] calender = new int[5][7];
		static int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
      
		/**
		 * 
		 */
		static void initCal() {
			for (int i = 0; i < calender.length; i++) {
				for (int j = 0; j < calender[i].length; j++) {
					calender[i][j] = 0;
				}
			}
		}

		static void display(int m) {
			System.out.println("	Sun	Mon	Tue	Wed	Thu	Fri	Sat");

			for (int i = 0; i < calender.length; i++) {
				for (int j = 0; j < calender[i].length; j++) {
					if (calender[i][j] < 0 || calender[i][j] > month[m - 1]) {
						System.out.print("\t ");
					} else if (calender[i][j] > 0) {
						System.out.print("\t" + calender[i][j] + " ");
					}
				}
				System.out.println("\t");
			}
		}
		

		/**
		 * Finding if a year is Leap Year or not
		 * 
		 * @param year
		 * @return true if year is leap and false if year is not leap year
		 */
		public static boolean leapYear(int year) {
			if (year % 100 != 0 && year % 4 == 0) {
				return true;
			} else if (year % 100 == 0 && year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		}
		
		
		/**
		 * Purpose : Printing dates in calendar .
		 * @param d
		 */

		static void putCalender(int d) {
			int d1 = 1;//counter for day
			for (int i = d; i < calender[0].length; i++) {
				// System.out.print(d1);
				calender[0][i] = d1++;   // increment the column like 1, 2, 3,...
			}
			for (int i = 1; i < calender.length; i++) {
				for (int j = 0; j < calender[i].length; j++) {
					calender[i][j] = d1++;
				}
			}

		}
		
		
		/**
		 * Purpose : Calling all method
		 * @param m
		 * @param y
		 */

		static void dispCalender(int m, int y) {
			int d = dayOfWeek(m, y);
			initCal();
			leapYear(y);
			putCalender(d);
			display(m);

		}

		static int dayOfWeek(int m, int y) {
			int d = 1;
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + (31 * m0) / 12) % 7;
			return d0;
		}

	
	
    public static void main(String[] args) {
	 
	   System.out.println("enter month");
	   int m = Utill.isInteger();
	   System.out.println("enter yaer");
	   int y = Utill.isInteger();
	   dispCalender(m, y);

   }
}
