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
		

		
		//�̵��� url �⺻ �ϳ� ����
		String url = "errorView/error.jsp"; //����� ���� ���� root�� �����ϱ� ������ ��������� �ȴ�.
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
		catch (SQLException e) { //SQLException�� �� ���� �ִ� ���....error.jsp�� ���� �����.
			request.setAttribute("errorMsg", e.getMessage()); //error.jsp���� ${requestScope.errorMsg} ���� ������..
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setPath(url); //�̵��� �� forward������� ���� ��.

		return mv;
	}

}
