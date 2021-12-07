package com.collections.list;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		//stack is last in first out data structure it implements list interfaces
		
		Stack<String> stack = new Stack<String>();
		
		System.out.println("Adding Element in Stack");
		stack.push("Burger");
		stack.push("Pizza");
		stack.push("Noodles");
		System.out.println("Stack = "+stack);
		
		//to get top element 
		System.out.println("Top element = "+stack.peek());
		
		
		//to get and remove top element
		String poppedElement = stack.pop();
		
		System.out.println("Popped Element = "+poppedElement+" Stack = "+stack);
	}
	
}
