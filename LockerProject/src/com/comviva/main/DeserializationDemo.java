package com.comviva.main;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeserializationDemo {
//	private List<Register> regList = new ArrayList<Register>();
	private Map<String,Register> mp = new HashMap<String,Register>();
	public DeserializationDemo() {
		try {
			//read a file
			FileInputStream file = new FileInputStream("file-db.txt");
			
			// creating a input object stream
			
			ObjectInputStream input = new ObjectInputStream(file);
			
			//method to de-serialize the object
			
			while(true) {
				Register user = (Register) input.readObject();
				mp.put(user.getMail(), user);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(EOFException e) {
//			for(Register r: regList) {
//				System.out.println(r.toString());
//			}
			
			//Map
//			for(Map.Entry<String, Register> entry : mp.entrySet()) {
//				System.out.println(entry.getKey() + " " + entry.getValue().toString());
//			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
//	public List<Register> getRegisteredUsers(){
//		return regList;
//	}
	public Map<String,Register> getRegisteredUsers(){
		return mp;
	}

}
