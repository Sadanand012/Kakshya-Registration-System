package com.masai.admin;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.masai.usecases.AddNewCourse;
import com.masai.usecases.AllocateStudentBatchUnderCourse;
import com.masai.usecases.CreateBatch;
import com.masai.usecases.DeleteCourseByCourseName;
import com.masai.usecases.GetAllCourseAndSeat;
import com.masai.usecases.GetStudentDetailWithBatch;
import com.masai.usecases.RegisterStudent;
import com.masai.usecases.SearchCourseByCourseID;
import com.masai.usecases.UpdateFeesByCourseID;
import com.masai.usecases.UpdateSeats;
import com.masai.usecases.UpdateStudentDetails;

public class Main {

	public static void selectUser() {

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("Choose an option - \n" + "1. Admin Login\n" + "2. Student Login\n");

		System.out.println("Enter option");

		int choice = 0;
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {

			System.out.println("Invalid input!");
			System.out.println();
			System.out.println("Try again...");

			selectUser();
		}

		switch (choice) {
		case 1:
			System.out.println("Enter admin username");
			String username=sc.next();
			System.out.println("Enter admin password");
			String password=sc.next();
			if(username.equals("Admin@123") && password.equals("123")) {
				System.out.println("Admin login successful");
				admin();
			}else {
				System.out.println("Retry username and password");
				selectUser();
			}
			break;
			
		case 2:
			student();
			break;
			
		default:
			System.out.println("Invalid choice!");
			System.out.println();
			System.out.println("Try again...");
			
			selectUser();
		}
//		sc.close();
	}
	
	public static void admin() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\r\n 1. Add a new Courses\r\n"
				+ "2. Update Fees of course.\r\n"
				+ "3. Delete a course from any Training session.\r\n"
				+ "4. Search information about a course.\r\n"
				+ "5. Create Batch.\r\n"
				+ "6. Allocate students in a Batch under a course.\r\n"
				+ "7. Update total seats of a batch.\r\n"
				+ "8. View the students of every batch.\r\n"
				+ "9. Go Back");
		
		System.out.println("\r\n Select 1 to 9 for selected operation");
		int choice = 0;
		
		try {
			choice = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Invalid input!");
			System.out.println("Try again....");
			admin();
		}
		
		switch(choice) {
		case 1:
			AddNewCourse.addNewCourse();;
			break;
		case 2:
			UpdateFeesByCourseID.updateFees();
			break;
		case 3:
			DeleteCourseByCourseName.deleteCourse();
			break;
		case 4:
			SearchCourseByCourseID.searchCoursebyID();
			break;
		case 5:
			CreateBatch.createBatch();
			break;
		case 6:
			AllocateStudentBatchUnderCourse.allocateStudentBatchUnderCourse();
			break;
		case 7:
			UpdateSeats.updateSeat();
			break;
		case 8:
			GetAllCourseAndSeat.getStudent();;
			break;
		case 9:
			selectUser();
		}
//		sc.close();
		admin();
			
	}
	
	public static void student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\r\n 1. Register course with a username and password (email should be the username)\r\n"
				+ "2. Update this details.\r\n"
				+ "3. Available course list and seat availability.\r\n"
				+ "4. Go back \r\n");
		
		System.out.println("Enter operation number");
		int choice = 0;
		
		try {
			choice = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Invalid input!");
			System.out.println("Try again....");
			student();
		}
		
		switch(choice) {
		case 1:
			RegisterStudent.registerStudentDetail();
			break;
		case 2:
			UpdateStudentDetails.updateStudent();
			break;
		case 3:
			GetStudentDetailWithBatch.getDetails();;
			break;
		case 4:
			selectUser();
			break;
		}
//		sc.close();
		student();
		
	}
	public static void main(String[] args) {
		
		System.out.println("------------------------------------");
		System.out.println("Automated Student Registration System");
		System.out.println("------------------------------------");
		selectUser();
	}

}
