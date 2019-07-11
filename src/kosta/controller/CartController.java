package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.model.dto.CartDTO;
import kosta.model.dto.OrderDetailsDTO;
import kosta.model.dto.ProductDTO;
import kosta.model.dto.UserDTO;
import kosta.model.service.ProductService;
import kosta.model.service.UserService;



public class CartController implements Controller {
	private HashMap<String,CartDTO> Cart = new HashMap<String,CartDTO>();
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		ModelAndView mv = new ModelAndView();
		
		String productCode = request.getParameter("productCode");
		int quantity=1;
		
		
	 // 	int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		// cartMap라는 이름으로 세션 설정
		//CartDTO cdto = new CartDTO(productCode, productName, sellPrice, quantity);
		
		String url = "errorView/error.jsp";
	  	HttpSession session = request.getSession();
		try {	
			ProductDTO pdto=ProductService.srchByProductCode(productCode);
			String productName=pdto.getProductName();
			int sellPrice=pdto.getSellPrice();

			CartDTO cdto = new CartDTO(productCode, productName, sellPrice, quantity);

			session.setAttribute("sessioncart", cdto);	
			
			HashMap<String, CartDTO> Cart = this.getCartList();
			Cart.put("cartList", cdto);
		
	   //    String sessionId=(String) session.getAttribute("sessionId");
	       if(session.getAttribute("sessioncart")!=null) {	//카트에 상품이 담긴다면 카트에서 뿌려주고
	    	   url = "cart.jsp";
	       }else url = "pductDetail.jsp"; 	//안담기면 그대로 상세보기 페이지에..?or 아무데나 넘기기
	       
	       
	       
		}
		catch (SQLException e) { //SQLException이 날 수도 있단 얘기....error.jsp로 가게 만든다.
			request.setAttribute("errorMsg", e.getMessage()); //error.jsp에서 ${requestScope.errorMsg} 값을 정해줌..
		}
		
		mv.setPath(url); //이동할 때 forward방식으로 가야 됨.

		return mv;
	  	
	  //	Map<String, cdto> cartMap = new (HashMap<String, cdto>)session.getAttribute("cartMap");

	}
		//카트에 추가
		public void addCart(CartDTO cdto){
			
			//key값 : product_no, value값 : OrderBean
			String productCode = cdto.getProductCode();
			int quantity = cdto.getQuantity();
			
			//주문수량이 0보다 크면
			if(quantity >0){ 
				
				//카트에 동일상품이 있으면
				if(Cart.containsKey(productCode)){
					
					//카트의 기존 상품번호의 OrderDetailsDTO을 가져옴
					CartDTO originDto = (CartDTO)Cart.get(productCode);
					
					//현재 갯수 + 기존 상품의 갯수
					quantity += originDto.getQuantity();
					
					//기존상품 갯수 = 현재갯수 + 기존상품 갯수
					originDto.setQuantity(quantity);
					
					//카트에 추가
					Cart.put(productCode, originDto);
					

				//카트에 동일상품이 없으면
				} else {
					Cart.put(productCode, cdto);
				}
			}
		}
		
		//카트 목록 출력
		public HashMap<String,CartDTO> getCartList() {
			return Cart;
		}
		
		//카트 내용 수정
		public void updateCart(CartDTO cdto) {
			String productCode = cdto.getProductCode();
			Cart.put(productCode, cdto);
		}
		
		//카트 내용 삭제
		public void deleteCart(CartDTO cdto) {
			String productCode = cdto.getProductCode();
			Cart.remove(productCode);
		}
	}
