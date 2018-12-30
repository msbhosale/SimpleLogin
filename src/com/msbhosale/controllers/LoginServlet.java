package com.msbhosale.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.msbhosale.daos.UserDAO;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserDAO ud = new UserDAO();

		if (ud.isValidUser(username, password)) {
			pw.write("<h1>Welcome, " + username + "</h1>");
			pw.write("<br>");
			pw.write("<a href='login.jsp'>Home</a>");
		} else {
			pw.write("Invalid username or password");
			pw.write("<br>");
			pw.write("<a href='login.jsp'>Login</a>");
		}
	}
}