package LoginRegisrtation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDataBase","sandhya","Sandhya@1234");
			System.out.println("&&&&&&&&&&&");
			/*String FirstName = request.getParameter("FirstName");
			String LastName = request.getParameter("LastName");
			String Email = request.getParameter("Email");
			String UserName = request.getParameter("Name");
			String PassWord = request.getParameter("pwd");
			String ReEnter_PassWord  = request.getParameter("pwd");
			String Gender= request.getParameter("Male");
			String Mobile_No= request.getParameter("Number");*/
		PreparedStatement st = con.prepareStatement("select * from LoginReg WHERE UserName=?");
		/*st.setString(1, FirstName );
		st.setString(2, LastName );
		st.setString(3, Email );
		st.setString(4, UserName );
		st.setString(5, PassWord );
		st.setString(6, ReEnter_PassWord);
		st.setString(7, Gender );
		st.setString(8, Mobile_No);*/
			String UserName = request.getParameter("Name");
			//String Password = request.getParameter("password");
			st.setString(1,UserName);
			//st.setString(2,Password );
	
		ResultSet rs = st.executeQuery();
	//boolean value = rs.next();
	while(rs.next()) {
     System.out.println(rs.getString(1)+ " " + rs.getString(2) +" "+rs.getString(3)+ " " +rs.getString(4)+ " " +rs.getString(5)+ " " +rs.getString(6)+ " " +rs.getString(7)+ " " +rs.getString(8));
	
	}
	response.sendRedirect("Login.html");
	PrintWriter out=response.getWriter();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	/*//if(UserName.equals("sandhya") && Password.equals("123")) {
	
		//response.sendRedirect("Login.html");
	
//}
	else {
		out.print("Incorect password...Enter the correct passsword");
	}
	}*/
	

	}
}
