package com.capgemini.parallelprojectbyjdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
	public static Connection getConnection() throws SQLException {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		String dbUrl="jdbc:mysql://localhost:3306/forestry";
		String userName="root";
		String password="root";
		conn=DriverManager.getConnection(dbUrl,userName,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
