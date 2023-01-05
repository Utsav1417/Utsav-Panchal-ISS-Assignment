package com.utsav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum = n1 + n2;
		
		System.out.println("Utsav =====  Result is " + sum + " ================");
		
		PrintWriter out = res.getWriter();
		
		out.println("Result is " + sum );
		
	}

}
