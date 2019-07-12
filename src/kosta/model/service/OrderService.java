package kosta.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dao.OrderDAO;
import kosta.model.dao.OrderDAOImpl;
import kosta.model.dto.OrderDTO;

public interface OrderService {
	public static OrderDAO orderDAO = new OrderDAOImpl();

	/**
	 * ��ٱ��Ͽ��� ��ǰ �����ؼ� �ֹ��ϱ�
	 * */
	
	//��������
	
	
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
