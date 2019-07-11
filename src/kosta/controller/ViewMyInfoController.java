package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.model.dto.UserDTO;
import kosta.model.service.UserService;

public class ViewMyInfoController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "error.jsp";
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		
		String userId = (String) session.getAttribute("sessionId");
		try {
			UserDTO userDTO = UserService.viewMyInfo(userId);
			request.setAttribute("userDTO", userDTO);
			mv.setPath("mypage.jsp");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return mv;
	}

}
