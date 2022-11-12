package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;

public class AllocateStudentBatchUnderCourse {

	public static void allocateStudentBatchUnderCourse() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student Details like roll and Course Id to allocate course");
		System.out.println("Enter roll: ");
		int roll = s.nextInt();
		System.out.println("Enter course ID");
		int cid = s.nextInt();
		AdminDao dao = new AdminDaoImpl();
		String output = dao.addStudentInABatch(cid, roll);
		System.out.println(output);
//		s.close();
	}
}
