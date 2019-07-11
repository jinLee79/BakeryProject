package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.dto.ProductDTO;
import kosta.model.service.ProductService;

public class DetailController implements Controller
{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String url = "error.jsp";
		try { //����ó���� controller���� ó����
			//���� -> dao -> �� ����� list�� �����ϰ� list.jsp�� �̵�
			List<ProductDTO> list = ProductService.selectAllProduct();
			request.setAttribute("list", list);
			url="menuList.jsp";
		} catch(SQLException e) {
			request.setAttribute("errorMsg", e.getMessage());
		}
		ModelAndView mv = new ModelAndView(); //�̵������ �����ϴ� ModelAndView
		mv.setPath(url);
		return mv;
	}

}