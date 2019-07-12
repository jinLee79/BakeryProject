package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.model.dto.UserDTO;
import kosta.model.service.UserService;

public class SignUpController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String userName = request.getParameter("userName");
		int age = Integer.parseInt(request.getParameter("age"));
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String phone = phone1+"-"+phone2+"-"+phone3;
		
		UserDTO userDTO = new UserDTO(userId, userPwd, userName, age, phone);
		ModelAndView mv = new ModelAndView();
		String url="error.jsp";
		try {
			 UserService.signUp(userDTO);
			HttpSession session =  request.getSession();
			session.setAttribute("sessionId", userId);
			session.setAttribute("sessionName", userName);
			 url = "signUpResult.jsp";
		} catch(SQLException e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
		}
		mv.setPath(url);
		return mv;
	}

}
