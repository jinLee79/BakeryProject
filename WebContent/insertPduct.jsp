 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
     #dataTable > tbody > tr > td{vertical-align: middle}
  </style>

<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	
	function checkValid() {
	    var f = window.document.insertForm;
			
		if ( f.code.value == "")
		{
		    alert( "상품 코드를 입력해 주세요." );
		    f.code.focus();
			return false;
	    }
		if ( f.name.value == "" )
		{
			alert( "상품 이름을 입력해 주세요." );
			f.name.focus();
			return false;
		}
		if ( f.price.value == "" )
		{
			alert( "상품 가격을 입력해 주세요." );
			f.price.focus();
			return false;
		}
		if ( f.des.value == "" )
		{
	        alert( "상품 설명을 입력해 주세요." );
	        f.des.focus();
	        return false;
	    }	
	    return true;
	}
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
           <li class="nav-item active">
            <a class="nav-link" href="front?key=adminlist">상품 관리
              <span class="sr-only">(current)</span>
            </a>
          </li>
          
          <li class="nav-item">
            <a class="nav-link" href="AdminOrder.jsp">주문 관리
              <span class="sr-only">(current)</span>
            </a>
          </li>
          
          <li class="nav-item">
            <a class="nav-link" href="AdminUserManage.jsp">회원 관리</a>
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

      <div class="col-lg-9" >

<!-- DataTables Example -->
		<br>
		  
		<form name = "insertForm" action = "../front?key=insert" method = "post" enctype="multipart/form-data" onSubmit='return checkValid()'> 
            <table align="center" style="width: 500px; height: 300px;">
               <h1 align="center">상품등록</h1>
                <tr align="center">
                    <td id="title" style="width: 35%;" align="right" >상품코드</td>
                   <td align="left"> <input type = "text" name = "code"/> </td>
                </tr>
                <tr>
                    <td id="title" style="width: 35%;" align="right" >상품명</td>
                    <td>
                        <input type = "text" name = "name"/>
                    </td>
                </tr>
        
                <tr>
                    <td id="title" style="width: 35%;" align="right">가격</td>
                    <td> <input type = "text"  name="price" name = "price"/> </td>
                </tr>
                
                <tr>
                    <td id="title" style="width: 35%;" align="right" name="description">설명</td>
                    <td> <input type = "text"  name="description" name = "des"/> </td>
                </tr>
                
                <tr>
                    <td id="title" style="width: 35%;" align="right" name="img">이미지</td>
                    <td> <input type="file" name="file" maxlength="60" size="40"> </td>
                </tr>
                
              
              <tr align="center">
                 <td colspan ="2">
                <input class="btn btn-danger btn-sm" type="submit" value="등록하기"/>
               <input class="btn btn-danger btn-sm" type="button" value="뒤로가기"></td>
              </tr>
              
            </table>
            
             <input type=hidden name="key" value="">
        </form>
		
        
      </div>

   </div>
   <!-- /.container-fluid -->


</div>




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
