package com.bridgelabz.datastructure;


public class CashInfo {
	 static int first;
	 static int array[];
	 static int length;
     static int size;
	 static int last=0;
	 int deposit;
	 int withdraw;
	public static Object balance;

	/**
	 * Constructor with initial values setting
	 * 
	 * @param size
	 */
	public CashInfo(int size)
	{
		first = 0;

		array = new int[size];
		length = array.length;
		this.size = size;
		last = first - 1;
	}
	
	
	/**
	 * @param data
	 *            Add function to add data to queue
	 * @return 
	 */
	public  static int add(int data) 
	{
		while(last==size- 1)
		{
			length++;
			last++;
			array[last] = data;
			return data;
			
		} 
		System.out.println("Queue Full Already");
		return data ;
		
			//int balance = 1000;
			//balance=balance+deposit;
			//System.out.println("Your Balance is : "+balance);
			
		
//		return deposit;

	}

	/**
	 * @param none
	 * Remove function to facilitate deletion from queue
	 */
	public static void remove()
	{
		if (first > last) 
		{
			System.out.println("Queue Empty Already");
			return;
		} else {
			length--;
			first++;
			System.out.println("Your remaining Balance is: "+balance);
		}

	}

	public boolean isEmpty() 
	{
		if (first > last)
			return true;
		return false;

	}


	
	
	
	


}
		

