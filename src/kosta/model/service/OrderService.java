package kosta.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dao.OrderDAO;
import kosta.model.dao.OrderDAOImpl;
import kosta.model.dto.OrderDTO;

public class OrderService {
	public static OrderDAO orderDAO = new OrderDAOImpl();

	/**
	 * ��ٱ��Ͽ��� ��ǰ �����ؼ� �ֹ��ϱ�
	 * */
	public static int insertOrder(OrderDTO orderDTO) throws SQLException{
		int result = orderDAO.insertOrder(orderDTO);
		if(result!=1) throw new SQLException("�ֹ��� ���������� �Ϸ���� �ʾҽ��ϴ�. �����ڿ��� �����ϼ���.");
		return result;
	}
	
	/**
	 * �� �ֹ���� Ȯ���ϱ�
	 * */
	 public static viewMyOrder() throws SQLException {
		 orderDAO.viewMyOrder(userId);
	 }
	
/////**���� �����ڱ��**/////////////////////////////////////
		/**
		 * ȸ�� ��ü ��� �˻�
		 *  List<OrderDTO> selectAllOrder()
		 * */
			public static List<OrderDTO> selectAllOrder()throws SQLException {
				List<OrderDTO> list= orderDAO.selectAllOrder();
				return list;
			}
}
