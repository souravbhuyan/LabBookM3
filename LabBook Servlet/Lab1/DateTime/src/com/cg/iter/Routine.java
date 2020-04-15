package com.cg.iter;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Routine extends HttpServlet{
     public void service(HttpServletRequest request, HttpServletResponse
                    response) throws ServletException, IOException{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    Date today = new Date();
    out.println("<h1>Current Date is : </h1>");
    out.println(today);
  }
}