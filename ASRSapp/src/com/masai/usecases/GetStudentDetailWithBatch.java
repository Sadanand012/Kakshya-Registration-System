package com.masai.usecases;

import java.util.List;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exceptions.StudentException;
import com.masai.studentbean.StudentCourse;

public class GetStudentDetailWithBatch {

	public static void getStudent() {
		AdminDao dao=new AdminDaoImpl();
		try {
			List<StudentCourse> students= dao.getAllStudentDetailWithBatch();
			
			students.forEach(s->{
				int i=1;
				System.out.println();
				System.out.println("Student No - "+i++);
				System.out.println("------------------------------------");
				System.out.println("Student name - "+s.getSname());
				System.out.println("Student roll - "+s.getRoll());
				System.out.println("Student marks - "+s.getMarks());
				System.out.println("Student email - "+s.getEmail());
				System.out.println("Student batch id - "+s.getBid());
				System.out.println("Student batch name - "+s.getBname());
			});
		} catch (StudentException e) {
			
			e.printStackTrace();
		}
		
	}
}
