package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exceptions.CourseException;

public class UpdateFeesByCourseID {

	public static void updateFees() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Course ID to Update fees");
		int cid = s.nextInt();
		System.out.println("Enter new Fees to update");
		int fee = s.nextInt();
		AdminDao dao = new AdminDaoImpl();
		String output = null;
		try {
			output = dao.updateFeesByCourseId(cid, fee);
			
		} catch (CourseException e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println(output);
		
//		s.close();
	}
}
