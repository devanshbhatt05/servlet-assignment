package com.devansh;


	import java.io.IOException;
	import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



	public class ServletPrac  extends HttpServlet {
		
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			
			String a = (req.getParameter("fname"));	
			String b = (req.getParameter("lname"));	
			String c = (req.getParameter("email"));
			String d = (req.getParameter("phonenumber"));
			
			req.setAttribute("fname", a);
			req.setAttribute("lname", b);
			req.setAttribute("email", c);
			req.setAttribute("phonenumber", d);
			
			RequestDispatcher rd = req.getRequestDispatcher("nc");
			rd.forward(req, res);
			
			PrintWriter p = res.getWriter();
			
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	/*	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
			int n1 = Integer.parseInt(request.getParameter("n1"));
			int n2 = Integer.parseInt(request.getParameter("n2"));
		
			int sum = n1+n2;
			
		PrintWriter p = response.getWriter();
		 p.println("result is " + sum);
		
			System.out.println("result is " + sum);
			*/
		
	}
	}
	


