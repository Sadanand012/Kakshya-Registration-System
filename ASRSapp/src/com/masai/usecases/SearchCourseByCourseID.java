package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exceptions.CourseException;
import com.masai.studentbean.Course;

public class SearchCourseByCourseID {

	public static void searchCoursebyID() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter course id to get the details");
		int cid=s.nextInt();
		AdminDao dao=new AdminDaoImpl();
		Course c=null;
		try {
			c=dao.searchCourseInformation(cid);
		} catch (CourseException e) {
			
			System.out.println(e.getMessage());
		}
		if(c!=null) {
			System.out.println("Course id - "+c.getCid());
			System.out.println("Course name - "+c.getCname());
			System.out.println("Course fee - "+c.getFee());
			System.out.println("Batch id - "+c.getBid());
		}else {
			System.out.println("Course does not exist");
		}
//		s.close();
	}
}
