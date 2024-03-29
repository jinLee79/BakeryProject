package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.dto.ProductDTO;
import kosta.model.service.ProductService;



public class AdminSelectController implements Controller
{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String url = "error.jsp";
		try { //예외처리를 controller에서 처리함
			//서비스 -> dao -> 그 결과를 list를 저장하고 list.jsp로 이동
			List<ProductDTO> list = ProductService.selectAllProduct();
			
			request.setAttribute("list", list);
			url="AdminPduct.jsp";
		} catch(SQLException e) {
			request.setAttribute("errorMsg", e.getMessage());
		}
		ModelAndView mv = new ModelAndView(); //이동방식을 결정하는 ModelAndView
		mv.setPath(url);
		return mv;
	}

}
