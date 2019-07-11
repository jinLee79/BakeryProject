package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.model.dto.UserDTO;
import kosta.model.service.UserService;


public class UpdateByUserController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String url = "errorView/error.jsp";
		
		ModelAndView mv = new ModelAndView();
		
		HttpSession session = request.getSession();
		
		
		String userId = (String) session.getAttribute("sessionId");
		String userpwd = request.getParameter("userpwd");
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		String phone = request.getParameter("phone");
		String grade = request.getParameter("grade");
		String point = request.getParameter("point");
		
		
		
		UserDTO udto = new UserDTO(userId, userpwd, username, Integer.parseInt(age), phone, grade, Integer.parseInt(point));
		
		try {
			UserService.updateMyInfo(udto); //ElectronicsService.update ȣ���ϱ�
			//������Ʈ �����ϸ�? Ű��command=read, �󼼺���modelNum �Ϸ��� �𵨹�ȣ �־�� �ȴ�.
			url = "udto?key=updateUser&userId=" + userId;
					//���� �� ȭ���� ���� �� �ֵ���, ���������� ����� �����Ͱ� �����鼭, ��ȸ�� ������ �Ǹ� �� �ȴ�. key���� read 
			mv.setRedirect(true);
			
		}
		catch (SQLException e) {
			request.setAttribute("errorMsg", e.getMessage());
			//e.printStackTrace(); //��� ������ ������ �� �� �ִ�.
		}
		mv.setPath(url);
		return mv;
	}

}
