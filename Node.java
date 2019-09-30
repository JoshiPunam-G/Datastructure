package com.bridgelabz.datastructure;

import java.util.NoSuchElementException;

/*  Class Node  */
class Node
{
	protected int data;
    protected Node link;
 
    /*  Constructor  */
    public Node()
    {
        link = null;
        data = 0;
    }  
    
    /* Parameterized Constructor  */
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }  
    
    /*  Function to set data to current Node  */
   	public void setData(int d)
    {
        data = d;
    }   
    
   	/*  Function to get link to next node  */
   	public Node getLink()
    {
     	return link;
    }  
    
	/*  Function to set link to next Node  */
    public void setLink(Node n)
    {
        link = n;
    }  

    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }
}
 