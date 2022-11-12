package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exceptions.BatchException;
import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;
import com.masai.studentbean.Batch;
import com.masai.studentbean.Course;
import com.masai.studentbean.StudentCourse;
import com.masai.utility.DBUtil;

public class AdminDaoImpl implements AdminDao{

	@Override
	public String addNewCourse(Course course) {
		String message ="Not Inserted";
		try(Connection con = DBUtil.provideConnection()) {
			PreparedStatement ps = con.prepareStatement("insert into course values(?,?,?,?)");
			ps.setInt(1, course.getCid());
			ps.setString(2, course.getCname());
			ps.setInt(3, course.getFee());
			ps.setInt(4, course.getBid());
			
			int a = ps.executeUpdate();
			if(a>0) message = "New course added";
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return message;
	}

	@Override
	public String deleteCourse(String cname) throws CourseException {
		String st = "Not Deleted";
		try(Connection con = DBUtil.provideConnection()) {
			PreparedStatement ps = con.prepareStatement("delete from course where cname = ?");
			ps.setString(1, cname);
			
			int a = ps.executeUpdate();
			if(a>0) st = cname+"Course deleted successful";
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new CourseException(cname+"Course not found");
		}
		return st;
	}

	@Override
	public String updateFeesByCourseId(int cid, int fee) throws CourseException {
		String st = "Not Update Fees";
		try(Connection con = DBUtil.provideConnection()) {
			PreparedStatement ps = con.prepareStatement("update course set fee = ? where cid=?");
			ps.setInt(1, fee);
			ps.setInt(2, cid);
			
			int a = ps.executeUpdate();
			if(a>0) st = "Course fee updated successfully for"+cid;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CourseException("Course cid not found");
		}
		return st;
	}

	@Override
	public Course searchCourseInformation(int cid) throws CourseException {
		Course course = null;
		try(Connection con = DBUtil.provideConnection()) {
			PreparedStatement ps = con.prepareStatement("select * from course where cid=?");
			ps.setInt(1, cid);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int cid1 = rs.getInt("cid");
				String cname= rs.getString("cname");
				int fee = rs.getInt("fee");
				int bid = rs.getInt("bid");
				
				course = new Course(cid1,cname,fee,bid);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new CourseException("Course not found");
		}
		return course;
	}
//createABatch
	@Override
	public String createABatch(Batch batch) {

		String str = "Batch not created";
		
		try(Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("insert into batch value(?,?,?)");
			ps.setInt(1, batch.getBid());
			ps.setString(2, batch.getName());
			//seat
			ps.setInt(3, batch.getBroll());
			int a = ps.executeUpdate();
			if(a>0) str = "Batch created successfully";
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return str;
	}

	@Override
	public String addStudentInABatch(int cid, int roll) {
		String str = "Student Not Added!";
		Connection conn = DBUtil.provideConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into student_batch value(?,?)");
			ps.setInt(1, cid);
			ps.setInt(2, roll);
			int a = ps.executeUpdate();
			if(a>0) str = "Added student to batch successfully"+roll;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return str;
	}

	@Override
	public String updateSeat(int seat, int bid) throws BatchException {
		String str = "Not updated";
		Connection conn = DBUtil.provideConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("update batch set broll=? where bid=?");
			ps.setInt(1, seat);
			ps.setInt(2, bid);
			int a = ps.executeUpdate();
			if(a>0) str = "Seat updated successfully";
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new BatchException("Not updated seat for batch");
		}
		return str;
	}

	@Override
	public List<StudentCourse> getAllStudentDetailWithBatch() throws StudentException {

		List<StudentCourse> student = new ArrayList<>();
		Connection conn = DBUtil.provideConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select s.sname, s.sroll, s.smarks, s.semail, b.bid, b.name from student s" + "Inner join student_batch sb on s.sroll = sb.roll Inner join course c ON c.cid = sb.cid"+"Inner join batch b on b.bid = c.bid;");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String name = rs.getString("sname");
				int roll = rs.getInt("roll");
				int mark= rs.getInt("marks");
				String email = rs.getString("email");
				int bid = rs.getInt("bid");
				String bname = rs.getString("bname");
				StudentCourse sc = new StudentCourse(name, roll, mark, email, bid, bname);
				student.add(sc);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new StudentException("Student not found");
		}
		return student;
		
	}

}
