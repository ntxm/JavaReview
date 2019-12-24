package com.syntax.class13;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		Student student2 = new Student(2346, 18, "John Smith");
		
		studentList.add(student2);
		studentList.add(new Student(2563, 19, "Arian Grand"));
		studentList.add(new Student(3456, 16, "Los Gat"));
		studentList.add(new Student(2212, 29, "Marian Traol"));
		studentList.add(2, new Student(1092, 27, "Linda Green"));	
		
		System.out.println(studentList.toString());
		
		//How do I find the student with number 3456
		Iterator<Student> it = studentList.iterator();
		
		while(it.hasNext()) {
			Student student = it.next();
			if(student.studentNumber == 3456) {
				student.displayInfo();
				break;
			}
		}
		
		//					MAP
		//HashMap     LinkedHashMap   TreeMap	
			
		Map<Integer, Student> studentMap = new HashMap<>();
		Student student3 = new Student(1234, 32, "Arrina Doman");
		studentMap.put(1, student3);
		studentMap.put(2, new Student(1235, 30, "Lori Down"));
		studentMap.put(3, new Student(1236, 25, "Tom Dankin"));
		studentMap.put(4, new Student(1237, 28, "Daniel Ford"));
		
		System.out.println(studentMap);
		
		Student studentFromMap = studentMap.get(2);
		studentFromMap.displayInfo();
		
		studentMap.keySet();
		
		System.out.println();
		System.out.println("---Getting keys---");
		Set<Integer> keys = studentMap.keySet();
		Iterator<Integer> keyIterator = keys.iterator();
		
		while(keyIterator.hasNext()) {
			int key = keyIterator.next();
			Student student = studentMap.get(key);
			System.out.println(student);
		}
		
		System.out.println();
		System.out.println("---Getting values---");
		Collection <Student> valueCol = studentMap.values();
		Iterator<Student> studentIterator = valueCol.iterator();
		
		while(studentIterator.hasNext()) {
			Student student = studentIterator.next();
			student.displayInfo();
		}
		
		System.out.println("---Getting entreis---");
		//one Entry is one pair. In our case, a pair of integer and Student
		Collection<Entry<Integer, Student>> entries = studentMap.entrySet();
		Iterator<Entry<Integer, Student>> entryIterator = entries.iterator();
//		Entry<Integer, Student> firstPair = entryIterator.next();
//		System.out.println(firstPair);
		while(entryIterator.hasNext()) {
			Entry<Integer, Student> pair = entryIterator.next();
			Integer key = pair.getKey();
			Student student = pair.getValue();
		}
		

	}

}





