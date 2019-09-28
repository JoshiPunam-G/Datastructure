/**  Purpose: implementation of linkedlist.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   23-09-2017
 *
 ******************************************************************************/

//**************Utility for orderedLinked List******************

package com.bridgelabz.datastructure;

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
	 
/*	public boolean searchNode(int element) {  
	        Node node = head;
	        int i=1;
	        int status=0;
	        boolean flag=false;  
	        
	 
	    if(head == null)
	    {  
	      System.out.println("List is empty"); 
	    }
	    else
	    {
	       while(node != null) 
	            {  
	            	int s=node.data;
					if(s==element) 
	                 { 
						status=1;  
	                    break; 
	                }  
					i++;  
	                node = node.next;  
	              
	            }
	            if(status==1)
	            {
	            	return true;
	            }
	            else
	            {
	            	return false;
	            }
	    }
		return flag;
	    } */ 
	
	/**
	 * search node
	 * @param head
	 * @param x
	 * @return
	 */
	
	 
	 
	  public static void searchNode(int element)
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
	    }  
	
	 
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
	
	 public void sortList(String s) {
			Node current = head, index = null;  
		    int temp;  
		          
		    if(head == null) {  
		       return;  
		     }  
		    else {  
	 	       while(current != null) {  
		         //Node index will point to node next to current  
		           index = current.next;  
		                  
		          while(index != null) {  
		         //If current node's data is greater than index's node data, swap the data between them  
		            if(current.hashCode()>index.hashCode())
		            {  
		                 temp = current.data;  
		                 current.data = index.data;  
		                 index.data = temp;  
		                 }  
		               index = index.next;  
		              }  
		             current = current.next;  
		            }  
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
			 Node temp=head;
			 while(temp!=null)
			 {
				 System.out.println(temp.data);
				 temp=temp.next;
			 }
			 System.out.println("");
			
		 }

	
	 

}
