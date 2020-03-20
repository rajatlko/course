package com.Telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException {
		PrintWriter out=res.getWriter();
		int k=0;
		Cookie[] cooki=req.getCookies();
		for(Cookie c:cooki) {
			if(c.getName().equals("k")) {
				k=Integer.parseInt(c.getValue());
			}
		}
		
		//HttpSession session=req.getSession();
		//session.removeAttribute("k");
		//int k= (int)session.getAttribute("k");
		
		
		//int k=Integer.parseInt(req.getParameter("k"));
out.println("<html><body bgcolor='cyan'></body></html>");
		
		
		out.println("result="+k);
		out.println("</body></html>");
		out.println("Hello to square"+k*k);
		System.out.println("sq is reached");
	}

}
