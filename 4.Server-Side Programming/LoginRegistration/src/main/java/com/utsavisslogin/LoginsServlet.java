package com.utsavisslogin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginsServlet
 */
@WebServlet("/login")
public class LoginsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uemail = request.getParameter("username");
		String upwd = request.getParameter("password");
				
//		out.print(uemail);
//		out.print(uemail);
		
//		System.out.print(uemail);
//		System.out.print(upwd);
		
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/utsaviss?useSSL=false","root","12345utsav");
			PreparedStatement pst = con.prepareStatement("Select * from users where uemail = ? and upwd = ? ");
			pst.setString(1,uemail);
			pst.setString(2,upwd);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				session.setAttribute("name",rs.getString("uname"));
				dispatcher = request.getRequestDispatcher("index.jsp");
				System.out.print("\n\n" + uemail + " Successfuly logged in");
			}
			else
			{
				request.setAttribute("status","failed");
				dispatcher = request.getRequestDispatcher("login.jsp");
				System.out.print("\n\nSomeone entered wrong username or password");
			}
			
			dispatcher.forward(request, response);
		
		} catch (Exception e) {

			e.printStackTrace();
		} 

		
	}

}
