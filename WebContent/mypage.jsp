<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>회원정보</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/shop-homepage.css" rel="stylesheet">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Karma">

<style>
   @import url(//fonts.googleapis.com/earlyaccess/jejuhallasan.css);
     body{background-color: #f7f0da;}
     #topLogo{font-family: 'Jeju Hallasan',cursive; font-size : 30px; vertical-align: middle;}
     nav div div a{font-family: 'Jeju Hallasan',cursive;}
     body > nav > div > a { margin-left: 20%;}
     h1,table tr>td:nth-child(1){font-family: 'Jeju Hallasan',cursive;}
     table input[type = text], table input[type=password]{height: 22px;}
     select{height: 22px}
  </style>
  
  <script>
  function checkValid() {
		var f = window.document.updateUserForm;
		if ( f.userPwd.value == "" ) {
			alert( "비밀번호를 입력해 주세요." );
			f.userPwd.focus();
			return false;
		}
		if ( f.userName.value == "" ) {
	        alert( "비밀번호를 입력해 주세요" );
	        f.userName.focus();
	        return false;
	    }
		if ( f.age.value == "" ) {
			alert( "나이를 입력해 주세요." );
			f.age.focus();
			return false;
		}
		if ( f.phone.value == "" ) {
	        alert( "연락처를 입력해 주세요." );
	        f.phone.focus();
	        return false;
	    }
	}
  
  	function sendDelete(){//삭제
		if(document.updateUserForm.password.value==""){
			alert("삭제를 위한 비밀번호를 입력해주세요.");
			document.updateUserForm.password.focus();
			return;
		}
  
  $(function(){
	  $(document).on("click", "body > div.container > div > div.col-lg-9 > form > table > tbody > tr:nth-child(6) > td > input[type=submit]:nth-child(1)", function(){
		  alert("회원정보 수정되었습니다!")
	  })
  })
  
  </script>
  
</head>

<body>
  <!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark fixed-top" style="background-color: #0d4633">
    <div class="container">
    <span  style = "color : white; font-size: 14px; font-family: 'Jeju Hallasan',cursive; ">27년 변하지 않는 전통과 정성으로...</span>

      <a class="navbar-brand" href="index.jsp" id = "topLogo">효모네 빵집</a>
      
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">제품 소개
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">찾아오시는 길</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  
  <!-- Sidebar (hidden by default) -->


  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <div class="col-lg-3">

        <h1 class="my-4"><img class = "img img-fluid"  src = "img/hyomo2.png"></h1>
        <div class="list-group">
        <%@ 
                    include file = "loginForm.jsp"
        %>
      </div>
      </div>
      <!-- /.col-lg-3 -->
    <div class="col-lg-9">
    
 <br>
        <form method="post" action="front"  name="updateUserForm"  onSubmit="return checkValid()">
         	<input type="hidden" name="key" value="updateUser" >          
            <table align="center" style="width: 500px; height: 300px;">
	               <h1 align="center">회원정보</h1>
		                <tr align="center">
			                    <td id="title" style="width: 35%;" align="right" >아이디</td>
			                   	<td align="left"> <input type = "text"  value=${requestScope.userDTO.userId} readonly/></td>
		                </tr>
		                <tr>
			                    <td id="title" style="width: 35%;" align="right" >비밀번호</td>
			                    <td><input type="password"  value=${userDTO.userPwd} name="userPwd" maxlength="50" ></td>
		                </tr>
		                <tr>
			                    <td id="title" style="width: 35%;" align="right">이름</td>
			                    <td> <input type = "text"  value=${userDTO.userName} name="userName"/></td>
		                </tr>
		                <tr>
			                    <td id="title" style="width: 35%;" align="right" >나이</td>
			                    <td> <input type = "text"   value=${userDTO.age} name="age"/></td>
		                </tr>
		                <tr>
			                    <td id="title" style="width: 35%;" align="right" >휴대전화</td>
			                    <td> <input type = "text"  value=${userDTO.phone} name="phone"/></td>
		              	 </tr>
			             <tr align="center">
			               	 	<td colspan ="2"><input type="submit" value="수정하기"/>
			               		<input type="button" value="메인으로" onclick="location.href='index.jsp'"></td>
			             </tr>
            </table>
        </form>

      </div>
      <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

   </div>
    <!-- /.container -->
    
      <div class="w3-center w3-padding-32">
    
  </div>

  <!-- Footer -->
  <footer class="py-5 bg-dark" >
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  
</body>

</html>