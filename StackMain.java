package com.stack.linkedlist;

public class StackMain 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack=new Stack<>();
		stack.push(70);
		stack.push(30);
		stack.push(50);
		stack.pop();
		System.out.println("Top element: "+stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		
	}

}
