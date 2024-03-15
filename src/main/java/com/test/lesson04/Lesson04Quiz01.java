package com.test.lesson04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz01")
public class Lesson04Quiz01 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 응답
		response.setContentType("text/plain");
		
		// DB 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect(); // 실질적인 DB 연결(꼭 넣기!!)
		
		// 쿼리문 수행 (insert)
		String insertQuery = "insert into `real_estate`"
				+ "(`realtorId`, `address`, `area`, `type`, `price`, `rentPrice`)"
				+ "values"
				+ "(3, '헤라펠리스 101동 5305호', 350, '매매', 1500000, null)";
		
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 쿼리문 수행 (select) & 결과 출력
		String selectQuery = "select * from `real_estate` "
				+ "order by `id` desc "
				+ "limit 10;";
		PrintWriter out = response.getWriter();

		try {
			ResultSet resultSet = ms.select(selectQuery);
			while (resultSet.next()) { // 결과 행이 있는 동안
				out.print("매물 주소 : ");
				out.print(resultSet.getString("address") + ", ");
				out.print("면적 : ");
				out.print(resultSet.getInt("area") + ", ");
				out.print("타입 : ");
				out.print(resultSet.getString("type") + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// DB 연결 해제
		ms.disconnect();
	}
}
