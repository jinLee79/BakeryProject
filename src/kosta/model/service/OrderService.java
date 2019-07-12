package kosta.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dao.OrderDAO;
import kosta.model.dao.OrderDAOImpl;
import kosta.model.dto.OrderDTO;

public class OrderService {
	public static OrderDAO orderDAO = new OrderDAOImpl();

	/**
	 * 장바구니에서 상품 선택해서 주문하기
	 * */
	public static int insertOrder(OrderDTO orderDTO) throws SQLException{
		int result = orderDAO.insertOrder(orderDTO);
		if(result!=1) throw new SQLException("주문이 정상적으로 완료되지 않았습니다. 관리자에게 문의하세요.");
		return result;
	}
	
	/**
	 * 내 주문목록 확인하기
	 * */
	 public static OrderDTO viewMyOrder(String userId) throws SQLException {
		 OrderDTO orderDTO = orderDAO.viewMyOrder(userId);
		 if(orderDTO==null) throw new SQLException("주문목록을 찾을 수 없습니다. 관리자에게 문의하세요.");
		 return orderDTO;
	 }
	
/////**이하 관리자기능**/////////////////////////////////////
		/**
		 * 회원 전체 목록 검색
		 *  List<OrderDTO> selectAllOrder()
		 * */
			public static List<OrderDTO> selectAllOrder()throws SQLException {
				List<OrderDTO> list= orderDAO.selectAllOrder();
				return list;
			}
}
