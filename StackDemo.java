package com.bridgelabz.datastructure;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		
		System.out.println("STACK:"+s);
		
		System.out.println("top is:"+s.peek());
		
		System.out.println(s.pop());
		
		System.out.println(s.push(90));
	}

}
