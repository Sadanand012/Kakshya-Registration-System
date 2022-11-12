package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.studentbean.Course;

public class AddNewCourse {

	public static void addNewCourse() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Course details");
		System.out.println("Enter course Name : ");
		String cname = s.next();
		System.out.println("Enter course fee");
		int fee = s.nextInt();
		System.out.println("Enter Batch ID");
		int bid = s.nextInt();
		
		Course course = new Course();
		course.setCname(cname);
		course.setFee(fee);
		course.setBid(bid);
		
		AdminDao dao = new AdminDaoImpl();
		String output = dao.addNewCourse(course);
		System.out.println(output);
//		s.close();
	}
}
