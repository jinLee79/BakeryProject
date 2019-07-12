<%@page import="kosta.model.dto.CartDTO"%>
<%@page import="kosta.model.dao.ProductDAOImpl"%>
<%@page import="kosta.model.dao.ProductDAO"%>
<%@page import="kosta.model.dto.ProductDTO"%>
<%@page import="kosta.model.dto.OrderDTO"%>
<%@page import="kosta.controller.CartController"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.HashMap"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="cartcontroller" class="kosta.controller.CartController" scope="session"/>
<jsp:useBean id="proDAO" class="kosta.model.dao.ProductDAOImpl"/>
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
  <script type="text/javascript">
 function cartUpdate(form){

	form.flag.value="update";

	form.submit();

}

function cartDelete(form){

	form.flag.value="delete";

	form.submit();

}



</script>

<div class="col-lg-9">
<!-- DataTables Example -->
		<br>
        <div class="card mb-3">
          <div class="card-header">
            <i class="fas fa-table"></i>
            	<h2>장바구니 목록 </h2></div>
          <div class="card-body">
            <div class="table-responsive">
             
	<form action="cartprocess.jsp" method="get">

	 <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead style = "text-align:center; vertical-align: middle">
     

			<tr style="background-color: gold">

				<th>주문상품</th><th>가격</th><th>수량</th><th>수정/삭제</th><th>조회</th>

			</tr>
										
														<%
														

						int totalPrice = 0;
						HashMap<String, CartDTO> Cart = cartcontroller.getCartList();
		

				
				
							//장바구니가 비었을경우
				
							if(Cart.size()==0){
				
						%>
				
							<tr><td>주문 건수가 없습니다.</td></tr>
				
						<% 
				
							//장바구니에 내용이 있을경우
				
							} else { 
				
								//맵에 저장했던거 가져오기
								%>
								<c:forEach var="cartMap" items="${cartList}"></c:forEach>
									<c:set var="cartVal" value="${cartMap.key}"></c:set>
									<td><c:out value=""></c:out>
								<%
								//카트의 모든 제품코드(키값)을 추출
				
								Enumeration<String> enu = Cart.keys();
								
								Object[] objKey=Cart.keySet(). toArray();
								for(int i=0;i<objKey.length;i++){
								%>
								<tr>
								<td><%=objKey[i]%></td>
								<td><%=Cart.get(objKey[i]) %></td>
								</tr>
								<%
								}
								while(enu.hasMoreElements()){ //남은 키 값이 있다면
				
										
				
									//해당 제품코드(키값)의 카트내용을 담음
									CartDTO cdto = (CartDTO)Cart.get(enu.nextElement());
			
									//해당 제품코드의 제품정보를 db에서 가져옴
									ProductDTO pdto = proDAO.srchByProductCode(cdto.getProductCode());
									
				
										
				
									int price =pdto.getSellPrice();
				
									int quantity = (int)( request.getAttribute("quantity"));
				
									int subTotal = price * quantity;
				
									totalPrice += subTotal;
				
						%>		
				
								
				
								<tr style="text-align: center;">
				
									<td><%=pdto.getProductName() %></td>
				
									<td><%=subTotal %></td>
				
									<td>
				
										<input type="text" name="quantity" size="5" value="<%=cdto.getQuantity() %>" style="text-align: center;">
				
									</td>
				
									<td> 
				
										<!-- form 에서 가져갈 데이터 -->
				
										<input type="hidden" name="flag">
				
										<input type="hidden" name="productCode" value="<%=pdto.getProductName() %>">
				
										<!-- 수정/삭제 버튼 -->
				
										<input type="button" value="수정" onclick="cartUpdate(this.form)" style="background-color: silver"> /
				
										<input type="button" value="삭제" onclick="cartDelete(this.form)" style="background-color: silver"> 
				
									</td>
				
									<td><a href="javascript:productDetail('<%=pdto.getProductCode()%>')">상세보기</a></td>
				
								</tr>
				
						<%
				
								}
				
						%>
				
							<tr>
				
								<td colspan="5">
				
									<br/>
				
									<b>총 결제 금액 : <%=totalPrice %> 원</b>
				
									&nbsp;&nbsp;&nbsp;
				
									<a href="orderResult.jsp">[ 주문하기 ]</a>
				
								</td>
				
							</tr>
				
						<%	
				
							}
				
						%>
				
						</table>
				
					
				
					</form>
				

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