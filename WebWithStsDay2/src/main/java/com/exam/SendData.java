package com.exam;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendData
 */
public class SendData extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hellow From Servlet");
		Connection conn;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
					+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
			System.out.println("Success");
			
			PreparedStatement stm = conn.prepareStatement("insert into myuser values(?,?)");
			stm.setInt(1, Integer.parseInt(request.getParameter("id")));
			stm.setString(2, request.getParameter("name"));
		stm.executeUpdate();
		System.out.println("Inserted Data");
		conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
