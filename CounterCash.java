package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.CashInfo;

import Utility.Utill;;

public class CounterCash 
{	
	public static void main(String[] args) 
	{

		int balance = 1000 ;
		
		System.out.println("Enter no. of People in Queue ");
		
		int people = Utill.isInteger();
		for(int i=0;i<people;i++)
		{

			System.out.println();
		   	System.out.println("------------Banking Cash Counter-----------");
		   	System.out.println("1.Deposit");
		   	System.out.println("2.Withdraw");
		   	//System.out.println("4.Exit");
		   	System.out.println();
		   	System.out.println("Enter your choice: ");
		   	int choice=Utill.isInteger();
		   	
		   	switch(choice)
		   	{
		   	case 1:
		   		System.out.println("Enter Amount you want to Deposit: ");
		   	   int 	deposit=Utill.isInteger();
		   		CashInfo.add(deposit);
		   		//balance=balance+deposit;
		   		//System.out.println("Your Balance is : "+balance);
		   	break;
		   	case 2:
		   		System.out.println("Enter amount you want to withdraw: ");
		   		int withdraw=Utill.isInteger();
		   		
		   		if(balance>withdraw)
		   		{
		   			CashInfo.remove();
		   			//balance=balance-withdraw;
		   		
		   		}
		   		else
		   		{
		   			System.out.println("Insufficient Balance!");
		   		}
		   	break;
		   	default:
		   		System.out.println("Thank You!");
		   	
		   	}
		   
		   	
		   	
		   	
		   	
		}
		
		
	}
}
