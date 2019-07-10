<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
     #topLogo{font-family: "Karma", sans-serif; font-size : 30px; vertical-align: bottom;}
     nav div div a{font-family: 'Jeju Hallasan',cursive;}
     body > nav > div > a {display:block; margin-left: 40%;}
  </style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script>
 $(function(){
	 alert(${productDTO.productCode});
/* 	 read();
	 
	$("#insertcart").click(function(){
		location.href="Cart?productCode="+${productDTO.productCode};
	}); */
});

 function read(){
	 $("#productCode").val(${productDTO.productCode});
	 $("#productName").val(${productDTO.productName});
	 $("#sellPrice").val(${productDTO.sellPrice});
	 $("#description").val(${productDTO.description});
	 $("#fname").attr("src=${productDTO.fname}");
 }
 	
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
             <%
          try{
             if(session.getAttribute("id").equals("admin")){
             %>
               <li class="nav-item">
                     <a class="nav-link" href="#">상품 관리</a>
                 </li>
             <%
             }
          }catch(Exception e){
             %>
             <li class="nav-item">
                 <a class="nav-link" href="#">상품 주문</a>
              </li>
          <%
          }
          %>
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
<h3 class="card-title"  id="productName"></h3>
<h4 id="productCode"></h4>
<h4 id="sellPrice"></h4>
<p class="card-text"  id="description"></p>
<input type = button class = "btn btn-info"  id="insertcart" value = "장바구니 담기" >
<input type = button class = "btn btn-info"  value = "이전 페이지로"  onclick="location.href='index.jsp'">

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