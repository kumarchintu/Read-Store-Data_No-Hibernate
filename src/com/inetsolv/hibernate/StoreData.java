package com.inetsolv.hibernate;

import java.sql.*;

public class StoreData {
	public void storeEmpData(Employee emp)
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			PreparedStatement ps=conn.prepareStatement("insert into emp_tbl values(?,?,?)");
			ps.setInt(1, emp.getEno());
			ps.setString(2, emp.getEname());
			ps.setDouble(3, emp.getSalary());

			ps.executeUpdate();			
			System.out.println("Record inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
