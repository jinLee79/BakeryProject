package kosta.model.dao;

public interface OrderDAO {

	/**dao, actionmapping.properties�̰� �̸��ٲ�ߵǰ�
	
	
	
	/**
	 * ��ٱ��Ͽ��� ��ǰ �����ؼ� �ֹ��ϱ�
	 * int insertOrder(OrderDTO orderDTO)
	 * insert into orders values()
	 * if
	 * insert into order_detail values()
	 * */
	
	/**
	 * ���� ȸ���� �ڽ��� �ֹ���� ����
	 * OrderDTO viewMyOrder(String userId)
	 * select * from orders where userid=?
	 * */
	
	/**
	 * �ֹ���Ͽ��� �ֹ� ���
	 * int cancelMyOrder(String userId)
	 * delete from orders where userid=?
	 * */
	


	�ֹ��� ������ orders�� ������ ����, �ڵ����� ������ �����Ͱ� order_detail�� ���ԵǾߵ�
	
	
	
	/////**���� �����ڱ��**/////////////////////////////////////

	/**
	 * �����ڰ� ���θ� ��ü �ֹ���� ����
	 * List<OrderDTO> selectAllOrder()
	 * select * from orders order by orderno
	 * */
	
	/**
	 * �ֹ� ���°� ����
	 * int updateOrderState(OrderDTO orderDTO)
	 * update orders set orderstate=? where 
	 * */

	
}
