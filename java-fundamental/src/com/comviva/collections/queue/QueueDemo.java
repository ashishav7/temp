package com.comviva.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		// Queue : queue is data structure which arrange data in FIFO.
		Deque<String> peopleQueue = new ArrayDeque<String>();
		
		peopleQueue.add("John");
		peopleQueue.add("Mike");
		peopleQueue.add("William");
		peopleQueue.add("David");
		peopleQueue.add("Ava");
		peopleQueue.add("Marry");
		
		peopleQueue.addFirst("Syed");
		peopleQueue.addLast("Sam");
		
		// peek element
		System.out.println("Head : "+peopleQueue.peek());
		System.out.println("Head : "+peopleQueue.element());		
		
		
		// Print removed element 
		System.out.println("Removed element : "+peopleQueue.poll());
		System.out.println("Head : "+peopleQueue.peek());
		
		
		System.out.println("Removed first : "+peopleQueue.removeFirst());
		System.out.println("Removed last : "+peopleQueue.removeLast());
		
		System.out.println("----------------");
		//iterate over queue
		for(String person : peopleQueue) {
			System.out.println("Person : "+person);
		}
		
		// priority queue
		Queue<String> banKQueue = new PriorityQueue<String>();
        // WAP : for priority queue -> data does not store in FIFO.
	}

}
