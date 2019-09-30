package com.bridgelabz.datastructure;

import Utility.Utill;

public class AnagramUsingStack {

	public static void main(String[] args) {
		
		int[][] anagram = new int[10][];
		int[][] nonanagram = new int[10][];

		int start = 0, end = 100, count1 = 0, count2 = 0, x = 0;

		for (int i = 0; i < 10; i++) {
			/* declaring array length of each row */
			for (int j = start; j < end; j++) 
			{
				if (Utill.PrimeLogic(j)) 
				{
					String s1 = String.valueOf(j);
					for (int j2 = 0; j2 < 1000; j2++) 
					{
						if (Utill.PrimeLogic(j2)) 
						{
							String s2 = String.valueOf(j2);
							x = 0;
							if (Utill.isAnagram1(s1, s2)) {
								count1++;
								x = 1;
								break;
							}
						}

					}
					if (x == 0) {
						count2++;
					}
				}

			}

			anagram[i] = new int[count1];
			nonanagram[i] = new int[count2];
			count1 = 0;
			count2 = 0;
			start = end + 1;
			end = end + 100;
		}
		/* inserting elements into an array */
		start = 0;
		end = 100;
		count1 = 0;
		count2 = 0;
		x = 0;

		for (int i = 0; i < 10; i++) {

			for (int j = start; j < end; j++)
			{
				if (Utill.PrimeLogic(j)) 
				{
					String s1 = String.valueOf(j);

					for (int j2 = 0; j2 < 1000; j2++)
					{
						if (Utill.PrimeLogic(j2)) 
						{
							String s2 = String.valueOf(j2);
							x = 0;
							if (Utill.isAnagram1(s1, s2))
							{
								anagram[i][count1] = j;
								StackUsingLinkedList.push(j);
								count1++;
								x = 1;
								break;
							}
						}

					}
					if (x == 0) {
						nonanagram[i][count2] = j;
						count2++;
					}
				}

			}

			count1 = 0;
			count2 = 0;
			start = end + 1;
			end = end + 100;
		}

		/*  printing arrays */ 
		System.out.println("Prime nonAnagram numbers are :");
		for (int i = 0; i < nonanagram.length; i++) 
		{
			for (int j = 0; j < nonanagram[i].length; j++) 
			{
				System.out.print(nonanagram[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("Prime Anagram numbers are :");

		for (int i = 0; i < anagram.length; i++)
		{
			for (int j = 0; j < anagram[i].length; j++) 
			{
				System.out.print(anagram[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Anagram is");
		StackUsingLinkedList.display();
	
	
		
	}
}
