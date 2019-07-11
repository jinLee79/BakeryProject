package kosta.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.model.dto.CartDTO;
import kosta.model.dto.ProductDTO;
import kosta.model.service.ProductService;

public class CartController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		ModelAndView mv = new ModelAndView();
		
		String productCode = request.getParameter("productCode");
	  	int quantity = Integer.parseInt(request.getParameter("quantity"));
	  	
	  	// cartMap��� �̸����� ���� ����
	  	HttpSession session = request.getSession();
	  	Map<String, CartDTO> cartMap = (HashMap<String, CartDTO>)session.getAttribute("cartMap");

	    // cartMap �Ӽ����� ���� ��� null���� ����
	  	if(cartMap == null) {
	      // ArrayList ��ü�� �����Ͽ� setAttribute�� �ش� �Ӽ��� list���� ����
	  		cartMap = new HashMap<String, CartDTO>;
	  		session.setAttribute("cartMap", cartMap);
	  	}
	  	CartDTO cart = new CartDTO();
	  	try {
	  		ProductDTO productDTO = ProductService.srchByProductCode(productCode);
		  	cart.setProductCode(productCode);
		  	cart.setProductName(productDTO.getProductName());
		  	cart.setSellPrice(productDTO.getSellPrice());
		  	cart.setQuantity(quantity);
		  	cartMap.put(, cart);
	  	} catch(SQLException e) {
	  		e.printStackTrace();
	  		mv.setPath("error.jsp");
	  	}
	  	if(cartDTO.getQuantity() >0){ 
			//īƮ�� ���ϻ�ǰ�� ������
			if(cartMap.containsKey(cartDTO.getProductCode()){
				//īƮ�� ���� ��ǰ��ȣ�� orderbean�� ������
				ProductDTO tempBean = (ProductDTO)cartMap.get(cartDTO.getProductCode());
				
				//���� ���� + ���� ��ǰ�� ����
				quantity += Integer.parseInt(tempBean.getQuantity());

				//������ǰ ���� = ���簹�� + ������ǰ ����
				tempBean.setQuantity(Integer.toString(quantity));

				//īƮ�� �߰�
				cart.put(product_no, tempBean);

			//īƮ�� ���ϻ�ǰ�� ������
			} else {
				cart.put(product_no, obean);

	  <script>
	  alert("<%=productname %> ��(��) <%=quantity %>�� �߰� �Ǿ����ϴ�");
	  history.go(-1);
	  </script>
		


			ModelAndView mv = new  ModelAndView();
			
			ProductDTO productDTO = ProductService.srchByProductCode(productCode);
			CartDTO cartDTO = new CartDTO(productCode, productDTO.getProductName(), productDTO.getSellPrice(), quantity);
			boolean result = CartService.addCart(request, response);
			if(result) {
				out.println("<script>confirm('��ٱ��Ͽ� ��ǰ�� �߰��Ǿ����ϴ�! ��ٱ��Ϸ� �̵��Ͻðڽ��ϱ�?')</script>");
				if(confirm) mv.setPath("cart.jsp");
			}else {
				out.println("<script>alert('�����߻�. �ٽ� ����ּ���.')</script>");
				mv.setPath("error.jsp");
			}

			return mv;
		}
}

private static 
		
	/**
	 * īƮ�� �߰�
	 * return: true�� ��ٱ��Ͽ� �߰� ����, false�� �߰� ����
	 * */
	public static boolean addCart(HttpServletRequest request, HttpServletResponse response){
		
			}
	}

	

	//īƮ ��� ���
	public Hashtable<String,ProductDTO> getCartList() {
		return cart;
	}

	//īƮ ���� ����
	public void updateCart(ProductDTO obean) {
		String product_no = obean.getProduct_no();
		cart.put(product_no, obean);
	}


	//īƮ ���� ����
	public void deleteCart(ProductDTO obean) {
		String product_no = obean.getProduct_no();
		cart.remove(product_no);
	}


}


if(productCode==""){
	PrintWriter out = response.getWriter();
	out.println("<script>alert('��ٱ��� ������ϴ�'</script>");
}
if(productCode!=null){
	session.setAttribute("productCode", productCode);
	session.setAttribute("quantity", quantity);
}

			ArrayList<ProductDTO> cart = (ArrayList<ProductDTO>)session.getAttribute(list);
			
			//����Ʈ�� ������� ����Ʈ�� ����
			if(cart == null) cart = new ArrayList<ProductDTO>();
					
			//�߰��� ��ǰ ��ü�� ����Ʈ�� ����
			cart.add(productDTO);
			
			//���ǿ� ����Ʈ�� �߰�
			session.setAttribute("list", cart);
			
			//������ ��� -> ��ٱ����������ΰ���                           
			



