package com.Telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		out.println("Hi<br>");
		ServletConfig cg=getServletConfig();
		
		//ServletContext ctx=getServletContext();
		String str=cg.getInitParameter("name");
		out.println(str);
		
		
	}

}
