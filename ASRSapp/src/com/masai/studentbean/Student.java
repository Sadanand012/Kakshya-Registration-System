package com.masai.studentbean;

public class Student {

	private int sroll;
	private String sname;
	private int marks;
	private String email;
	private String password;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sroll, String sname, int marks, String email, String password) {
		super();
		this.sroll = sroll;
		this.sname = sname;
		this.marks = marks;
		this.email = email;
		this.password = password;
	}

	public int getSroll() {
		return sroll;
	}

	public void setSroll(int sroll) {
		this.sroll = sroll;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [sroll=" + sroll + ", sname=" + sname + ", marks=" + marks + ", email=" + email + ", password="
				+ password + "]";
	}
	
}
