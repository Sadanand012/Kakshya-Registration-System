package com.masai.studentbean;

public class StudentCourse {

	private String sname;
	private int roll;
	private int marks;
	private String email;
	private int bid;
	private String bname;
	
	public StudentCourse() {
		// TODO Auto-generated constructor stub
	}

	public StudentCourse(String sname, int roll, int marks, String email, int bid, String bname) {
		super();
		this.sname = sname;
		this.roll = roll;
		this.marks = marks;
		this.email = email;
		this.bid = bid;
		this.bname = bname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "StudentCourse [sname=" + sname + ", roll=" + roll + ", marks=" + marks + ", email=" + email + ", bid="
				+ bid + ", bname=" + bname + "]";
	}
	
}
