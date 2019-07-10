package kosta.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.model.dto.ProductDTO;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/Cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
																													throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String productCode = request.getParameter("productCode");
		String productName = request.getParameter("productName");
		int sellPrice = Integer.parseInt(request.getParameter("sellPrice"));
		String description = request.getParameter("description");
		String fName = request.getParameter("fName");

		
		//세션에서 상품 리스트를 받아옴
		HttpSession session = request.getSession(true);
		ArrayList<ProductDTO> cart = (ArrayList<ProductDTO>)session.getAttribute("list");
		
		//리스트가 없을경우 리스트를 생성
		if(cart == null) cart = new ArrayList<ProductDTO>();
		
		//추가된 상품 객체를 리스트에 담음
		cart.add(new ProductDTO(productCode,productName, sellPrice, description, fName));
		
		//세션에 리스트를 추가
		session.setAttribute("list", cart);
		
		//페이지 출력                           
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println(productName + " 구입하셨습니다");
		out.println("<p/><table width='80%'>");
		out.println("<br/>[<a href='index.jsp'>계속 쇼핑</a>]");
		out.println("[<a href='Buy'>결제하기</a>]<br/>");
		out.println("<tr><th>상품코드</th><th>상품명</th><th>가격</th><th>설명</th><th>이미지</th></tr>");
		
		//세션에 담긴 상품리스트를 반복문을 이용해 출력
		for (int i = 0; i < cart.size(); i++) {
			ProductDTO productDTO = (ProductDTO)cart.get(i);
			out.println("<tr><td>" + productDTO.getProductCode() + "</td>");
			out.println("<td>" + productDTO.getProductName() + "</td>");
			out.println("<td>" + productDTO.getSellPrice() + "</td>");
			out.println("<td>" + productDTO.getDescription()+ "</td>");
			out.println("<td>" + productDTO.getfName() + "</td></tr>");
		}
		out.println("</table>");
		out.println("</body></html>");
		out.close();
	}
}