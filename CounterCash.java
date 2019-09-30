package com.bridgelabz.datastructure;

import java.util.NoSuchElementException;

import com.bridgelabz.datastructure.CashInfo;

import Utility.Utill;;

public class CounterCash 
{	
	
	public Node front, rear;
    public int size;
 
    /* Constructor */
    public CounterCash()
    {
        front = null;
        rear = null;
        size = 0;
    }    
    
    /*  Function to check if queue is empty */
    public  boolean isEmpty()
    {
        return front == null;
    }   
    
    
    
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return size;
    }    
    
    
    /*  Function to insert an element to the queue */
    public void insert(int data)
    {
        Node node = new Node(data, null);
        if (rear == null)
        {
            front = node;
            rear = node;
        }
        else
        {
            rear.setLink(node);
            rear = rear.getLink();
        }
        size++ ;
    }   
    
    
    /*  Function to remove front element from the queue */
   	public int remove()
    {
        if (isEmpty())
		{
        	throw new NoSuchElementException("Underflow Exception");
		}
        Node ptr = front;
        front = ptr.getLink();        
        if (front == null)
		{
            rear =null;
			size-- ; 
		}       
        return ptr.getData();
    }    
   	
    
    /*  Function to check the front element of the queue */
    public int peek()
    {
        if (isEmpty())
		{
            throw new NoSuchElementException("Underflow Exception");
		}
        return front.getData();
    }    
    
    
    /*  Function to display the status of the queue */
    public void display()
    {  
		int ptr1=0;
        System.out.print("Available Balance = ");
        if (size == 0)
        {
            System.out.print("Empty");
            return ;
        }
        Node ptr = front;
        while (ptr != rear.getLink() )
        { 
        	ptr1=ptr1+ptr.getData();
        	System.out.println(ptr1);
            ptr = ptr.getLink();
        }
        System.out.println();        
    }
    
    
    
    
	public static void main(String[] args) 
	{

		//int balance = 1000 ;
		
		CounterCash c=new CounterCash();
		
		System.out.println("Enter no. of People in Queue ");
		
		int people = Utill.isInteger();
		for(int i=0;i<people;i++)
		{

			System.out.println();
		   	System.out.println("------------Banking Cash Counter-----------");
		   	System.out.println("1.Deposit");
		   	System.out.println("2.Withdraw");
		   	System.out.println("3.How Many people in the Queue: ");
		   	System.out.println("4.Exit");
		   	System.out.println();
		   	System.out.println("Enter your choice: ");
		   	int choice=Utill.isInteger();
		   	
		   	switch(choice)
		   	{
		   	case 1:
		   		System.out.println("Enter Amount you want to Deposit: ");
		  
		   		c.insert(Utill.isInteger());
		   	
		     	break;
		   	
		   	case 2:
		   		System.out.println("Enter amount you want to withdraw: ");
		   		
		   		int withdraw=Utill.isInteger();
		   		int balance = 100;
		   		
		   		if(balance>=withdraw)
		   		{
		   			c.remove();
		   		}else
		   		{
		   			System.out.println(" Insufficient balance");
		   		}
		   		
		   	//	System.out.println("Available Balance is");
		   		
		   		c.display();
		   		 break;
		   		
		   	case 3:
		   		int j=c.getSize();
		   		
				System.out.println("The Number of People in Queue is: "+j);
				
				break;
		   		
		   	case 4:
		   		System.exit(0);
		   		 
		   	     break;
		   	default:
		   		System.out.println("Wrong Choice");
		   	
		   	}
		   
		   	
		   	
		   	
		   	
		}
		
		
	}

}
