<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Shop Homepage - Start Bootstrap Template</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/shop-homepage.css" rel="stylesheet">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Karma">

<style>
	@import url(//fonts.googleapis.com/earlyaccess/jejuhallasan.css);
     body{background-color: #f7f0da;}
     #topLogo{font-family: "Karma", sans-serif; font-size : 30px; vertical-align: bottom;}
     nav div div a{font-family: 'Jeju Hallasan',cursive;}
     body > nav > div > a {display:block; margin-left: 40%;}
     h1, table{font-family: 'Jeju Hallasan',cursive;}
     span{color: red; display: none;}
     table input[type = text], table input[type=password]{height: 22px;}
     select{height: 22px}
  </style>
<!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>


<script>
  $(function(){
	  $("#idcheck").keyup(function(){
		  if($(this).val()==""){
			  return;
		  }
		  $.ajax({
			  type : "post",
			  url : "IdCheck",
			  dataType: "text",
			  //data:  "userId="+$(this).val(),
			  success : function(result){
				 $("#idmsg").text(result);
			  },
			  error : function(err){
				  console.log(err+"오류발생");
			  }
		  });//ajaxEnd
	  })//idcheck끝
	});//ready끝

	</script>


</head>

<body>
  <!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark fixed-top" style="background-color: #0d4633">
    <div class="container">

      <a class="navbar-brand" href="#" id = "topLogo">KOSTA</a>
      
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
            <a class="nav-link" href="#">상품 주문</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">찾아오시는 길</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  
  <!-- Page Content -->

      <!-- /.col-lg-3 -->
	 <div class="col-lg-9" align="center">
	 
    	 
 <h1> 회원가입</h1>
 <table boder = "" bgcolor = "#f7f0da"  cellspacing = "1" >
	 <form name="inForm" method="post" id="inForm">
		  <tr>
			   <td text-align="center">아이디 </td>
			   <td><input type=text" style="height: 22px" id="idcheck"/></td>
			   <td><p id="idmsg">중복결과여부</p></td>
		  </tr>
		
		  <tr>
			   <td> 비밀번호 </td>
			   <td> <input type = "password"/> </td>
		  </tr>
		
		  <tr>
			   <td> 비밀번호 확인 </td>
			   <td> <input type = "password"/> </td>
		  </tr>
		  
		  <tr>
			   <td> 　　　　 　　 </td>
			   <td style="font-size: 13px"> *비밀번호를 다시 입력해주세요. </td>
		  </tr>
		
		  <tr>
			   <td> 성명 </td>
			   <td> <input type = "text"/> </td>
		  </tr>
		
			<tr>
				<td>나이</td>
				<td><input type = "text"/></td>
			</tr>
		
		  <tr>
		 	  <td> 휴대폰 </td>
			   <td> 
			    <select>
			     <option> 010 </option>
			     <option> 011 </option>
			     <option> 016 </option>
			     <option> 018 </option>
			    </select> 
			    <input type = "text" size = "6"/> - <input type = "text" size = "6"/>
			   </td>
		  </tr>
	 </form>
</table>

<br/>

<input type = "submit" value = "가입하기"/>
<input type = "reset" value = "다시 입력"/>



      </div>
      <!-- /.col-lg-9 -->

    
   	<div class="w3-center w3-padding-32">
    
  </div>

  <!-- Footer -->
  <footer class="py-5 bg-dark" >
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
    </div>
    <!-- /.container -->
  </footer>

  
  
</body>

</html>
