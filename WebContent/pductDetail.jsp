<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  
  <!-- Sidebar (hidden by default) -->

<!-- ---------------------------------------------------- -->
     <!-- Page Content -->
<div class="container">

<div class="row">

			<div class="col-lg-3">

        		<h1 class="my-4"><img class = "img img-fluid"  src = "img/hyomo2.png"></h1>
        		<div class="list-group">
				</div>
			</div>
      <!-- /.col-lg-3 -->

<div class="col-lg-9">

<div class="card mt-4">
<img class="card-img-top img-fluid" src="http://placehold.it/900x400" alt="">
<div class="card-body">
<h3 class="card-title">Product Name</h3>
<h4>$24.99</h4>
<p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente dicta fugit fugiat hic aliquam itaque facere, soluta. Totam id dolores, sint aperiam sequi pariatur praesentium animi perspiciatis molestias iure, ducimus!</p>
<input type = button class = "btn btn-info" value = "장바구니 담기" >
<input type = button class = "btn btn-info" value = "이전 페이지로" >

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