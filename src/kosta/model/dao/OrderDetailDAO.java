package kosta.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dto.OrderDTO;

public interface OrderDetailDAO {
	
	/**
	 * 장바구니에서 상품 선택해서 주문하기
	 * int insertOrder(OrderDTO orderDTO)
	 * insert into order_detail values()
	 * */
	int insertOrder(OrderDTO orderDTO) throws SQLException;
	

	/**
	 * 개별 회원이 자신의 주문목록 보기
	 * OrderDTO viewMyOrder(String userId)
	 * select * from order_detail where userid=?
	 * */
	OrderDTO viewMyOrder(String userId) throws SQLException;

	
}
