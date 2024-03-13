<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>교포문고</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<%
		    List<Map<String, Object>> list = new ArrayList<>();
		    Map<String, Object> map = new HashMap<String, Object>() {
		        { 
		            put("id", 1000);
		            put("title", "아몬드"); 
		            put("author", "손원평"); 
		            put("publisher", "창비");
		            put("image", "http://image.kyobobook.co.kr/images/book/xlarge/267/x9788936434267.jpg");
		        } 
		    };
		    list.add(map);
	
		    map = new HashMap<String, Object>() {
		        { 
		            put("id", 1001);
		            put("title", "사피엔스"); 
		            put("author", "유발 하라리"); 
		            put("publisher", "김영사");
		            put("image", "http://image.kyobobook.co.kr/images/book/xlarge/464/x9788934972464.jpg");
		        } 
		    };
		    list.add(map);
	
		    map = new HashMap<String, Object>() {
		        { 
		            put("id", 1002);
		            put("title", "코스모스"); 
		            put("author", "칼 세이건"); 
		            put("publisher", "사이언스북");
		            put("image", "http://image.kyobobook.co.kr/images/book/xlarge/892/x9788983711892.jpg");
		        } 
		    };
		    list.add(map);
	
		    map = new HashMap<String, Object>() {
		        { 
		            put("id", 1003);
		            put("title", "나미야 잡화점의 기적"); 
		            put("author", "히가시노 게이고"); 
		            put("publisher", "현대문학");
		            put("image", "http://image.kyobobook.co.kr/images/book/xlarge/194/x9788972756194.jpg");
		        } 
		    };
		    list.add(map);
		    
		    // quiz08.jsp에서 보낸 id 불러오기
		    Object rqId = request.getParameter("id");
	    	Object image = list.get(0).get("image");
	    	Object title = list.get(0).get("title");
	    	Object id1 = list.get(0).get("id");
	    	Object id2 = list.get(1).get("id");
	    	Object id3 = list.get(2).get("id");
	    	Object id4 = list.get(3).get("id");
	    	

		    for (int i = 0; i < list.size(); i++) {
		    	out.print(rqId);
		    	// out.print(list.get(i).get("id") + "<br>");
		    	// out.print(rqId.equals(list.get(i).get("id")) + "<br>");
		    	out.print(rqId == list.get(i).get("id"));
			}
	    	/*
		    for (int i = 0; i < list.size(); i++) {
		    	Object id = list.get(i).get("id");
		    	if (rqId.equals(id)) {
			    	image = list.get(i).get("image");
			    	title = list.get(i).get("title");
				}
			}
	    	*/
		%>
		<!-- 
		<div>
			<img src="<%= image %>" alt="책이미지" width=200 height=300>
			<h1 class="text-bold">코스모스</h1>
		</div>
		 -->
		
		
		
		
		
		
	</div>
</body>
</html>