package com.comviva.collections.queue.student;

import java.util.ArrayDeque;
import java.util.Queue;

public class StudentQueueDemo {

	public static void main(String[] args) {
		
		// create student objects
		Student student1 = new Student(10001, "Sam Kim", 4, "ABC College");
		Student student2 = new Student(10002, "Kim Hu", 2,  "ABC College");
		Student student3 = new Student(10003, "Ming Yong", 1, "ABC College");
		Student student4 = new Student(10004, "Ming Kim", 3, "ABC College");
		Student student5 = new Student(10005, "Sim Kim", 7, "ABC College");
		Student student6 = new Student(10006, "Tim Kim", 8, "ABC College");
		
		//create a student
		Queue<Student> studentQueue = new ArrayDeque<Student>();
		
		studentQueue.add(student3);
		studentQueue.add(student2);
		studentQueue.add(student4);
		studentQueue.add(student1);
		studentQueue.add(student5);
		studentQueue.add(student6);
		
		//iterate over queue
		for(Student student : studentQueue) {
			System.out.println("--------------");
			System.out.println(student.id);
			System.out.println(student.name);
			System.out.println(student.rank);
			System.out.println(student.college);
		}
	}

}
