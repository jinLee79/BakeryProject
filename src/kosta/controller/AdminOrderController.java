package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.dto.OrderDTO;
import kosta.model.dto.ProductDTO;
import kosta.model.dto.UserDTO;
import kosta.model.service.OrderService;
import kosta.model.service.ProductService;
import kosta.model.service.UserService;

public class AdminOrderController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "error.jsp";
		try { //����ó���� controller���� ó����
			//���� -> dao -> �� ����� list�� �����ϰ� list.jsp�� �̵�
			List<OrderDTO> list = OrderService.selectAllOrder();
			request.setAttribute("list", list);
			url="AdminOrder.jsp";
		} catch(SQLException e) {
			request.setAttribute("errorMsg", e.getMessage());
		}
		ModelAndView mv = new ModelAndView(); //�̵������ �����ϴ� ModelAndView
		mv.setPath(url);
		return mv;
	}

}