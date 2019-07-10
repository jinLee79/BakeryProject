package kosta.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IdCheckServlet
 */
@WebServlet("/IdCheck")
public class IdCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("중복아이디입니다.");
		/*response.setContentType("text/html;charset=UTF-8");
		String userId = request.getParameter("userId");
		try {
		int result = UserService.confirmId(userId);
		PrintWriter out = response.getWriter();
		if(result==1) {
			out.println("중복아이디입니다.");
		} else {
			out.println("사용가능합니다.");
		}
		} catch (SQLException e ) {
			e.printStackTrace();
		}*/
	}
}
