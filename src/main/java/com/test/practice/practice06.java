package com.test.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/practiceWeb/practiceApp06")
public class practice06 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		List<String> list = new ArrayList<>(Arrays.asList(
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요.",
		        "맛집하면 여기입니다!",
		        "이런.. 이곳은 최고의 맛집"));
		String search = request.getParameter("search");
		PrintWriter out = response.getWriter();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(search)) {
				// 방법 1. -> "맛집" 이라는 단어가 중복이면 이상하게 나올 때 있음!
//				String[] str = list.get(i).split(search);
//				out.print(str[0] + "<b>" + search + "</b>" + str[str.length - 1] + "<br>");
				
				// 방법 2. -> 위의 에러사항 보완
				String str = list.get(i);
				str = str.replace("맛집", "<b>맛집</b>");
				out.print(str + "<br>");
			}
		}
	}
}
