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
			UserService.updateMyInfo(udto); //ElectronicsService.update 호출하기
			//업데이트 성공하면? 키값command=read, 상세보기modelNum 하려면 모델번호 있어야 된다.
			url = "udto?key=updateUser&userId=" + userId;
					//수정 된 화면이 보일 수 있도록, 상세페이지로 변경된 데이터가 들어오면서, 조회수 증가는 되면 안 된다. key값은 read 
			mv.setRedirect(true);
			
		}
		catch (SQLException e) {
			request.setAttribute("errorMsg", e.getMessage());
			//e.printStackTrace(); //어디서 에러가 났는지 알 수 있다.
		}
		mv.setPath(url);
		return mv;
	}

}
