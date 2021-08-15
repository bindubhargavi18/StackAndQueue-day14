package com.stack.linkedlist;

interface IStack<T> 
{
	public void push(T data);
	public T pop();
	public T peek();
	public boolean isEmpty();

}
