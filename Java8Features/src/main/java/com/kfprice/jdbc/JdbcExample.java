package com.kfprice.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class JdbcExample implements DriverAction{
	
	@Override
	public void deregister() {
		System.out.println("Driver deregistered");
		
	}

	public static void main(String[] args) {
		
		try {
			
			Driver driver = new com.mysql.cj.jdbc.Driver();
			
			DriverAction da = new JdbcExample();
			
			DriverManager.registerDriver(driver, da);
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct2022","root","Passw0rd!");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			con.close();
			
			DriverManager.deregisterDriver(driver);
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
