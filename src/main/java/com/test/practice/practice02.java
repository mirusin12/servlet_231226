package com.test.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/practice/practice02")
public class practice02 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>리스트 출 ! 력!</title></head><body><ul>");
		for (int i = 0; i < 30; i++) {
			out.print("<li>" + (i + 1) + "번째 리스트</li>");
		}
		out.print("</ul></body></html>");
	}
}
