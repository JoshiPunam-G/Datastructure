/**  Purpose: implementation of linkedlist.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   23-09-2017
 *
 ******************************************************************************/



package com.bridgelabz.datastructure;

public class TestLinked {
	 Node head;

	 class Node
	 {
       String element ;
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
	  * search element from linklist
	  * @param data
	  */
	 
	public boolean searchNode(int element) {  
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
	            	String s=node.element;
					if(s.equals(element)) 
	                 { 
						status=1;  
	                    break; 
	                }  
	                else
	                {
	                   node = node.next;
	                   status=0;
	                   break;
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
	 * search node
	 * @param head
	 * @param x
	 * @return
	 */
	
	 public boolean search( String element) 
	    { 
		 Node head = null;
		 int status=0;
	        Node current = head;    //Initialize current 
	        while (current != null) 
	        { 
	            if (current.data == element) 
	            {
	            	status=1;  
	            }
	            else
	            {
	            	
	            current = current.next;
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
	
	 
	 /**
	  * delete node
	  * @param element
	  */
	 public  void deleteNode(String element)
	 {
		// System.out.println("Delete Method");
		Node temp = head, prev = null;

		while (temp != null) {
			String str = temp.data;
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
	 /*public void sortList() {  
	        //Node current will point to head  
	        Node current = head, index = null;  
	        String temp;  
	          
	        if(head == null) {  
	            return;  
	        }  
	        else {  
	            while(current != null) {  
	                //Node index will point to node next to current  
	                index = current.next;  
	                  
	                while(index != null) {  
	                    //If current node's data is greater than index's node data, swap the data between them  
	                    if(current.data.compareTo(anotherString)) {  
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
*/
	  
	  
	  
	  
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
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

 {
		// TODO Auto-generated method stub
		
	}

}
