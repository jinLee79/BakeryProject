<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script type="text/javascript">

		$(function() {
		$("input[value = '로그아웃']").click(function() {

		if(confirm("로그아웃 하시겠습니까?")){
	
			location.href="Logout.jsp";
		}else{
			alert("서비스 계속 이용하세요.");
		}
	})
	
	
/* 	  $("input").blur(function(){
		  $(this).val()="";
		    $(this).css("background-color", "#ffffff");
		    
		  });
		 */

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
 	          <input type = "text" style="min-width:210px; min-height:30px" class = "text"  name="id" value = "아이디"  />

 	          <input type = "password" style="min-width:210px; min-height:30px" class = "password" name="pwd" value = "비밀번호"/>

 			  <button style="min-width:103px; min-height:30px" class = "btn btn-info btn-rm" >로그인</button>
 			  
 			  <input type = "button" style="min-width:103px; min-height:30px" class = "btn btn-info btn-rm" onclick="location.href='signUp.jsp'" value = "회원가입">
 	        </form>
 	        <%
 		}  else{//세션에 id있을때
%>
			
	
 	         <h3><%=session.getAttribute("sessionId") %>님 로그인 중<br></h3>
 	         <h5>즐거운 빵 쇼핑 되세요~^-^</h5><br>
		
 	         
 	       <input type="button"   class = "btn btn-info btn-rm" onclick=" location.href='front?key=view'" value="회원정보수정">
             <input type="button"  class = "btn btn-info btn-rm"  value="로그아웃" id = "logout">
	
 			<%
 		} 
    
    %>
 
</aside>
</body>
</html>