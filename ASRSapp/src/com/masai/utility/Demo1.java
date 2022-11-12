package com.masai.utility;

import java.sql.Connection;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn;
		conn = DBUtil.provideConnection();
		System.out.println(conn);
	}

}
