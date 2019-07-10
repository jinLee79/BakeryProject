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

 <!-- Page level plugin CSS-->
  <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

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
     #dataTable > tbody > tr> td {text-align:center; vertical-align:middle}
  </style>

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
        <li class="nav-item">
            <a class="nav-link" href="menuList.jsp">제품 소개
              <span class="sr-only">(current)</span>
            </a>
          </li>
          
           <li class="nav-item active">
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

<!-- DataTables Example -->
		<br>
        <div class="card mb-3">
          <div class="card-header">
            <i class="fas fa-table"></i>
            	장바구니 목록</div>
          <div class="card-body">
            <div class="table-responsive">
              <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead style = "text-align:center; vertical-align: middle">
                  <tr>
                    <th> 　이미지</th>
                    <th> 　상품코드</th>
                    <th> 　상품명</th>
                    <th> 　수량</th>
                    <th> 　단가</th>
                    <th> 　가격</th>
                    <th> 　삭제</th>
                  </tr>
                </thead>
                <tfoot style = "text-align:center; vertical-align: middle">
                  <tr>
                    <th>이미지</th>
                    <th>상품코드</th>
                    <th>상품명</th>
                    <th>수량</th>
                    <th>단가</th>
                    <th>가격</th>
                    <th>삭제</th>
                  </tr>
                </tfoot>
                <tbody style = "text-align:center; vertical-align: bottom;">

                </tbody>
              </table>
            </div>
          </div>
          <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
        </div>

      </div>
      <!-- /.container-fluid -->

</div>
  <!-- ------------------------------------------ -->
 



  <!-- ------------------------------------------- -->

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
  

	 <!-- Page level plugin JavaScript-->
  <script src="vendor/datatables/jquery.dataTables.js"></script>
  <script src="vendor/datatables/dataTables.bootstrap4.js"></script>
  
    <!-- Demo scripts for this page-->
  <script src="js/demo/datatables-demo.js"></script>
  <script src="js/demo/chart-area-demo.js"></script>
</body>
</html>