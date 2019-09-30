/**  Purpose:  Display total number of possible binary search tree with
 *              user key
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   30-09-2017
 *
 ******************************************************************************/


package com.bridgelabz.datastructure;

public class BST {
	
	/*   node of binary tree  */
	class Node
	{
		Node left;
		Node right;
		int data;
		
		/*create constructor*/
		public Node(int data)
		{
			
       /* initialize data to the new node,
        *  set left and right children to null  */
			this.data=data;
			this.left=null;
			this.right=null;
		
		}
		
	}
	
	
	/* represent the root of binary tree  */
    public Node root;  
      
    public BST()
    {  
        root = null;  
    }  
    
    
    /*factorial the factorial of given number */
    
    public int fact(int num)
    {
    	int fact=1;
    	if(num==0)
    		return 1;
    	else
    	{
    		while(num>1)
    		{
    			fact=fact*num;
    			num--;
    		}
    		return fact;
    	}
    }
    
    
    /*numofBST() will calculate the total number of possible BST 
     * by calculating Catalan Number for given key*/
    
    public int numOfBST(int key)
    {  
      int catalanNumber = fact(2*key)/(fact(key + 1) * fact(key));  
      return catalanNumber;  
    }  
    
    
    
    public static void main(String[] args)
    {
    	BST b=new BST();
    	
    /* Display total number of possible binary search tree with
     *  user key */
    	
    	System.out.println("Total number of binary search tree with given key :"+b.numOfBST(3));
    }


}
