package kosta.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dto.OrderDTO;

public interface OrderDAO {
	
	/**
	 * 장바구니에서 상품 선택해서 주문하기
	 * int insertOrder(OrderDTO orderDTO)
	 * insert into orders values()
	 * */
	int insertOrder(OrderDTO orderDTO) throws SQLException;
	
	/**
	 * 개별 회원이 자신의 주문목록 보기
	 * OrderDTO viewMyOrder(String userId)
	 * select * from orders where userid=?
	 * */
	OrderDTO viewMyOrder(String userId) throws SQLException;
	
	
	/////**이하 관리자기능**/////////////////////////////////////

	/**
	 * 관리자가 쇼핑몰 전체 주문목록 보기
	 * List<OrderDTO> selectAllOrder()
	 * select * from orders order by orderno
	 * */
	List<OrderDTO> selectAllOrder() throws SQLException;
	/**
	 * 주문 상태값 변경
	 * int updateOrderState(OrderDTO orderDTO)
	 * update orders set orderstate=? where orderno=?
	 * */
	int updateOrderState(OrderDTO orderDTO) throws SQLException;
	
}
