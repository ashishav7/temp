package com.comviva.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {

		try {
			//read a file
			FileInputStream file = new FileInputStream("file-db.txt");
			
			// creating a input object stream
			
			ObjectInputStream input = new ObjectInputStream(file);
			
			//method to de-serialize the object
			Employee employee = (Employee) input.readObject();
			
			System.out.println("Deserialization completed");
			System.out.println(employee.getDept());
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
