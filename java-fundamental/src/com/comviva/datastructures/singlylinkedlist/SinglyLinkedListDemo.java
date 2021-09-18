package com.comviva.datastructures.singlylinkedlist;

import com.comviva.datastructures.linkedlist.*;

public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(1001, "John Snow", "Engineering", 97564.54);
		Employee employee2 = new Employee(1002, "Ava Smith", "Engineering", 97564.54);
		Employee employee3 = new Employee(1003, "Raj Rajan", "Engineering", 97564.54);
		Employee employee4 = new Employee(1004, "Syed Ahmad", "Engineering", 97564.54);
		Employee employee5 = new Employee(1005, "Maria James", "Engineering", 97564.54);
	
		SinglyLinkedList testList = new SinglyLinkedList();
		
		testList.addElement(employee1);
		testList.addElement(employee2);
		testList.addElement(employee3);
		testList.addElement(employee4);
		
		testList.print();
	}

}
