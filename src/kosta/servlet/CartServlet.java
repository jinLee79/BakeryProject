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

		
		//���ǿ��� ��ǰ ����Ʈ�� �޾ƿ�
		HttpSession session = request.getSession(true);
		ArrayList<ProductDTO> cart = (ArrayList<ProductDTO>)session.getAttribute("list");
		
		//����Ʈ�� ������� ����Ʈ�� ����
		if(cart == null) cart = new ArrayList<ProductDTO>();
		
		//�߰��� ��ǰ ��ü�� ����Ʈ�� ����
		cart.add(new ProductDTO(productCode,productName, sellPrice, description, fName));
		
		//���ǿ� ����Ʈ�� �߰�
		session.setAttribute("list", cart);
		
		//������ ���                           
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println(productName + " �����ϼ̽��ϴ�");
		out.println("<p/><table width='80%'>");
		out.println("<br/>[<a href='index.jsp'>��� ����</a>]");
		out.println("[<a href='Buy'>�����ϱ�</a>]<br/>");
		out.println("<tr><th>��ǰ�ڵ�</th><th>��ǰ��</th><th>����</th><th>����</th><th>�̹���</th></tr>");
		
		//���ǿ� ��� ��ǰ����Ʈ�� �ݺ����� �̿��� ���
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