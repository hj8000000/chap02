package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request")
public class RequestServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Request / Response!</h1>");
		out.println("<div style='border:2px solid red;'>Box1</div>");
		out.println("<div style='border:2px solid red;'>Box2</div>");
		out.println("<div style='border:2px solid red;'>Box3</div>");
		out.println("</body>");
		out.println("</html>");
	}
		
}
