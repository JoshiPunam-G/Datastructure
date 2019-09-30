/**  Purpose: implementation of linkedlist.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   23-09-2017
 *
 ******************************************************************************/

//**************Utility for orderedLinked List******************

package com.bridgelabz.datastructure;

import Utility.Utill;


public class TestLinked {
	 static Node head;

	 class Node
	 {
       String element ;
		int data;
		 Node next;
	 }
	 
	 public void insert(int str)
	 {
		
		Node node=new Node();
		node.data=str;
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
	 public void insertAtstart(int data)
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
	 public void insertAtpos(int data,int index)
	 
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
	  * search element from linklist
	  * @param data
	  */
	 
	   public void searchData()
	   {
	        Node temp = head;
	        int count=0;
	        System.out.println("Enter a number to Search");
	        int s =Utill.isInteger();
	        int flag=0;
	        while(temp.next != null)
	        {
	            count++;
	            if( temp.data==s)
	            {
	                System.out.println(" number is found At "+count);
	                flag++;
	                break;
	            }
	            temp=temp.next;
	        }

	        if(flag == 1)
	        {
	            removeData(count);
	        }
	        else
	        {
	            insert(s);
	            System.out.println("After Adding a LIst ");
	            display();
	        }
	    }
	   
	   
	  
	   
	   
	   
	   /*for removing data */
	   void removeData(int count)
	    {
	        Node temp = head;
	        if(count==1)
	        {
	            head =head.next;
	            System.out.println("After Deleting LIst is ");
	            display();
	        }
	        else
	        {
				for(int i=1;i<count-1;i++)
				{
				 	temp=temp.next;
				}
	        temp.next =temp.next.next;
	        System.out.println("After Deleting LIst is ");
	        display();
	        }
	    }
	   
	   /**
		   * Display Linked List
		   */
	   
	   public  void display()
	   {
	        Node temp =head;
	        while( temp != null)
	        {
	            System.out.print(temp.data+" ");
	            temp=temp.next;
	        }
	        System.out.println(" ");
	    }

	   
	   
	
		
	/**
	 * search node
	 * @param head
	 * @param x
	 * @return
	 */
	

	 
	/*  public static void searchNode(int element)
	  {  
	        Node current = head;  
	        int i = 1;  
	        boolean flag = false;  
	        //Checks whether list is empty  
	        if(head == null)
	        {  
	            System.out.println("List is empty");  
	        }  
	        else {  
	            while(current != null)
	            {  
	                 //Compares node to be found with each node present in the list  
	                if(current.data== element)
	                {  
	                    flag = true;  
	                    break;  
	                }  
	                i++;  
	                current = current.next;  
	            }  
	        }  
	        if(flag)  
	             System.out.println("Element is present in the list at the position : " + i);  
	        else  
	             System.out.println("Element is not present in the list");  
	    } */ 
	
	 
	 /**
	  * delete node
	  * @param element
	  */
	 public  void deleteNode(String element)
	 {
		// System.out.println("Delete Method");
		Node temp = head, prev = null;

		while (temp != null) {
			int str = temp.data;
			if (element.equals(str)) { // Changed head
				prev = temp;
				prev.next = temp.next;

			} else {
				temp = temp.next;
			}
		}
	        
		 

	 }
	
	  
	  /**
	   * sort the linkedlist in ascending order.
	 * @return 
	   */
	
	 public int[] sortList(int[] array) {
		 int size=array.length;
		 for(int i=size;i>0;i--)
		 {
			 for(int j=1;j<size;j++)
			 {
				 if(array[j-1]>array[j])
				 {
					 int temp=array[j-1];
					 array[j-1]=array[j];
					 array[j]=temp;
				 }
			 }
			 size--;
		 }
	
			return array;
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
	  
	  
	

	
	 

}
