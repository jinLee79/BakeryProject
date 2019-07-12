package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.model.dto.UserDTO;
import kosta.model.service.UserService;


public class UpdateUserController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String url = "error.jsp";
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		
		String userId = (String) session.getAttribute("sessionId");
		String userPwd = request.getParameter("userPwd");
		String userName = request.getParameter("userName");
		String age = request.getParameter("age");
		String phone = request.getParameter("phone");
		
		UserDTO userDTO = new UserDTO(userId, userPwd, userName, Integer.parseInt(age), phone);
		
		try {
			UserService.updateMyInfo(userDTO); 
			url = "updateUserResult.jsp";
			mv.setRedirect(true);
		}catch (SQLException e) {
			request.setAttribute("errorMsg", e.getMessage());
			e.printStackTrace();
		}
		mv.setPath(url);
		return mv;
	}

}
