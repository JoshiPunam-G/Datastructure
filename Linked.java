/**  Purpose: implementation of linkedlist.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   23-09-2017
 *
 ******************************************************************************/


package com.bridgelabz.datastructure;

//import java.util.LinkedList;

public class Linked {
  
   static class LinkedList
   {
	     Node head;
   
	static class Node
	{
		String data;
		Node next;
		Node(String d)
		{
			data=d;
			next=null;
		}
	}
	public void print()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data +" ");
			n=n.next;
		}
	}

	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		
		ll.head=new Node("Pratibha");
		Node second=new Node("Chaudhari");
		Node third=new Node("Punam");
		Node fourth=new Node("Joshi");
		
		ll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		ll.print();
	}
   }

}