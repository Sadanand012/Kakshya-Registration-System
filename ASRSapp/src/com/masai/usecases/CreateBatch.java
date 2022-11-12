package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.studentbean.Batch;

public class CreateBatch {

	public static void createBatch() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter details to create batch ");
		System.out.println("Enter batch id");
		int bid = s.nextInt();
		System.out.println("Enter batch name");
		String name = s.next();
		System.out.println("Enter batch seat");
		int seat = s.nextInt();
		Batch b = new Batch();
		b.setBid(bid);
		b.setName(name);
		b.setBroll(seat);
		AdminDao dao = new AdminDaoImpl();
		String output = dao.createABatch(b);
		System.out.println(output);
//		s.close();
	}
}
