package com.comviva.datastructures.singlylinkedlist;

import com.comviva.datastructures.linkedlist.Employee;

public class SinglyLinkedList {

	private Node head;
	private int size;
	
	
	//operations
	//size
	//isEmpty()
	//add element
	//remove element
	//print list
	
	int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void addElement(Employee emp) {
		Node temp = new Node(emp);
		
		temp.setNext(head);
		
		head = temp;
	}
	
	public Node remove() {
		Node removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	public void print() {
		Node current = head;
		while(current!=null) {
			System.out.println("Current Node "+ current.getData());
			current = current.getNext();
		}
		
	}

}
