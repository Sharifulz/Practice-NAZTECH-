package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.Aemployee;

public class DeleteData {
	public static void main(String[] args) {
		Connection conn;
		Aemployee ad = new Aemployee(3,"Sam Smith", 50000);
		
		
			try {
				conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
						+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
				System.out.println("CONNECTION Success");
				
				
					PreparedStatement stm = conn.prepareStatement("delete from aemployee where id=?");
					
					stm.setInt(1, ad.getId());
					stm.executeUpdate();
					System.out.println("Deleted:  Success");
					
			 conn.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			
		
	}
}
