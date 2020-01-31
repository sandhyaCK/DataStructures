package Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Reg
 */
@WebServlet(name = "Regist", urlPatterns = { "/Regist" })
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		String Email = request.getParameter("Email");
		String UserName = request.getParameter("Name");
		String PassWord = request.getParameter("pwd");
		String ReEnter_PassWord  = request.getParameter("pwd");
		String Gender= request.getParameter("Male");
		String Mobile_No= request.getParameter("Number");
		String DateOfBirth= request.getParameter("Date");
		PrintWriter out=response.getWriter();
		response.sendRedirect("Reg.html");
		//out.print("Reg.html");
	}

	
}
