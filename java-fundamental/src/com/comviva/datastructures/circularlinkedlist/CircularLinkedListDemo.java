package com.comviva.datastructures.circularlinkedlist;


public class CircularLinkedListDemo {
	
	public static void main(String[] args) {
	
		Employee employee1 = new Employee(1001, "John Snow", "Engineering", 97564.54);
		Employee employee2 = new Employee(1002, "Ava Smith", "Engineering", 97564.54);
		Employee employee3 = new Employee(1003, "Raj Rajan", "Engineering", 97564.54);
		Employee employee4 = new Employee(1004, "Syed Ahmad", "Engineering", 97564.54);
		Employee employee5 = new Employee(1005, "Maria James", "Engineering", 97564.54);
			
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		circularLinkedList.addElement(employee1);
		circularLinkedList.addElement(employee2);
		circularLinkedList.addElement(employee3);
		circularLinkedList.addElement(employee4);
		circularLinkedList.addElement(employee5);
		
//		circularLinkedList.print();
		
		Node delNode = circularLinkedList.remove();
//		System.out.println(delNode.getData());
		circularLinkedList.print();
	}
	
	
}
