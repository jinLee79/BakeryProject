package kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BuyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	/*	//������ ������� ���� �����ϸ� �ȵȴ�. �ִ� ���Ǹ� ����Ѵ�
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

	
		//��ǰ���� �� ��� �ݾ� ���
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
		out.println("<br>������ �����մϴ�.");
		out.println("<br/><a href='index.jsp'>���������� ���� ����~</a>");
		out.println("</body></html>");

		//session.invalidate();	// �ش� ������ ��� ���� ����
		session.removeAttribute("list");	// ��ǰ��� ���� ����
		out.close();
	}*/

	}