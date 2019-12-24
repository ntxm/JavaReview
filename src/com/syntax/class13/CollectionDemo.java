package com.syntax.class13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Student[] studentArray = new Student[3];
		Student student1 = new Student(1345, 19, "Ann Colt");
		studentArray[0]=  student1;
		studentArray[1] = new Student(2345, 19, "James White");
		studentArray[2] = new Student(3345, 17, "MAry LAmb");
		
		//Create a new array with more size/space
		Student[] studentArrayNew = new Student[6];
		for(int i = 0; i < studentArray.length; i++) {
			studentArrayNew[i] = studentArray[i];
		} 
		
		studentArrayNew[3] = new Student(4567, 23, "Sasha Kalashnikov");
		
		System.out.println("Same things done easier with a collection");
		ArrayList<Student> studentList = new ArrayList<>();
		
		Student student3 = new Student(2346, 18, "John Smith");
		
		studentList.add(student3);
		studentList.add(new Student(2563, 19, "Arian Grand"));
		studentList.add(new Student(3412, 16, "Los Gat"));
		studentList.add(new Student(2212, 29, "Marian Traol"));
		studentList.add(2, new Student(1092, 27, "Linda Green"));
		System.out.println(studentList);
		System.out.println(studentList.size());
		
		List list = new ArrayList<>();
		list.add(student1);
		list.add(3);
		list.add("Nata");
		System.out.println(list);
		
		
		System.out.println("---Using enhaced foor loop---");
		for(Student student: studentList) {
			student.displayInfo();
		}
		
		System.out.println("---Using iterator---");
		Iterator<Student> studentIterator = studentList.iterator();
		Student s1 = studentIterator.next();
		s1.displayInfo();
		studentIterator.next().displayInfo();
		
		if(studentIterator.hasNext()) {
			studentIterator.next().displayInfo();
		}
		
		//I got the second iterator
		Iterator<Student> studentIterator2 = studentList.iterator();
		System.out.println("---Using Iterator2");
		while(studentIterator2.hasNext()) {
			Student stud = studentIterator2.next();
			stud.displayInfo();
		}
		
//				 List
//		ArrayList    LinkedList
//		
//				  Set
//		HashSet       LinkedHashSet	    TreeSet	  
		
	}
	}
	
	class Student{
		int studentNumber;
		int age;
		String name;
		
		public Student(int studentNumber, int age, String name) {
			this.studentNumber = studentNumber;
			this.age = age;
			this.name = name; 

		}
		
		public void displayInfo() {
			System.out.println("Student name " + name + " age " + age + " student number " + studentNumber);
		}
		
		@Override
		public String toString() {
			return name + " " + age + "  " + studentNumber;
		}
	}


