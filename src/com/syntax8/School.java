package com.syntax8;

public class School {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentName = "Temel Laz";
		student1.studentNr = 222;
		student1.gradeLevel = "Grade 1";
		
		
		Student student2 = new Student();
		student2.studentName = "Mary Adams";
		student2.studentNr = 312;
		student2.gradeLevel = "Grade 3";
		
		
		Student student3 = new Student();
		student3.studentName = "James Best";
		student3.studentNr = 431;
		student3.gradeLevel = "Grade 2";
		
		Teacher teacher1 = new Teacher();
		teacher1.teacherName = "Paul Smith";
		teacher1.subject = "Math";
		teacher1.salary = 50000;
		
		Teacher teacher2 = new Teacher();
		teacher2.teacherName = "Maria Antoanita";
		teacher2.subject = "Art";
		teacher2.salary = 35000;
		
		student1.displayName();
		
		
	}

}
