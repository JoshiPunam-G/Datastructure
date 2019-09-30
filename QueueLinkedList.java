package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.LinkedListUtility;

import java.util.Scanner;
 

public class QueueLinkedList<T> {
	
		LinkedList queue = new LinkedList();
		static int index = 0;
		public int bankBalance = 500000;
		Scanner scanner = new Scanner(System.in);
		int counter = 1;

		
		public static int size() {
			return index;
		}

		
		public static void enQueue(int data) {
			LinkedListUtility.insertNodeInt(data);
			index++;
		}


		public static void   deQueue() {
			index--;
			LinkedListUtility.removeData(index);
		}

		
		public static void show() {
			LinkedListUtility.display();
		}

	
}
