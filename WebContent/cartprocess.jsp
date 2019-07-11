<%@page import="kosta.model.dto.ProductDTO"%>
<%@page import="kosta.model.dto.CartDTO"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.HashMap"%>
<%@page import="kosta.controller.CartController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<jsp:useBean id="cdto" class="kosta.model.dto.CartDTO"scope="session"/>
<jsp:setProperty property="*" name="cdto"/>
<jsp:useBean id="cartcontroller" class="kosta.controller.CartController"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

<%

	String flag = request.getParameter("flag"); //구매목록 보기, 수정, 삭제 구분 (상품번호 유무를 flag로 구분)

	String id = (String)session.getAttribute("sessionId"); //로그인 확인

	

	if(id == null){ //로그인이 안되어있을때

		response.sendRedirect("index.jsp"); //로그인 강요

	} else {

		

		//카트에 상품담기

		if(flag == null){	//구매목록보기?
			
			cdto.setProductCode("productCode");	//주문상세에서 상품번호 불러옴
			cartcontroller.addCart(cdto);
%>

			<script>

				alert("장바구니에 담았습니다");

			//	location.href = "cart.jsp";

			</script>

<%

		//카트에 상품 수정

		} else if(flag.equals("update")){

			cdto.setProductCode("productCode");	
			cartcontroller.updateCart(cdto);

%>

			<script>

				alert("장바구니에 내용을 수정했습니다");

				location.href = "cartlist.jsp";

			</script>

<%

		} else if(flag.equals("delete")){

			cartcontroller.deleteCart(cdto);

%>

			<script>

				alert("장바구니에 상품을 삭제했습니다.");

			location.href = "cartlist.jsp";

			</script>

<%

		}

	}

	

%>




</body>
</html>