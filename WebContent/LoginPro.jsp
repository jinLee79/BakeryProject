<%@page import="java.util.Date"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%


		String dbId="admin" , dbpwd="4567";

		
		String inputId =request.getParameter("id");
		String inputpwd= request.getParameter("pwd");

		
		String time =new Date().toLocaleString();
	

		if(dbId.equals(inputId) && dbpwd.equals(inputpwd)){
			//세션에 정보 저장
			session.setAttribute("id", dbId);
			session.setAttribute("AccessTime", time);

			response.sendRedirect("index.jsp");
			
		}else{	
			%>
			
			<script type="text/javascript">
					alert("아이디와 패스워드를 다시 확인해주세요");
					history.back()
			</script>
			
			<%
			response.sendRedirect("index.jsp");

		}
		     String id = (String)session.getAttribute("id");
						if(id.equals("admin")) {
							out.println("<td><a href='AdminOrder.jsp'>관리자</a></td>");
						} else {
							out.println("<td><a href='index.jsp'>사용자</a></td>");
						}
		
%>
</body>
</html>