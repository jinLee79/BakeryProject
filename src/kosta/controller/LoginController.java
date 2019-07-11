package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.model.dto.UserDTO;
import kosta.model.service.UserService;



public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		

		
		//이동할 url 기본 하나 세팅
		String url = "errorView/error.jsp"; //여기로 들어올 때는 root로 들어오니까 폴더를 지정해줘야 된다.
		HttpSession session = request.getSession();
		try {	
			UserDTO dto =UserService.loginCheck(id, pwd);
		 session.setAttribute("sessionId", dto.getUserId());	
	       session.setAttribute("sessionName", dto.getUserName());	
	       
	   //    String sessionId=(String) session.getAttribute("sessionId");
	       if(session.getAttribute("sessionId").equals("admin")) {
	    	   url = "AdminIndex.jsp";
	       }else url = "index.jsp"; 
	       
	       
		}
		catch (SQLException e) { //SQLException이 날 수도 있단 얘기....error.jsp로 가게 만든다.
			request.setAttribute("errorMsg", e.getMessage()); //error.jsp에서 ${requestScope.errorMsg} 값을 정해줌..
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setPath(url); //이동할 때 forward방식으로 가야 됨.

		return mv;
	}

}
