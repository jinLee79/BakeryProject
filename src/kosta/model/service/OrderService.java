package kosta.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dao.OrderDAO;
import kosta.model.dao.OrderDAOImpl;
import kosta.model.dto.OrderDTO;

public interface OrderService {
	public static OrderDAO orderDAO = new OrderDAOImpl();

	/**
	 * 장바구니에서 상품 선택해서 주문하기
	 * */
	
	//수정수정
	
	
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
