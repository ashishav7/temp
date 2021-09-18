package com.comviva.datastructures.circularlinkedlist;


public class CircularLinkedList {

	private Node head,tail;
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
		
		// verify list is empty
		if(isEmpty()) {
			head = temp;
			tail = temp;
		}
		else {
			tail.setNext(temp);
			temp.setNext(head);
			head = temp;
		}
	}
	
	public Node remove() {
		
		Node removedNode = head;
		if(head==null) {
			System.out.println("List Empty");
		}
		else {
			head = head.getNext();
			tail.setNext(head);
			size--;
			removedNode.setNext(null);
		}
		return removedNode;
	}
	
	public void print() {
		Node current = head;
		
		do {
			System.out.println("Current Node "+ current.getData());
			current = current.getNext();
		}while(current!=head);
		
		
	}

}
