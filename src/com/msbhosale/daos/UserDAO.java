package com.msbhosale.daos;

public class UserDAO {

	public boolean isValidUser(String username, String password) {

		boolean status = false;

		if (username.equals("admin") && password.equals("1234")) {
			status = true;
		}

		return status;
	}
}