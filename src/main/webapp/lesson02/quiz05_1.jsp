<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h2>계산 결과</h2>
		<!-- 사칙 연산 가져오기 -->
		<div class="display-1">
		<%
			int beforeNum = Integer.parseInt(request.getParameter("beforeNum"));
			int afterNum = Integer.parseInt(request.getParameter("afterNum"));
			double result = 0;
			String type = request.getParameter("type");
			if (type.equals("+")) {
				result = (double)beforeNum + afterNum;
				out.print(beforeNum + " + " + afterNum + " = ");
				
			} else if (type.equals("-")) {
				result = (double)beforeNum - afterNum;
				out.print(beforeNum + " - " + afterNum + " = ");
				
			} else if (type.equals("*")) {
				result = (double)beforeNum * afterNum;
				out.print(beforeNum + " X " + afterNum + " = ");

			} else {
				result = (double)beforeNum / afterNum;
				out.print(beforeNum + " / " + afterNum + " = ");

			}
		%>
		<span class="text-primary"><%=result %></span>
		</div>
	</div>
</body>
</html>