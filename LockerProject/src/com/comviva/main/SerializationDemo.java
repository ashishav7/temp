package com.comviva.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationDemo {

		// TODO Auto-generated method stub
	
		public SerializationDemo(int id, String name, String mail, String password) {
			
			//convert object into a bytestream
			try {
				//create file output stream
				FileOutputStream file = new FileOutputStream("file-db.txt");
	
				// create a object stream
				ObjectOutputStream out = new ObjectOutputStream(file); 
				
				// method to serialized object 
				out.writeObject(new Register(id,name,mail,password));
				
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
