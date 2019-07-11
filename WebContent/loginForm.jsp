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
		$("input[type = 'button']").click(function() {
		alert("dddd");
		if(confirm("정말 로그아웃 할래?")){
	
			location.href="Logout.jsp";
		}else{
			alert("서비스 더 이용해");
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
 	          <input type = "text" style="min-width:210px; min-height:30px" class = "text"  name="id" value = "아이디"  onclick = "function(this){this.value = '';}"/>

 	          <input type = "password" style="min-width:210px; min-height:30px" class = "password" name="pwd" value = "비밀번호"/>

 			  <button style="min-width:210px; min-height:30px" class = "btn btn-info btn-rm" >로그인</button>
 	        </form>
 	        <%
 		}  else{//세션에 id있을때
%>
			
		
			
 	         <h3><%=session.getAttribute("sessionId") %>님 로그인 중<br></h3>
 	         <h5>
 	         [접속시간 : ${AccessTime}]</h5><br>
 	         <button  class = "btn btn-info btn-rm" onclick=" location.href='mypage.jsp'">회원정보수정</button>
             <input type="button"  class = "btn btn-info btn-rm"  value="로그아웃" id = "logout">

 			<%
 		} 
    
    %>
        

	
	

</aside>
</body>
</html>