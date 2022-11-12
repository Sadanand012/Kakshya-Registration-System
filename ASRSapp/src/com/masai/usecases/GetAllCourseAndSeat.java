package com.masai.usecases;

import java.util.List;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.CourseException;
import com.masai.studentbean.Course;

public class GetAllCourseAndSeat {

	public static void getDetails() {
		StudentDao dao=new StudentDaoImpl();
		try {
			List<Course> courses = dao.getAllCourse();
			courses.forEach(c->{
				
				System.out.println("--------------------------");
				System.out.println("Course details - ");
				System.out.println("--------------------------");
				System.out.println("Course id - "+c.getCid());
				System.out.println("Course name - "+c.getCname());
				System.out.println("Course fee - "+c.getFee());
				System.out.println("Course bid - "+c.getBid());
				
			});
		} catch (CourseException e) {
			e.printStackTrace();
		}
	}
}
