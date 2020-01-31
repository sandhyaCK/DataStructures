package com.Registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import code.DataBaseConnection; 

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class ServletDatBaseCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			Connection con = DataBaseConnection.initializeDatabase();
			System.out.println("&&&&&&&&&&&");
			 PreparedStatement st = con .prepareStatement("insert into LoginReg values(?,?,?,?,?,?,?,?,?)"); 
			 String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		String Email = request.getParameter("Email");
		String UserName = request.getParameter("Name");
		String PassWord = request.getParameter("pwd");
		String ReEnter_PassWord  = request.getParameter("pwd");
		String Gender= request.getParameter("Male");
		String Mobile_No= request.getParameter("Number");
		//String DateOfBirth = request.getParameter("Date");
		st.setString(1, FirstName );
		st.setString(2, LastName );
		st.setString(3, Email );
		st.setString(4, UserName );
		st.setString(5, PassWord );
		st.setString(6, ReEnter_PassWord);
		st.setString(7, Gender );
		st.setString(8, Mobile_No);
		//st.setString(9,DateOfBirth );
		st.executeUpdate();
		con.close();
		st.close();
		PrintWriter out=response.getWriter();
		response.sendRedirect("Reg.html");
		//out.print("Reg.html");
	}
	
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	

	}
}
