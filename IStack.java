package com.stack.linkedlist;

interface IStack<T> 
{
	public void push(T data);
	public void pop();
	public T peek();
	public boolean isEmpty();

}
