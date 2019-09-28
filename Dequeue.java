/*
 * package com.bridgelabz.datastructure;
 * 
 * public class Dequeue {
 * 
 * static final int MAX = 100; static int arr[]; // static char ch[]; static int
 * front; static int rear; static int size;
 * 
 * 
 * public Dequeue() { arr = new int[MAX]; front = -1; rear = 0; this.size =
 * size; } insert element at front of queue public static void addRear(int c) {
 * System.out.println("in addRear"); if(rear==MAX) {
 * System.out.println("queue is overflow"); } else { rear=rear+1; arr[rear]=c;
 * getRear(); return; } }
 * 
 * insert element at rear of queue public static void addFront(int c) {
 * if(front<=1) { System.out.println("Can't add item at front "); } else {
 * front=front-1; arr[front]=c; getFront(); return; } }
 * 
 * delete element at front public static void deleteFront() { if(front==0) {
 * System.out.println("Underflow");
 * 
 * } else { front=front+1; int c=arr[front]; return; }
 * 
 * if(front==rear) { front=0; rear=0; } else { front=front+1; return; } }
 * 
 * 
 * delete element at rear public static void deleteRear() { if(rear==0) {
 * System.out.println("no element for deletion"); return; } else { int
 * c=arr[rear]; } if(front==rear) { front=0; rear=0; } else { rear=rear-1;
 * System.out.println("Element deleted"); return; } }
 * 
 * 
 * 
 * 
 * // Returns front element of Deque public static int getFront() { // check
 * whether Deque is empty or not if (front<=1) {
 * System.out.println(" Underflow"); return -1 ; } return arr[front]; }
 * 
 * // function return rear element of Deque public static int getRear() { //
 * check whether Deque is empty or not if(rear==MAX) {
 * System.out.println(" Underflow\n"); return -1 ; } return arr[rear]; }
 * 
 * 
 * 
 * public static void main(String args[]) { // Dequeue d=new Dequeue ();
 * 
 * Dequeue.addRear(10); Dequeue.getRear(); Dequeue.addFront(20); //
 * d.addRear('B'); // d.addRear('D'); //d.deleteFront();
 * 
 * 
 * }
 * 
 * }
 */// Java implementation of De-queue using circular 
// array 

// A structure to represent a Deque 
package com.bridgelabz.datastructure;
 public class Dequeue {
	static final int MAX = 100; 
	static char[] arr=new char[MAX]; 
	static int front = -1; 
	static int rear=-1; 
	static int size; 
	
	public Dequeue(int size) 
	{ 
		arr = new char[size]; 
		front = -1; 
		rear = -1; 
		this.size = size; 
	} 

	static 
	// Checks whether Deque is full or not. 
	boolean isFull() 
	{ 
		return ((front == 0 && rear == size-1)|| 
			front == rear+1); 
	} 

	static // Checks whether Deque is empty or not. 
	boolean isEmpty () 
	{ 
		return (front == -1); 
	} 

	// Inserts an element at front 
  public static	char insertfront(char key) 
	{ 
		// check whether Deque if full or not 
		if (isFull()) 
		{ 
			System.out.println("Overflow"); 
			return key; 
		} 

		// If queue is initially empty 
		if (front == -1) 
		{ 
			front = 0; 
			rear = 0; 
		} 
		
		// front is at first position of queue 
		else if (front == 0) 
			front = size - 1 ; 

		else // decrement front end by '1' 
			front = front-1; 

		return arr[front] = key; 
	} 

	// function to inset element at rear end 
	// of Deque. 
	public static char insertrear(char key) 
	{ 
		//System.out.println("Key:"+key);
		if (isFull()) 
		{ 
			System.out.println(" Overflow "); 
			return key; 
		} 

		// If queue is initially empty 
		if (front == -1) 
		{ 
			front = 0; 
			rear = 0; 
		} 

		// rear is at last position of queue 
		else if (rear == size-1) 
			rear = 0; 

		// increment rear end by '1' 
		else
			rear = rear+1; 
		//System.out.println("rear is"+rear);
		arr[rear] = key; 
		return key;
	} 

	// Deletes element at front end of Deque 
	public static char deletefront() 
	{ 
		//System.out.println("front:"+front);
		// check whether Deque is empty or not 
		if (isEmpty()) 
		{ 
			System.out.println("Queue Underflow\n"); 
			return 0 ; 
		} 

		// Deque has only one element 
		if (front == rear) 
		{ 
			front = -1; 
			rear = -1; 
		} 
//		else {
			// back to initial position 
			if (front == size -1) 
				front = 0; 
//		}
//			else if(front==0)
//				front=0;

		 // increment front by '1' to remove current 
		// front value from Deque 
//			else {
//				if(front == 0) {
//					System.out.println("front1:"+front);
//					char ch1 = arr[front];
//					front = front + 1;
//					return ch1;
//				}
//				else
//					front = front+1;
				
//			}
		char ch1 = arr[front];
		front = front + 1;
		return ch1; 
	} 

	// Delete element at rear end of Deque 
	public static char deleterear() 
	{ 
		//System.out.println("rear:"+rear);
		if (isEmpty()) 
		{ 
			System.out.println(" Underflow"); 
			return 0 ; 
		} 

		// Deque has only one element 
		if (front == rear) 
		{ 
			front = -1; 
			rear = -1; 
		} 
		else if (rear == 0) 
			rear = size-1;
//		else if(rear==size-1)
//			rear=size-1;
//		else
//			if(rear==size-1) {
//				char ch1 = arr[rear];
//				rear = rear - 1;
//		//		System.out.println("rear==size-1:"+rear);
//				return ch1;
//			}
//			else {
//				rear = rear-1;
//			}
				
		char ch1 = arr[rear];
		rear = rear - 1;
		return ch1; 
	} 

	// Returns front element of Deque 
	int getFront() 
	{ 
		// check whether Deque is empty or not 
		if (isEmpty()) 
		{ 
			System.out.println(" Underflow"); 
			return -1 ; 
		} 
		return arr[front]; 
	} 

	// function return rear element of Deque 
	int getRear() 
	{ 
		// check whether Deque is empty or not 
		if(isEmpty() || rear < 0) 
		{ 
			System.out.println(" Underflow\n"); 
			return -1 ; 
		} 
		return arr[rear]; 
	} 
	
	public static int size()
	{
		return size;
	}

	// Driver program to test above function 
	public static void main(String[] args) 
	{ 
		
		Dequeue dq = new Dequeue(5); 
		
	/*	System.out.println("Insert element at rear end : 5 "); 
		dq.insertrear(5); 
		
		System.out.println("insert element at rear end : 10 "); 
		dq.insertrear(10); 
		
		System.out.println("get rear element : "+ dq.getRear()); 
		
		dq.deleterear(); 
		System.out.println("After delete rear element new rear become : " + 
								dq.getRear()); 
		
		System.out.println("inserting element at front end"); 
		dq.insertfront(15); 
		
		System.out.println("get front element: " +dq.getFront()); 
		
		dq.deletefront(); 
		
		System.out.println("After delete front element new front become : " + 
									+ dq.getFront()); 
		*/
	}

 {
		// TODO Auto-generated method stub
		
	}
 }


