package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.dto.ProductDTO;
import kosta.model.service.ProductService;

public class ReadController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productCode = request.getParameter("productCode");
				
		ModelAndView mv = new ModelAndView();
		String url="error.jsp";
		try {
			 ProductDTO productDTO = ProductService.srchByProductCode(productCode);
			 request.setAttribute("productDTO", productDTO);
			 url = "pductDetail.jsp";
		} catch(SQLException e) {
			request.setAttribute("errorMsg", e.getMessage());
		}
		mv.setPath(url);
		return mv;
	}

}
