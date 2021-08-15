package com.stack.linkedlist;

public interface IQueue<T> 
{
	public void enQueue(T data);
	public void deQueue();
	public boolean isEmpty();
	public void displayQueue();
}
