package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

public class UpdateStudentDetails {

	public static void updateStudent() {
		Scanner s=new Scanner(System.in);
//		System.out.println("Enter student roll ");
//		int roll=s.nextInt();
		System.out.println("Enter student name ");
		String name=s.next();
		System.out.println("Enter student email ");
		String email=s.next();
//		System.out.println("Enter student password ");
//		String password=s.next();
		System.out.println("Enter student marks ");
		int marks =s.nextInt();
		
		StudentDao dao=new StudentDaoImpl();
		String output= dao.updateStudentDetails(name, marks, email);
		System.out.println(output);
//		sc.close();
	}
}
