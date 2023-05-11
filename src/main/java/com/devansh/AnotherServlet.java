package com.devansh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnotherServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String fname = (String) req.getAttribute("fname");
		String lname = (String) req.getAttribute("lname");
		String email = (String) req.getAttribute("email");
		String phone = (String) req.getAttribute("phonenumber");
		
		PrintWriter p = res.getWriter();
		
		p.println(fname+"\n"+lname+"\n"+email+"\n"+phone);
}
}
