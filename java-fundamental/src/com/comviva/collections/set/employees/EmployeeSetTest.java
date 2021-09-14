package com.comviva.collections.set.employees;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeSetTest {

	public static void main(String[] args) {
		
		// create employee object
		Employee employee1 = new Employee(1001, "John Snow", "Engineering", 97564.54);
		Employee employee2 = new Employee(1002, "Ava Smith", "Engineering", 97564.54);
		Employee employee3 = new Employee(1003, "Raj Rajan", "Engineering", 97564.54);
		Employee employee4 = new Employee(1004, "Syed Ahmad", "Engineering", 97564.54);
		Employee employee5 = new Employee(1005, "Maria James", "Engineering", 97564.54);
		
		//  create employee set
		Set<Employee> setOfEmployee = new LinkedHashSet<Employee>();
		
		setOfEmployee.add(employee1);
		setOfEmployee.add(employee2);
		setOfEmployee.add(employee3);
		setOfEmployee.add(employee4);
		
		for(Employee emp : setOfEmployee) {
			System.out.println(emp);
		}
		
		
		for(Employee emp : setOfEmployee) {
			System.out.println("--------------");
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.dept);
			System.out.println(emp.salary);
		}
		

	}

}
