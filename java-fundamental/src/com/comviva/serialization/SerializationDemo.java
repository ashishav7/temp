package com.comviva.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(100001,"John Smith","Engineering",455655.43);
		
		//convert object into a bytestream
		try {
			//create file output stream
			FileOutputStream file = new FileOutputStream("file-db.txt");

			// create a object stream
			ObjectOutputStream out = new ObjectOutputStream(file); 
			
			// method to serialized object 
			out.writeObject(emp);
			
			
			System.out.println("Serialization Complete");
			//clean up
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
