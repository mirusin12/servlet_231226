<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz01</title>
</head>
<body>
<!-- 1번 -->
	<%!
		
		// method
		public int getSum(int N) {
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
		}
		return sum;
	}
	%>
	<br>
<!-- 2번 -->
	<%
		int[] scores = {81, 90, 100, 95, 80};
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double average = (double)sum / scores.length;
	%>
	<br>
<!-- 3번 -->
	<%
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		int score = 0;
		for (int i = 0; i < scoreList.size(); i++) {
			if (scoreList.get(i).equals("O")) {
				score += 100 / scoreList.size();
			}
		}
	%>
	<br>
<!-- 4번 -->
	<%
		String birthDay = "20010820";
		int year = Integer.parseInt(birthDay.substring(0, 4));
		int age = 2025 - year;
	%>
	<h1>1부터 50까지의 합은 <%= getSum(50) %></h1>
	<h1>평균 점수는 <%= average %> 입니다.</h1>
	<h1>채점 결과는 <%= score %>점입니다.</h1>
	<h1><%= birthDay %>의 나이는 <%= age %>세입니다.</h1>
	



</body>
</html>