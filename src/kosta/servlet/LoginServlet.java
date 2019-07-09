package kosta.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String dbId = "admin", dbPwd="4567";
		String userId = request.getParameter("userId");
		String userPwd= request.getParameter("userPwd");
		String userName = request.getParameter("userName");
		
		if(dbId.equals(userId)  &&  dbPwd.equals(userPwd)){
			HttpSession session = request.getSession();
			session.setAttribute("sessionId", userId);
			session.setAttribute("sessionName", userName);
			session.setAttribute("time", new Date().toLocaleString());   
		
			response.sendRedirect("index.jsp");
		} else {
			
		}
	}
}

