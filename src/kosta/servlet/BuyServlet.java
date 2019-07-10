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



	@WebServlet("/Buy")

	public class BuyServlet extends HttpServlet{

		@Override

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			//������ ������� ���� �����ϸ� �ȵȴ�. �ִ� ���Ǹ� ����Ѵ�
			HttpSession session = request.getSession(false);

			//������ ������� ����
			if(session == null) return;

			//���ǿ� �ִ� ��ǰ��� ��������
			ArrayList<ProductDTO> cart = (ArrayList<ProductDTO>)session.getAttribute("list");

			//����� ���� ��� ����
			if(cart == null) return;
			
			//���
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<p/><table width='80%'>");
			out.println("<tr><th>��ǰ�ڵ�</th><th>��ǰ��</th><th>����</th><th>����</th><th>�̹���</th></tr>");

		
			//��ǰ��� �� ��� �ݾ� ���
			int sum=0;
			for(ProductDTO productDTO : cart){
				out.println("<tr><td>" + productDTO.getProductCode() + "</td>");
				out.println("<td>" + productDTO.getProductName() + "</td>");
				out.println("<td>" + productDTO.getSellPrice() + "</td>");
				out.println("<td>" + productDTO.getDescription()+ "</td>");
				out.println("<td>" + productDTO.getfName() + "</td></tr>");
				sum += productDTO.getSellPrice();
			}

			out.println("<tr><td colspan='2'>���� �Ѿ� : " + sum + "</td></tr>");
			out.println("</table>");
			out.println("<br>���� �����մϴ�.");
			out.println("<br/><a href='index.jsp'>���������� ���� ����~</a>");
			out.println("</body></html>");

			//session.invalidate();	// �ش� ���� ��� ���� ����
			session.removeAttribute("list");	// ��ǰ��� ���� ����
			out.close();
		}

}
