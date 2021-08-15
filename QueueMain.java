package com.stack.linkedlist;

public class QueueMain 
{
	public static void main(String[] args) 
	{
		Queue<Integer> queue=new Queue<>();
		queue.enQueue(70);
		queue.enQueue(30);
		queue.enQueue(50);
		// deleting elements in queue

		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		
		//displaying elements in queue
		queue.displayQueue();
	}

}
