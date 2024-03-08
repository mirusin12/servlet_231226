package com.test.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/practiceWeb/practiceApp05")
public class practice05 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		// parameter 가져오기
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		int price = Integer.parseInt(request.getParameter("price"));
		
		PrintWriter out = response.getWriter();
		if (address.contains("서울시") == false) {
			out.print("배달 불가 지역입니다.");
		} else if (card.equals("신한카드")) {
			out.print("결제 불가 카드 입니다.");
		} else {
			out.print(address + " <b>배달 준비중</b><br>");
			out.print("결제금액: " + price);
		}
	}
}
