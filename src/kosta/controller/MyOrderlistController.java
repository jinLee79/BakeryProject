package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.model.dto.OrderDTO;
import kosta.model.service.OrderService;

public class MyOrderlistController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/**
		 * cartlistmap -productcode, productname, quantity, sellprice
		 * 주문테이블: orderno, orderdate, receivingdate, ordertotal, orderstate, userid
		 *주문상세테이블: orderno, productcode, quantity
		 **/
		
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("sessionId");
		ModelAndView mv = new ModelAndView();
		String url="error.jsp";
		
		try {
			OrderDTO orderDTO = OrderService.viewMyOrder(userId);
			request.setAttribute("orderDTO", orderDTO);
			url="myOrderlist.jsp";
		}catch(SQLException e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
		}
		mv.setPath(url);
		return mv;
	}
	
}
