package com.masai.dao;

import java.util.List;

import com.masai.exceptions.BatchException;
import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;
import com.masai.studentbean.Batch;
import com.masai.studentbean.Course;
import com.masai.studentbean.StudentCourse;

public interface AdminDao {

	public String addNewCourse(Course course);
	public String deleteCourse(String cname) throws CourseException;
	public String updateFeesByCourseId(int cid, int fee) throws CourseException;
	public Course searchCourseInformation(int cid) throws CourseException;
	public String createABatch(Batch batch);
	public String addStudentInABatch(int cid,int roll);
	public String updateSeat(int seat, int bid) throws BatchException;
	public List<StudentCourse> getAllStudentDetailWithBatch() throws StudentException;
}
