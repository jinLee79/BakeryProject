package kosta.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dto.OrderDTO;

public interface OrderDetailDAO {
	
	/**
	 * ��ٱ��Ͽ��� ��ǰ �����ؼ� �ֹ��ϱ�
	 * int insertOrder(OrderDTO orderDTO)
	 * insert into order_detail values()
	 * */
	int insertOrder(OrderDTO orderDTO) throws SQLException;
	
	/**
	 * ���� ȸ���� �ڽ��� �ֹ���� ����
	 * OrderDTO viewMyOrder(String userId)
	 * select * from order_detail where userid=?
	 * */
	OrderDTO viewMyOrder(String userId) throws SQLException;
	/**
	 * �ֹ���Ͽ��� �ֹ� ���
	 * int cancelMyOrder(String userId)
	 * delete from order_detail where userid=?
	 * */
	int cancelMyOrder(String userId) throws SQLException;
	
	/////**���� �����ڱ��**/////////////////////////////////////
	/**
	 * �����ڰ� ���θ� ��ü �ֹ���� ����
	 * List<OrderDTO> selectAllOrder()
	 * select * from order_detail order by orderno
	 * */
	List<OrderDTO> selectAllOrder() throws SQLException;
}
