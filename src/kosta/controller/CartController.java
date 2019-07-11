package kosta.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.model.dto.CartDTO;
import kosta.model.dto.ProductDTO;
import kosta.model.service.ProductService;

public class CartController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		ModelAndView mv = new ModelAndView();
		
		String productCode = request.getParameter("productCode");
	  	int quantity = Integer.parseInt(request.getParameter("quantity"));
	  	
	  	// cartMap라는 이름으로 세션 설정
	  	HttpSession session = request.getSession();
	  	Map<String, CartDTO> cartMap = (HashMap<String, CartDTO>)session.getAttribute("cartMap");

	    // cartMap 속성명이 없을 경우 null값을 리턴
	  	if(cartMap == null) {
	      // ArrayList 객체를 생성하여 setAttribute로 해당 속성에 list값을 지정
	  		cartMap = new HashMap<String, CartDTO>;
	  		session.setAttribute("cartMap", cartMap);
	  	}
	  	CartDTO cart = new CartDTO();
	  	try {
	  		ProductDTO productDTO = ProductService.srchByProductCode(productCode);
		  	cart.setProductCode(productCode);
		  	cart.setProductName(productDTO.getProductName());
		  	cart.setSellPrice(productDTO.getSellPrice());
		  	cart.setQuantity(quantity);
		  	cartMap.put(, cart);
	  	} catch(SQLException e) {
	  		e.printStackTrace();
	  		mv.setPath("error.jsp");
	  	}
	  	if(cartDTO.getQuantity() >0){ 
			//카트에 동일상품이 있으면
			if(cartMap.containsKey(cartDTO.getProductCode()){
				//카트의 기존 상품번호의 orderbean을 가져옴
				ProductDTO tempBean = (ProductDTO)cartMap.get(cartDTO.getProductCode());
				
				//현재 갯수 + 기존 상품의 갯수
				quantity += Integer.parseInt(tempBean.getQuantity());

				//기존상품 갯수 = 현재갯수 + 기존상품 갯수
				tempBean.setQuantity(Integer.toString(quantity));

				//카트에 추가
				cart.put(product_no, tempBean);

			//카트에 동일상품이 없으면
			} else {
				cart.put(product_no, obean);

	  <script>
	  alert("<%=productname %> 이(가) <%=quantity %>개 추가 되었습니다");
	  history.go(-1);
	  </script>
		


			ModelAndView mv = new  ModelAndView();
			
			ProductDTO productDTO = ProductService.srchByProductCode(productCode);
			CartDTO cartDTO = new CartDTO(productCode, productDTO.getProductName(), productDTO.getSellPrice(), quantity);
			boolean result = CartService.addCart(request, response);
			if(result) {
				out.println("<script>confirm('장바구니에 상품이 추가되었습니다! 장바구니로 이동하시겠습니까?')</script>");
				if(confirm) mv.setPath("cart.jsp");
			}else {
				out.println("<script>alert('오류발생. 다시 담아주세요.')</script>");
				mv.setPath("error.jsp");
			}

			return mv;
		}
}

private static 
		
	/**
	 * 카트에 추가
	 * return: true면 장바구니에 추가 성공, false면 추가 실패
	 * */
	public static boolean addCart(HttpServletRequest request, HttpServletResponse response){
		
			}
	}

	

	//카트 목록 출력
	public Hashtable<String,ProductDTO> getCartList() {
		return cart;
	}

	//카트 내용 수정
	public void updateCart(ProductDTO obean) {
		String product_no = obean.getProduct_no();
		cart.put(product_no, obean);
	}


	//카트 내용 삭제
	public void deleteCart(ProductDTO obean) {
		String product_no = obean.getProduct_no();
		cart.remove(product_no);
	}


}


if(productCode==""){
	PrintWriter out = response.getWriter();
	out.println("<script>alert('장바구니 비었습니다'</script>");
}
if(productCode!=null){
	session.setAttribute("productCode", productCode);
	session.setAttribute("quantity", quantity);
}

			ArrayList<ProductDTO> cart = (ArrayList<ProductDTO>)session.getAttribute(list);
			
			//리스트가 없을경우 리스트를 생성
			if(cart == null) cart = new ArrayList<ProductDTO>();
					
			//추가된 상품 객체를 리스트에 담음
			cart.add(productDTO);
			
			//세션에 리스트를 추가
			session.setAttribute("list", cart);
			
			//페이지 출력 -> 장바구니페이지로가고                           
			



