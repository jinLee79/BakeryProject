package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.map.HashedMap;

import kosta.model.dto.CartDTO;
import kosta.model.dto.UserDTO;
import kosta.model.service.UserService;



public class CartController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, CartDTO> map =null;
		
		String productCode = request.getParameter("productCode");
		String quantity = request.getParameter("quantity");
		String productName = request.getParameter("productName");
		String sellPrice = request.getParameter("sellPrice");
		
		  HttpSession session = request.getSession();
		Object obj =  session.getAttribute("cartListMap");
        if(obj==null) {
        	map = new HashMap<>();
        	session.setAttribute("cartListMap", map);
        }else {
        	map =(HashMap<String, CartDTO>)obj;
        }
        
       map.put(productCode, new CartDTO(productCode, productName, Integer.parseInt(sellPrice), Integer.parseInt(quantity)));
		
		System.out.println("map:" + map);
		ModelAndView mv = new ModelAndView();
		mv.setPath("cart.jsp"); //이동할 때 forward방식으로 가야 됨.

		return mv;
	}

}
