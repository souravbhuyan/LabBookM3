package com.cg.iter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/getdata")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
	if(user.equals("MyPage") && pass.equals("serve123"))
	{
		out.println("Login success");
	}
	else
	{
		out.println("invalid username and password");
		
	}
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}