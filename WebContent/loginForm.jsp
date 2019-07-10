<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script type="text/javascript">

		$(function() {
		$("body > div.container > div > div.col-lg-3 > div > aside > button:nth-child(5)").click(function() {

		if(confirm("정말 로그아웃 할래?")){
			//세션 정보 지우기=>여기서 지우면 계속 세션이 끊겨서 로그인X
			location.href="Logout.jsp";
		}else{
			alert("서비스 더 이용해");
		}
	})
	
	})
</script>
</head>
<body>
<aside> 
     
    
    <%
    	
 		if(session.getAttribute("sessionId")==null){ //세션에 id없을떄
 			%>
 		    <form action="front"  method="post">
 		     <input type = "hidden"  name="key" value = "login"/>
 	          <input type = "text" style="min-width:210px; min-height:30px" class = "text"  name="id" value = "아이디"/>

 	          <input type = "password" style="min-width:210px; min-height:30px" class = "password" name="pwd" value = "비밀번호"/>

 			  <button style="min-width:103px; min-height:30px" class = "btn btn-info btn-rm" >로그인</button>
 			  <input type = "button" style="min-width:103px; min-height:30px" class = "btn btn-info btn-rm" onclick="location.href='signUp.jsp'" value = "회원가입">
 	        </form>
 	        <%
 		}  else{//세션에 id있을때
%>
 	         <h3><%=session.getAttribute("sessionId") %>님 로그인 중<br></h3>
 	         <h5>
 	         [접속시간 : ${AccessTime}]</h5><br>
 	         <button  class = "btn btn-info btn-rm">회원정보수정</button><!-- onclick=" location.href='mypage.jsp'"  --> 
             <button  class = "btn btn-info btn-rm">로그아웃</button>

 			<%
 		} 
    
    %>
        

	
	


</aside>
</body>
</html>