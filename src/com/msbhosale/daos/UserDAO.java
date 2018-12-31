package com.msbhosale.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.msbhosale.settings.JDBC;

public class UserDAO {

	public boolean isValidUser(String username, String password) {

		boolean status = false;
		int numberOfRecords = 0;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = JDBC.getConnection();
			PreparedStatement pst = con.prepareStatement("SELECT * FROM user WHERE username=? and password=?");

			pst.setString(1, username);
			pst.setString(2, password);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				numberOfRecords++;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		if (numberOfRecords > 0) {
			status = true;
		}

		return status;
	}
}
