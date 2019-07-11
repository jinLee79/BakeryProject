<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
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
      #topLogo{font-family: 'Jeju Hallasan',cursive; font-size : 30px; vertical-align: middle;}
     nav div div a{font-family: 'Jeju Hallasan',cursive;}
     body > nav > div > a { margin-left: 20%;}
 </style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

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


<!-- ---------------------------------------------------- -->
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

<div class="card mt-4">
<img class="card-img-top img-fluid"  id="fName">
<div class="card-body">
	<h2>상품 상세정보</h2>
	<table border="1">
		<tr>
			<td>
				<img src=" ${path}/img/${productDTO.fName}" width="340" heigth="300"}>
			</td>
			<td>
				<table border="1" style="height: 300px; width: 400px">
					<tr align="center">
						<td> 상품명 </td>
						<td> ${productDTO.productName}</td>
					</tr>
					<tr align="center">
						<td> 가격 </td>
						<td> <fmt:formatNumber value="${productDTO.sellPrice}" pattern="###,###,###"/>원</td>
					</tr>
					<tr align="center">
						<td> 상품소개 </td>
						<td> ${productDTO.description}</td>
					</tr>
					<tr align="center">
						<td colspan="2">
							<form name="form1"  id="form1" method="post" action="front" >
								<input type="hidden" name="key"  value="cart">
								<input type="hidden" name="productCode"  value=${productDTO.productCode }">
								<select name="quantity">
									<c:forEach begin="1"  end="10"  var="i">
										<option value="${i }">${i}</option>
									</c:forEach>
								</select> &nbsp;개
								<input type="submit"  value="장바구니에 담기" >
								<a href="${path}/index.jsp"  >메인페이지로</a>
							</form>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</div>
</div>
        <!-- /.card -->
</div>
      <!-- /.col-lg-9 -->

</div>

</div>
  <!-- ------------------------------------------ -->

  <!-- Footer -->
  <footer class="py-5 bg-dark">
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