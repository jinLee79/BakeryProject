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
     #topLogo{font-family: 'Jeju Hallasan',cursive; font-size : 30px; vertical-align: middle;}
     nav div div a{font-family: 'Jeju Hallasan',cursive;}
     body > nav > div > a { margin-left: 20%;}
  </style>

<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
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
            <a class="nav-link" href="front?key=detail">제품 소개
              <span class="sr-only">(current)</span>
            </a>
          </li>
          
           <li class="nav-item">
            <a class="nav-link" href="cart.jsp">장바구니
              <span class="sr-only">(current)</span>
            </a>
          </li>
          
          <li class="nav-item">
            <a class="nav-link" href="location.jsp">찾아오시는 길</a>
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
        <video width="210" height="150" autoplay muted controls>
              <source src="video/breadmaking.mp4" type="video/mp4">
         </video>
        </div>
      </div>
      <!-- /.col-lg-3 -->

      <div class="col-lg-9">

		<br><br>
        <div class="row">
		<%
		%>
		<c:forEach items="${list }" var = "prod">
          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top img-fluid" src="${path }/img/${prod.fName}" style = "width:250px; height:150px" alt=""></a>
              <div class="card-body" style = "background-color: #CCCCCC">
                <h4 class="card-title">
                  <a href="#">${prod.productName}</a>
                </h4>
                <h5>${prod.sellPrice }</h5>
                <p class="card-text">${prod.description }</p>
              </div>
              
            </div>
          </div>
</c:forEach>
        <!-- /.row -->
		

     
      </div>
      <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

	</div>
    <!-- /.container -->
    



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