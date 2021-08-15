package com.stack.linkedlist;

public class Queue<T> implements IQueue<T>
{
	Node<T> front=null;
	Node<T> rear=null;
	
	@Override
	public void enQueue(T data) 
	{
			Node<T> node = new Node<T>();
			node.data=data;
			node.next=null;
		if(front==null && rear==null) 
		{
			front=rear=node;
		}
		else 
		{
			rear.next=node;
			rear=node;
		}
	}
	
	
	@Override
	public boolean isEmpty()
	{
		return front==null;
	}

	@Override
	public void displayQueue() 
	{
		Node<T> node =new Node<>();
		node=front;
		while(node!=null) 
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
}
