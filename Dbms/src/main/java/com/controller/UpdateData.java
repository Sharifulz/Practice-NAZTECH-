package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.model.Aemployee;

public class UpdateData {
	public static void main(String[] args) {
		Connection conn;
		Aemployee ad = new Aemployee(1,"Sam Smith", 50000);
		
		
			try {
				conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
						+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
				System.out.println("CONNECTION Success");
				
				
					PreparedStatement stm = conn.prepareStatement("update aemployee set ename=?, sal=? where id=?");
					stm.setString(1, ad.getEname());
					stm.setInt(2, ad.getSal());
					stm.setInt(3, ad.getId());
					stm.executeUpdate();
					System.out.println("Updated:  Success");
					
			 conn.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			
		
	}
}
