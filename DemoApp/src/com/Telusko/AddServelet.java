package com.Telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServelet extends HttpServlet {
	
	//service is a method belong to servlet life cycle. so u have to use service only
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i =Integer.parseInt(req.getParameter("num1"));
		int j =Integer.parseInt(req.getParameter("num2"));
		int k =i+j;
		
		//using cookie
		Cookie cooki=new Cookie("k",k+"");
		res.addCookie(cooki);
		
		//using session
		//HttpSession session=req.getSession();
				//session.setAttribute("k", k);
		res.sendRedirect("sq");
		
		
		//RequestDispatcher is an interface
		
		
		
//		req.setAttribute("k",k);
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		PrintWriter out=res.getWriter();
		
	}
	
	

}
