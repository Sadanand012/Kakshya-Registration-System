package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exceptions.BatchException;

public class UpdateSeats {

	public static void updateSeat() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter seat which you want to update");
		int seat= s.nextInt();
		System.out.println("Enter bid for which you want to update");
		int bid= s.nextInt();
		
		AdminDao dao= new AdminDaoImpl();
		String output= null;
		try {
			output = dao.updateSeat(seat, bid);
		} catch (BatchException e) {
			
			e.printStackTrace();
		}
		System.out.println(output);
//		s.close();
	}
}
