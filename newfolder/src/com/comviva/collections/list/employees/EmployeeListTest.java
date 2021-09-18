package com.comviva.collections.list.employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListTest {

	public static void main(String[] args) {
		
		//create employee objects
		
		Employee employee1 = new Employee(1001, "John Snow", "Engineering", 97564.54);
		Employee employee2 = new Employee(1002, "Ava Smith", "Engineering", 97564.54);
		Employee employee3 = new Employee(1003, "Raj Rajan", "Engineering", 97564.54);
		Employee employee4 = new Employee(1004, "Syed Ahmad", "Engineering", 97564.54);
		Employee employee5 = new Employee(1005, "Maria James", "Engineering", 97564.54);
		
		// create a list to store employee
		List<Employee> listOfEmps = new ArrayList<Employee>();
		
		// add employees inot list
		listOfEmps.add(employee1);
		listOfEmps.add(employee3);
		listOfEmps.add(employee2);
		
		listOfEmps.add(0,employee4);
		
		
		// replace 
		listOfEmps.set(2, employee5);
		
		// System.out.println(listOfEmps);
		
		for(Employee emp  : listOfEmps) {
			System.out.println(emp);
		}
		

	}

}
