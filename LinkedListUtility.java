package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LinkedListUtility {
	
	static String[] stringArray;
	static int[] intArray;
	static Node head = null;

	public static class Node {
		
		public int data;
		public  String data1;
		public Node next;

	}

	
	/**
	 * display LinkedList of String
	 */
	public static void Display() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);

	}

	public static void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(" ");
	}

	/**
	 * Insert String noode
	 * 
	 * @param data
	 * @return
	 */
	public boolean insertNode(String data) {
		Node node = new Node();
		node.data1 = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		return true;
	}
 /**
  * Insert Integer Nodes
  */
	public static boolean insertNodeInt(int data1) {
		//OuterClass.InnerClass = new OuterClass.new InnerClass(); 
		Node node = new Node();
		node.data = data1;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		return true;
	}
	
	
	/**
	 * Insert String noode at start
	 * 
	 * @param data
	 * @return
	 */

	public void insertAtStart(String data) {
		Node node = new Node();
		node.data1 = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	/**
	 * Insert string noode At given position
	 * 
	 * @param data
	 * @return
	 */
	public void insertAtPosition(String data, int pos) {
		Node node = new Node();
		node.data1 = data;
		node.next = null;

		if (pos == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < pos - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;

		}
	}

	/**
	 * delete given node
	 * 
	 * @param word
	 */
	public static void deleteNode(String word)

	{
		System.out.println("in delete");
		// Store head node
		Node temp = head, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.data1 == word) {
			head = temp.next; // Changed head
			return;
		}

		// Search for the key to be deleted, keep track of the
		// previous node as we need to change temp.next
		while (temp != null && temp.data1!= word) {
			prev = temp;
			temp = temp.next;
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.next = temp.next;
	}

	/**
	 * seching String node from linkedList
	 * 
	 * @param head
	 * @param x
	 * @return
	 */

	public  boolean search(String Word) {
		Node current = head;// Initialize current
		int f = 0;
		int count = 0;

		while (current != null) {
			count++;
			String str = current.data1;

			if (str.equals(Word)) {

				f = 1;

				break;
				// return true;//data found
			} else {

				current = current.next;
				f = 0;
			}
		}

		if (f == 1) {
			System.out.println("fount At" + count);
			removeData(count);
			return true;
		}

		else {
			insertAtStart(Word);
			return false;
		}
		// return false; //data not found

	}

	/**
	 * Delete node at given Position
	 * 
	 * @param count
	 */

	public static void removeData(int count) {

		if (count== 1) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 1; i <count-1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
		}

	}


/**
 * sorting LinknedList Using BubbleSort
*/

public void sortList() {  
    //Node current will point to head  
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
              //  int number=current.data1;
            	if(current.data> index.data) {  
                    temp = current.data;  
                    current.data = index.data;  
                    index.data= temp;  
                }  
                index = index.next;  
            }  
            current = current.next;  
        }      
    }  
}  

/**
 * Reading string from file
 */

/*public Node readFile(Node start) {
	try {
		FileInputStream fis = new FileInputStream("/home/user/Order.txt");
		char ch;
		String word3 = "";

		while (fis.available() > 0) {
			ch = (char) fis.read();
			word3 = word3 + ch;
		}
		String[] wordsArray = word3.split(" ");
		int[] inputArray = new int[wordsArray.length - 1];

		for (int i = 0; i < wordsArray.length - 1; i++) {
			inputArray[i] = Integer.parseInt(wordsArray[i]);
		}
		inputArray = sort(inputArray);

		for (int i = 0; i < wordsArray.length - 1; i++) {
			start = addWordstoList(start, inputArray[i]);
		}
	} catch (IOException e) {
		System.out.println(e);
	}
	return start;
}*/

/**
 * read integer file
 **/
public static int[] integerFileReader() {
	try 
	{
		String intFile = new String();
		FileReader fr = new FileReader("/home/bridgeit/Downloads/order.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;

		while ((s = br.readLine()) != null) {
			intFile += s;
		}

		intFile = intFile.replaceAll("\\n", ",");
		intFile = intFile.trim();
		stringArray = intFile.split(",");
		intArray = new int[stringArray.length];

		for (int i = 0; i < intArray.length; i++) {
			try {
				intArray[i] = Integer.parseInt(stringArray[i]);
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
		}
	} catch (Exception obj) {
		System.out.println("e");
	}
	return intArray;
}

/**
 * End of insert method
 */

public Node addWordstoList(Node node1, int num) {
	Node node2 = node1;
	Node newNode = new Node();
	newNode.data = num;
	newNode.next = null;

	if (node1 == null) {
		return newNode;
	} else {
		while (node1.next != null) {
			node1 = node1.next;
		}
		node1.next = newNode;
	}
	return node2;
}// End of insert method

/**
 * Sorting linked list in ascending order
 * 
 * @param arr
 * @return
 */
public static int[] sort(int[] arr) {
	int size = arr.length;
	for (int i = size; i > 0; i--) {
		for (int j = 1; j < size; j++) {
			if (arr[j - 1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
			}
		}
		size--;
	}
	return arr;
}// End of sorting method

/**
 * Searching number
 * 
 * @param tNode1
 * @param num
 * @return
 */
public Node search(Node tNode1, int num) {
	Node tNode = tNode1;

	// No elements in an list(List empty)
	if (tNode == null) {
		Node newNode = new Node();
		newNode.data = num;
		tNode = newNode;
		return tNode;
	}

	// Search number is first in list
	if (tNode.data == num) {
		tNode = null;
		return tNode1; //
	}

	// Search num
	while (tNode != null) {
		if (tNode.next == null) {
			return tNode1;
		}

		if (tNode.next.data == num) {
			tNode.next = tNode.next.next;
			return tNode1;
		}
		tNode = tNode.next;
	}
	return tNode1;
}

/**
 * method to write in file
 * 
 * @param tNode
 */
public void writeFile(Node tNode) {
	try {
		String tString = "";
		File file = new File("/home/user/Order.txt");
		file.createNewFile();
		FileWriter fw = new FileWriter(file);

		while (tNode != null) {
			tString += String.valueOf(tNode.data);
			tString += " ";
			tNode = tNode.next;
		}

		fw.write(tString);
		fw.close();
	} catch (IOException e) {
		System.out.println(e);
	}
}
/*
 * 
 */



public static void getDataFromFile() {
	
	        int[] retArry =integerFileReader();
	        int[] sortArray =sort(retArry);
	        int size =retArry.length;
	        System.out.println("Array Size is "+size);
	        for(int i=0;i<size;i++)
	        {

	        	//add (retArry[i]);
	        }
	    }



	
}

  



