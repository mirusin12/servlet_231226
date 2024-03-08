package com.test.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/practiceWeb/practiceApp03")
public class practice03 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		// parameter 가져오기
		int number = Integer.parseInt(request.getParameter("number"));
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>구구단 링크</title></head><body><ul>");
		for (int i = 1; i <= 9; i++) {
			out.print("<li>" + number + " X " + i + " = " + (number * i) + "</li>");
		}
		out.print("</ul></body></html>");
	}
}
