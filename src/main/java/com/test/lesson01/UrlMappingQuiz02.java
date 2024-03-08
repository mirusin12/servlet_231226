package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz02 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest requset, HttpServletResponse response) throws IOException{
		
		// 한글 깨짐 방지
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("연결 완료!");
		
		Date now = new Date();
//		out.println(now);
		
		// 2024-02-29 오후 19:24:30  << 형태
		// Formatter
		SimpleDateFormat sdf = new SimpleDateFormat("현재 시간은 HH시 mm분 ss초 입니다.");
		out.println(sdf.format(now));
	}
}
