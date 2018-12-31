package com.msbhosale.settings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	private static final String DATABASE_HOST = "jdbc:mysql://localhost:3306/test";
	private static final String DATABASE_USER = "root";
	private static final String DATABASE_PASSWORD = "root";

	public static Connection getConnection() throws SQLException {

		return DriverManager.getConnection(DATABASE_HOST, DATABASE_USER, DATABASE_PASSWORD);
	}
}