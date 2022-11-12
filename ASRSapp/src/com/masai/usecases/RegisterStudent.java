package com.masai.usecases;

import java.util.*;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.studentbean.Student;

public class RegisterStudent {

	public static void registerStudentDetail() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter details of student to register");
		
//		System.out.println("Enter student name");
//		String name=s.next();
//		System.out.println("Enter student marks");
//		int marks=s.nextInt();
		System.out.println("Enter student email");
		String email=s.next();
		System.out.println("Enter student password");
		String password=s.next();
		
//		Student student=new Student();
//		student.setEmail(email);
//		student.setMarks(marks);
//		student.setSname(name);
//		student.setPassword(password);
		StudentDao dao=new StudentDaoImpl();
		String output= dao.registerStudent(email,password);
		System.out.println(output);
//		s.close();
	}
	
}
