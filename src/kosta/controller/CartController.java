package kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CartController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 

HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ModelAndView mv = new  ModelAndView();
		return mv;
	}
}
	/*HttpSession session = request.getSession(true);
	ArrayList<ProductDTO> cart = (ArrayList<ProductDTO>)session.getAttribute

("list");
	
	//����Ʈ�� ������� ����Ʈ�� ����
	if(cart == null) cart = new ArrayList<ProductDTO>();
	
	//�߰��� ��ǰ ��ü�� ����Ʈ�� ����
	cart.add(new ProductDTO(productCode,productName, sellPrice, description, 

fName));
	
	//���ǿ� ����Ʈ�� �߰�
	session.setAttribute("list", cart);
	
	//������ ��� -> ��ٱ����������ΰ���                           
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();
		return null;
	}*/



