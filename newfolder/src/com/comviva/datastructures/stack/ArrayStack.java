package com.comviva.datastructures.stack;

import java.util.EmptyStackException;

public class ArrayStack {
	private int top;
	private Employee[] stack;
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	public int capacity() {
		return stack.length;
	}
	
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top==0;
	}
	public void push(Employee data) {
		if(top == stack.length) {
			Employee[] newArr = new Employee[2*stack.length];
			System.arraycopy(stack,0, newArr, 0, stack.length);
			stack = newArr;
		}
		
	
		stack[top++] = data;
	}
	
	public Employee pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Employee removedNode =  stack[--top];
		stack[top] = null;
		return removedNode;	
	}
}
