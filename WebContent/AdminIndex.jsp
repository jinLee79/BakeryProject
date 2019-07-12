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

<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
  <!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark fixed-top" style="background-color: #0d4633">
    <div class="container">
    <span  style = "color : white; font-size: 14px; font-family: 'Jeju Hallasan',cursive; ">27년 변하지 않는 전통과 정성으로...</span>

      <a class="navbar-brand" href="index2.jsp" id = "topLogo">효모네 빵집</a>
      
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      



      
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" href="front?key=adminmanage">상품 관리
              <span class="sr-only">(current)</span>
            </a>
          </li>
          
           <li class="nav-item">
            <a class="nav-link" href="AdminOrder.jsp">주문 관리
              <span class="sr-only">(current)</span>
            </a>
          </li>
          
          <li class="nav-item">
            <a class="nav-link" href="front?key=userlist">회원 관리</a>
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

        <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
          <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0"class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          </ol>
          <div class="carousel-inner" role="listbox">
            <div class="carousel-item active">
              <img class="d-block img-fluid" style = "width:900px; height:350px"src="img/mainBread1.jpg" alt="First slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" style = "width:900px; height:350px"src="img/mainBread2.jpg" alt="Second slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" style = "width:900px; height:350px"src="img/mainBread3.jpg" alt="Third slide">
            </div>
          </div>
          <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>

        <div class="row">		
          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="pductDetail.jsp?productDTO=${list[0]}"><img class="card-img-top img-fluid" src="img/${list[0].getfName()}" style = "width:250px; height:150px" alt=""></a>
              <div class="card-body" style = "background-color: #CCCCCC">
                <h4 class="card-title">
                  <a href="#">${list[0].getProductName()}</a>
                </h4>
                <h5>${list[0].getSellPrice()}</h5>
                <p class="card-text">${list[0].getDescription()}</p>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="front?key=read&productCode=${list[1]}"><img class="card-img-top img-fluid" src="img/${list[1].getfName()}" style = "width:250px; height:150px" alt=""></a>
              <div class="card-body" style = "background-color: #CCCCCC">
                <h4 class="card-title">
                  <a href="#">${list[1].getProductName()}</a>
                </h4>
                <h5>${list[1].getSellPrice()}</h5>
                <p class="card-text">${list[1].getDescription()}</p>
              </div>
              
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="front"><img class="card-img-top img-fluid" src="img/${list[2].getfName()}" style = "width:250px; height:150px" alt=""></a>
              <div class="card-body" style = "background-color: #CCCCCC">
                <h4 class="card-title">
                  <a href="#">${list[2].getProductName()}</a>
                </h4>
                <h5>${list[2].getSellPrice()}</h5>
                <p class="card-text">${list[2].getDescription()}</p>
              </div>
              
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="front"><img class="card-img-top img-fluid" src="img/${list[3].getfName()}" style = "width:250px; height:150px" alt=""></a>
              <div class="card-body" style = "background-color: #CCCCCC">
                <h4 class="card-title">
                  <a href="#">${list[3].getProductName()}</a>
                </h4>
                <h5>${list[3].getSellPrice()}</h5>
                <p class="card-text">${list[3].getDescription()}</p>
              </div>
              
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="front"><img class="card-img-top img-fluid" src="img/${list[4].getfName()}" style = "width:250px; height:150px" alt=""></a>
              <div class="card-body" style = "background-color: #CCCCCC">
                <h4 class="card-title">
                  <a href="#">${list[4].getProductName()}</a>
                </h4>
                <h5>${list[4].getSellPrice()}</h5>
                <p class="card-text">${list[4].getDescription()}</p>
              </div>
              
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="front"><img class="card-img-top img-fluid" src="img/${list[5].getfName()}" style = "width:250px; height:150px" alt=""></a>
              <div class="card-body" style = "background-color: #CCCCCC">
                <h4 class="card-title">
                  <a href="#">${list[5].getProductName()}</a>
                </h4>
                <h5>${list[5].getSellPrice()}</h5>
                <p class="card-text">${list[5].getDescription()}</p>
            </div>
          </div>
        </div>   
      </div>
        <!-- /.row -->
        <div style = "width: 100%" align = "center">
			<button type = "button" class = "btn btn-success" onclick = "location.href = 'front?key=adminmanage'">상품 관리</button>        
        </div>
        <br>
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