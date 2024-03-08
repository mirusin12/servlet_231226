package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz03")
public class UrlMappingQuiz03 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		// 한글 깨짐 방지 - response header 
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		// 태그 출력 - response body
		PrintWriter out = response.getWriter();
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("기사 입력 시간: yyyy/MM/dd HH:mm:ss");
		out.println("<html><head><title>마론달 뉴스</title></head><body>"); // ln 유무 상관 없음
		out.print("<h1>[단독] 고양이가 야옹해</h1>");
		out.print(sdf.format(now));
		out.print("<hr>끝");
		out.print("</body></html>");
	}
}
