package kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CartController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 

HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ModelAndView mv = new  ModelAndView();
		return mv;
	}
}
	/*HttpSession session = request.getSession(true);
	ArrayList<ProductDTO> cart = (ArrayList<ProductDTO>)session.getAttribute

("list");
	
	//리스트가 없을경우 리스트를 생성
	if(cart == null) cart = new ArrayList<ProductDTO>();
	
	//추가된 상품 객체를 리스트에 담음
	cart.add(new ProductDTO(productCode,productName, sellPrice, description, 

fName));
	
	//세션에 리스트를 추가
	session.setAttribute("list", cart);
	
	//페이지 출력 -> 장바구니페이지로가고                           
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();
		return null;
	}*/



