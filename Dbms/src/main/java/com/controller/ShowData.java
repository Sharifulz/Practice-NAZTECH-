package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.model.Aemployee;

public class ShowData {
	public static void main(String[] args) {
		Connection conn;
		Aemployee ae = new Aemployee();
		List<Aemployee> list = Aemployee.sendD();
		
			try {
				conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
						+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
				System.out.println("CONNECTION Success");
				
				
					PreparedStatement stm = conn.prepareStatement("select * from aemployee");
					ResultSet res = stm.executeQuery();
					while(res.next()) {
						System.out.print(res.getInt(1)+"\t");
						System.out.print(res.getString(2)+"\t");
						System.out.println(res.getString(3));
					}
					
				
				
				/*
				 * 
				 * create table aemployee(
					id int,
					name varchar(100),
					sal int
					);
				 * 
				 * 
				 */
				// conn.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			
		
	}
}
