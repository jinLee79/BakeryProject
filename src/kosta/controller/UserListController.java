package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.dto.UserDTO;
import kosta.model.service.UserService;

public class UserListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "error.jsp";
		try { //예외처리를 controller에서 처리함
			//서비스 -> dao -> 그 결과를 list를 저장하고 list.jsp로 이동
			List<UserDTO> list = UserService.searchAllUsers();
			request.setAttribute("list", list);
			url="AdminUserManage.jsp";
		} catch(SQLException e) {
			request.setAttribute("errorMsg", e.getMessage());
		}
		ModelAndView mv = new ModelAndView(); //이동방식을 결정하는 ModelAndView
		mv.setPath(url);
		return mv;
	}

}
