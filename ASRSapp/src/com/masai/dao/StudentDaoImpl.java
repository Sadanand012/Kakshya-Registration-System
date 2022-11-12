package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exceptions.CourseException;
import com.masai.studentbean.Course;
import com.masai.studentbean.Student;
import com.masai.utility.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String registerStudent(Student student) {
		String str = "Not Registered";
		
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into student(sname,smarks,semail,spassword) values(?,?,?,?)");
			ps.setString(1, student.getSname());
			ps.setInt(2, student.getMarks());
			ps.setString(30, student.getEmail());
			ps.setString(4, student.getPassword());
			
			int a = ps.executeUpdate();
			if(a>0) {
				str = "Student registered successfully";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return str;
	}

	@Override
	public String updateStudentDetails(int roll, String name, int marks, String email, String password) {
		// TODO Auto-generated method stub
		String str = "Not updated";
		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("update student set sname=?,smarks=?,semail=?,spassword=? where roll=?");
			ps.setString(1, name);
			ps.setInt(2, marks);
			ps.setString(3, email);
			ps.setString(4, password);
			ps.setInt(5, roll);
			
			int a = ps.executeUpdate();
			if(a>0) {
				str = "Update student details successfully";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return str;
	}

	@Override
	public List<Course> getAllCourse() throws CourseException{
		List<Course> course = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("Select * from course");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int cid = rs.getInt("cid");
				String cname = rs.getString("cname");
				int fee = rs.getInt("fee");
				int bid = rs.getInt("bid");
				Course c = new Course(cid,cname,fee,bid);
				course.add(c);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return course;
	}

}
