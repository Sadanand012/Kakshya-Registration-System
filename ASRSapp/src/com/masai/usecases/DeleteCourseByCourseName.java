package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exceptions.CourseException;

public class DeleteCourseByCourseName {

	public static void deleteCourse() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Course name To delete");
		String cname=s.next();
		AdminDao dao=new AdminDaoImpl();
		String output=null;
		try {
			output = dao.deleteCourse(cname);
		} catch (CourseException e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println(output);
//		s.close();
	}
}
