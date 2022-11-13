package com.masai.dao;

import java.util.List;

import com.masai.exceptions.CourseException;
import com.masai.studentbean.Course;

public interface StudentDao {

	public String registerStudent(String username, String password);
	public String updateStudentDetails(String name, int marks, String email);
	public List<Course> getAllCourse() throws CourseException;
}
