package com.bridgelabz.datastructure;

import java.util.NoSuchElementException;
import java.util.Scanner;

import com.bridgelabz.datastructure.LinkedList.Node;

public class Queue {
	
	
  static int MAX=10000;
	
  static int Queue[]=new int[MAX];
  static int size;

static int front;

static int rear;
 static int length;
  
  /* insering elements into queue */
  public static void insert(int data)
  {
	  Queue[rear]=data;
	  rear=rear+1;
	  size=size+1;
  }
  
  /*if queue is empty */
  public static boolean isEmpty()
  {
	  return front==-1;
	  //rear=-1;
	 //Queue[front];
	 
  }
  
  /* deleting elements from queue */
  public static int delete()
  {
	  if(isEmpty())
       throw new NoSuchElementException("Underflow Exception");
	  else
	  {
		  size--;
		int x=Queue[front];
		  if(front==rear)
		  {
			  front=-1;
			  rear=-1;
		  }
		  else
		  {
			  front++;
		  }
		  return x;
	  }
	 
		  
  }
  
  /*method for display elements of queue */
  
  public static void show()
  {
	  for(int i=0;i<size;i++)
	  {
		  System.out.println(Queue[i]);
	  }
  }
  
  /* */
 public static int getSize() {
		// TODO Auto-generated method stub
		return length;
	}
  
  
  
  
}  
 /* public static void main(String[] args)
  {
	  Queue q=new Queue();
	  q.insert(10);
	  q.insert(20);
	  q.insert(30);
	  q.insert(40);
	  q.insert(50);
	  q.delete();
	
	  q.show();
  }*/







