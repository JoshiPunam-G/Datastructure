/**  Purpose: implementation of linkedlist.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   21-09-2017
 *
 ******************************************************************************/



package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.LinkedList.Node;



//***********Utlity for UnorderLinkedList***********

public class LinkedList {

	 static Node head;
     static String element;
	 class Node
	 {
		 public final Node nextNode = null;
		String data;
		 Node next;
	
	 }
	 
	 public void insert(String data)
	 {
		
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
		  Node node1=head;      //temperory node
		  while(node1.next!=null)
		  {
			  node1=node1.next;
		  }
		  node1.next=node;
		}
	 }
	 
	 /**
	  * insert element at start
	  * @param data
	  */
	 public void insertAtstart(String data)
	 {
		 Node node=new Node();
			node.data=data;
			node.next=null;
			
			node.next=head;
			head=node;
			
	 }
	 

	 
	 /**
	  * insertAtposition 
	  * @param data
	  * @param index
	  */
	 public void insertAtpos(String data,int index)
	 
	 {
		 Node node=new Node();
			node.data=data;
			node.next=null;
			
			Node node1=head;
			 
			
			if(index==0)
			{
				insertAtstart(data);
			}
			else
			{
				for(int i=0;i<index-1;i++)
				{
					node1=node1.next;
				}
				
				node.next=node1.next;
				node1.next=node;	
			}
	}
	 /**
	  * delete node from linkedlist
	  * @param index
	  */
	 public void deleteAtPos(int index)
	 {
		 if(index==0)
		{
		   head=head.next;		
		}
		 else
		 {
			Node node = head;
			Node node1=null;
			for(int i=0;i<index-1;i++)
			{
				node1=node1.next;
			}
			
			node1=node.next;
			node.next=node1.next;
		 }
	 }
	 
	 /**
	  * delete node from linked list
	  * @param element
	  */
	 
	 public  void deleteNode(String element)
	 {
		// System.out.println("Delete Method");
		Node temp = head, prev = null;

		if(temp!= null && temp.data==element)
		{
			head=temp.next;
			return;
		}
		
		while(temp!=null && temp.data!=element)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
			return;
		prev.next=temp.next;
			
		
	 }
	 
	 
	
	 
	 /**
	  * search element from linklist
	  * @param data
	 * @return 
	  */
	 
	  public boolean searchNode(String data) {  
	        Node node = head;
	        int status=0;
	        boolean flag=false;  
	       
	        while(node != null) 
	            {  
	        	    status++;
	               String s=node.data;
	                if(s.equals(data)) 
	                 {
	                	flag=true;
	             
	                    break; 
	                }  
	                else
	                {
	                    node = node.next;
	                 flag=false;
	                }

	            }
	           if(flag==true)
	            {
	        	   System.out.println("Element found at+ "+ status);
	        	   remove(status);
	            	return true;
	            }
	            else
	            {
	            	insert(data);
	            	return false;
	            }
	        }
			
	   /**
	    * remove function
	    * @param status
	    */
	  public static void remove(int status)
	  {
		  if(status==1)
		  {
			  head=head.next;
		  }
		  else
		  {
			  Node n=head;
			  Node n1=null;
			  for(int i=1;i<status-1;i++)
			  {
				  n=n.next;
			  }
			  n1=n.next;
			  n.next=n1.next;
		  }
	  }
	  
	  


	/**
	   * length of linkedlist
	   * @return
	   */
	  
	  public int lengthOfLinkedList()
	  {
	     Node temp=head;
	     int count = 0;
	     while(temp!=null)
	     {
	       temp=temp.next;
	       count++;  
	     }
	     return count;
	  }
	  
	  
	  /**
	   * Display Linked List
	   */
	 
		public void show()
		 {
			//insert(100);
			 Node node=head;
			 while(node.next!=null)
			 {
				 System.out.println(node.data);
				 node=node.next;
			 }
			 System.out.println(node.data);
			
		 }
	 
	  
	 public static void main(String[] args)
    {
			LinkedList t=new LinkedList();

			 t.insert("A");
			 t.insert("B");
			 t.insert("C");
			 t.insert("D");
			 
			 t.insertAtstart("XYZ");
			 
			 t.insertAtpos("AA", 3);
			 
			 t.deleteAtPos(1);
			 
		//	 t.deleteNode("D");
			 
			 t.searchNode("AA");
			 
			 t.show();
		

	}

}
