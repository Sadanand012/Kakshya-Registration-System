package com.masai.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.masai.utility.DBUtil;
import com.mysql.cj.xdevapi.PreparableStatement;

public class OperationImplement  implements AllOpeartion{

	@Override
	public String InsertinBatch(int id, String name, int Roll) {
		String message="Not Inserted";
		//DBUtil d=new DBUtil();
		try (Connection con= DBUtil.provideConnection()){
		PreparedStatement ps = con.prepareStatement("insert into batch values(?,?,?)");
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setInt(3, Roll);
		
		int num=ps.executeUpdate();
		if(num>0) {
			message="Inserted";
			
		}
		
			
		} catch (Exception e) {
			// TODO: handle exception
			message=e.getMessage();
		}
		
		return message;
	}

}
