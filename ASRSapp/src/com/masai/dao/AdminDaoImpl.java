package com.masai.dao;

import java.util.List;

import com.masai.exceptions.BatchException;
import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;
import com.masai.studentbean.Batch;
import com.masai.studentbean.Course;
import com.masai.studentbean.StudentCourse;

public class AdminDaoImpl implements AdminDao{

	@Override
	public String addNewCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCourse(String cname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateFeesByCourseId(int cid, int fee) throws CourseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course searchCourse(int cid) throws CourseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createABatch(Batch batch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addStudentInABatch(int cid, int roll) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSeat(int seat, int bid) throws BatchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentCourse> getAllStudentDetailWithBatch() throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

}
