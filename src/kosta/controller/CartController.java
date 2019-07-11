package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.model.dto.CartDTO;
import kosta.model.dto.OrderDetailsDTO;
import kosta.model.dto.ProductDTO;
import kosta.model.dto.UserDTO;
import kosta.model.service.ProductService;
import kosta.model.service.UserService;



public class CartController implements Controller {
	private HashMap<String,CartDTO> Cart = new HashMap<String,CartDTO>();
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		ModelAndView mv = new ModelAndView();
		
		String productCode = request.getParameter("productCode");
		int quantity=1;
		
		
	 // 	int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		// cartMap��� �̸����� ���� ����
		//CartDTO cdto = new CartDTO(productCode, productName, sellPrice, quantity);
		
		String url = "errorView/error.jsp";
	  	HttpSession session = request.getSession();
		try {	
			ProductDTO pdto=ProductService.srchByProductCode(productCode);
			String productName=pdto.getProductName();
			int sellPrice=pdto.getSellPrice();

			CartDTO cdto = new CartDTO(productCode, productName, sellPrice, quantity);

			session.setAttribute("sessioncart", cdto);	
			
			HashMap<String, CartDTO> Cart = this.getCartList();
			Cart.put("cartList", cdto);
		
	   //    String sessionId=(String) session.getAttribute("sessionId");
	       if(session.getAttribute("sessioncart")!=null) {	//īƮ�� ��ǰ�� ���ٸ� īƮ���� �ѷ��ְ�
	    	   url = "cart.jsp";
	       }else url = "pductDetail.jsp"; 	//�ȴ��� �״�� �󼼺��� ��������..?or �ƹ����� �ѱ��
	       
	       
	       
		}
		catch (SQLException e) { //SQLException�� �� ���� �ִ� ���....error.jsp�� ���� �����.
			request.setAttribute("errorMsg", e.getMessage()); //error.jsp���� ${requestScope.errorMsg} ���� ������..
		}
		
		mv.setPath(url); //�̵��� �� forward������� ���� ��.

		return mv;
	  	
	  //	Map<String, cdto> cartMap = new (HashMap<String, cdto>)session.getAttribute("cartMap");

	}
		//īƮ�� �߰�
		public void addCart(CartDTO cdto){
			
			//key�� : product_no, value�� : OrderBean
			String productCode = cdto.getProductCode();
			int quantity = cdto.getQuantity();
			
			//�ֹ������� 0���� ũ��
			if(quantity >0){ 
				
				//īƮ�� ���ϻ�ǰ�� ������
				if(Cart.containsKey(productCode)){
					
					//īƮ�� ���� ��ǰ��ȣ�� OrderDetailsDTO�� ������
					CartDTO originDto = (CartDTO)Cart.get(productCode);
					
					//���� ���� + ���� ��ǰ�� ����
					quantity += originDto.getQuantity();
					
					//������ǰ ���� = ���簹�� + ������ǰ ����
					originDto.setQuantity(quantity);
					
					//īƮ�� �߰�
					Cart.put(productCode, originDto);
					

				//īƮ�� ���ϻ�ǰ�� ������
				} else {
					Cart.put(productCode, cdto);
				}
			}
		}
		
		//īƮ ��� ���
		public HashMap<String,CartDTO> getCartList() {
			return Cart;
		}
		
		//īƮ ���� ����
		public void updateCart(CartDTO cdto) {
			String productCode = cdto.getProductCode();
			Cart.put(productCode, cdto);
		}
		
		//īƮ ���� ����
		public void deleteCart(CartDTO cdto) {
			String productCode = cdto.getProductCode();
			Cart.remove(productCode);
		}
	}
