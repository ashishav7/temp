package com.comviva.datastructures.linkedlist;

// model or pojo
public class Employee {
	
	// properties
	public int id;
	public String name;
	public String dept;
	public double salary;
	
	// constructor
	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	// default constructor
	public Employee() {
		super();
	}

	// override toString();
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}
