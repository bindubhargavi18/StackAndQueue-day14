package com.stack.linkedlist;

public class Stack<T> implements IStack<T>
{
	Node<T> head;
	
	@Override
	public void push(T data)
	{
		Node<T> node=new Node<T>();
		node.data=data;
		node.next=head;
		head=node;
	}
	
	@Override
	public T pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		T data=head.data;
		head=head.next;
		return data;
	}
	
	@Override
	public boolean isEmpty()
	{
		return head==null;
	}
	public T peek()
	{
		return head.data;
	}
	
}
