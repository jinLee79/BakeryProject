package kosta.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dto.OrderDTO;

public interface OrderDAO {
	
	/**
	 * ��ٱ��Ͽ��� ��ǰ �����ؼ� �ֹ��ϱ�
	 * int insertOrder(OrderDTO orderDTO)
	 * insert into orders values()
	 * */
	int insertOrder(OrderDTO orderDTO) throws SQLException;
	
	/**
	 * ���� ȸ���� �ڽ��� �ֹ���� ����
	 * OrderDTO viewMyOrder(String userId)
	 * select * from orders where userid=?
	 * */
	OrderDTO viewMyOrder(String userId) throws SQLException;
	
	
	/////**���� �����ڱ��**/////////////////////////////////////

	/**
	 * �����ڰ� ���θ� ��ü �ֹ���� ����
	 * List<OrderDTO> selectAllOrder()
	 * select * from orders order by orderno
	 * */
	List<OrderDTO> selectAllOrder() throws SQLException;
	/**
	 * �ֹ� ���°� ����
	 * int updateOrderState(OrderDTO orderDTO)
	 * update orders set orderstate=? where orderno=?
	 * */
	int updateOrderState(OrderDTO orderDTO) throws SQLException;
	
}
