package com.masai.dao;

import java.util.List;

import com.masai.exceptions.CourseException;
import com.masai.studentbean.Course;
import com.masai.studentbean.Student;

public interface StudentDao {

//	public String registerStudent(Student student);
	public String registerStudent(String username, String password);
	public String updateStudentDetails(String name, int marks, String email);
//	public String updateStudentDetails(int roll, String name, int marks, String email, String password);
	public List<Course> getAllCourse() throws CourseException;
}
