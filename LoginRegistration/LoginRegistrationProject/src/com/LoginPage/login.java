package com.LoginPage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/LoginPage")
public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String UserName = request.getParameter("Name");
	String Password = request.getParameter("password");
	PrintWriter out=response.getWriter();
		
	if(UserName.equals("sandhya") && Password.equals("123")) {
		response.sendRedirect("login.html");
		
	//	out.print("Registration.html");
}
	else {
		out.print("Incorect password...Enter the correct passsword");
	}
	}
	

}
