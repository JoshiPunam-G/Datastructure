/**  Purpose: implementation of linkedlist.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   21-09-2017
 *
 ******************************************************************************/



package com.bridgelabz.datastructure;


public class LinkedList {

	 Node head;
     static String element;
	 class Node
	 {
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

		while (temp != null) {
			String str = temp.data;
			if (element.equals(str)) { // Changed head
				prev = temp.next;
				prev.next = temp.next;
				return;

			} else {
				temp = temp.next;
				
			}
			
		}
	 }
	 
	 
	
	 
	 /**
	  * search element from linklist
	  * @param data
	  */
	 
	  public boolean searchNode(String data) {  
	        Node node = head;
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
	               String s=node.data;
	                if(s.equals(data)) 
	                 {  
	                  status=1;  
	                    break; 
	                }  
	                else
	                {
	                    node = node.next;
	                 status=0;
	                }

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
			 
			 t.searchNode("XYZ");
			 
			 t.show();
		

	}

}
