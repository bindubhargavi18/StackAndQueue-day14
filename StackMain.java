package com.stack.linkedlist;

public class StackMain 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack=new Stack<>();
		stack.push(70);
		stack.push(30);
		stack.push(50);
		System.out.println("popped element: "+stack.pop());
		System.out.println("Top element: "+stack.peek());
		System.out.println("popped element: "+stack.pop());
		System.out.println("popped element: "+stack.pop());
		System.out.println("popped element: "+stack.pop());
	}

}
