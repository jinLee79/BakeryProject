package kosta.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/front")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Map<String, Controller> map;
	
	@Override
	public void init() throws ServletException {
		ServletContext application = super.getServletContext();
		map = (Map<String, Controller>)application.getAttribute("map");
		
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) 
																											throws ServletException, IOException {
		String key = request.getParameter("key");
		
		if(key==null) key="list";  //list는 전체검색. key값이 없으면 default로 list.jsp로 이동
		
		//검색, 수정, 등록
		Controller controller = map.get(key);
		
		ModelAndView mv = controller.handleRequest(request, response); 
		if(mv.isRedirect()) {  //reDirect로 이동
			response.sendRedirect(mv.getPath());
		}else { //forward로 이동
			request.getRequestDispatcher(mv.getPath()).forward(request, response);
		}
	}

}
