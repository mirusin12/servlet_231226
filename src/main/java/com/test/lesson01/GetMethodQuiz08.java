package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz08")
public class GetMethodQuiz08 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		List<String> list = new ArrayList<>(Arrays.asList(
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));
		
		// params
		String searchWord = request.getParameter("searchWord");
		
		PrintWriter out = response.getWriter();
		// for 문
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(searchWord)) {
				out.print(list.get(i) + "<br>");
			}
		}
		
		// iterator
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String line = iter.next();
			if (line.contains(searchWord)) {
//				out.print(line + "<br>");
				
				// 풀이1)
				// 0 index, 1 index
//				String[] words = line.split(searchWord);
//				out.print(words[0] + "<b>" + searchWord + "</b>" + words[1]);
				
				// 풀이2)
				line = line.replace(searchWord, "<b>" + searchWord + "</b>");
				out.print(line + "<br>");
			}
		}
	}
}
