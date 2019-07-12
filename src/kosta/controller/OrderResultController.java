package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.model.dto.CartDTO;
import kosta.model.dto.OrderDTO;
import kosta.model.service.OrderService;

public class OrderResultController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ModelAndView mv = new ModelAndView();
		String url="error.jsp";
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("sessionId");
		String rdate1 = request.getParameter("rdate1");
		String rdate2 = request.getParameter("rdate2");
		String rdate3 = request.getParameter("rdate3");
		String receivingdate = rdate1+rdate2+rdate3;
		HashMap<String, CartDTO>cartListMap = (HashMap<String, CartDTO>) session.getAttribute("cartListMap");
		
		Iterator<String> it = cartListMap.keySet().iterator();
		int ordertotal =0;
		while(it.hasNext()) {
			 String pductCode = (String) it.next();
			 CartDTO cartlist = (CartDTO)cartListMap.get(pductCode);
			 ordertotal+=cartlist.getSellPrice();
		}

		OrderDTO orderDTO = new OrderDTO(0, userId, null, receivingdate, ordertotal, null);
		try {
			OrderService.insertOrder(orderDTO);
			url="orderResult.jsp";
			mv.setRedirect(true);
		} catch(SQLException e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
		}
		mv.setPath(url);
		session.removeAttribute("cartListMap");	// 惑前格废 技记 昏力
		return mv;
	}
}
