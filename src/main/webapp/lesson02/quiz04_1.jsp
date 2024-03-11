<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>길이 변환</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

</head>
<body>
	<%
		int length = Integer.parseInt(request.getParameter("length"));
		String[] measureArr = request.getParameterValues("measure");
		
	%>
	<div class="container">
		<h1>길이 변환 결과</h1>
		<h3><%=length %>cm</h3>
		<hr>
		<h2>
		<%
		if (measureArr != null) {
			for (String measure : measureArr) {
					if (measure.equals("inch")) {
						double resultInch = length * 0.3937;
						out.print(resultInch + "in<br>");

					} else if (measure.equals("yard")) {
						double resultYard = length * 0.0109;
						out.print(resultYard + "yd<br>");

					} else if (measure.equals("fit")) {
						double resultFeet = length * 0.0328;
						out.print(resultFeet + "ft<br>");

					} else if (measure.equals("meter")) {
						double resultMeter = length * 0.01;
						out.print(resultMeter + "m<br>");
					}
				}
		}
		%>
		</h2>
	</div>
	
	
</body>
</html>