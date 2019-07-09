package kosta.model.dao;

public interface OrderDetailDAO {
	
	/**
	 * ��ٱ��Ͽ��� ��ǰ �����ؼ� �ֹ��ϱ�
	 * int insertOrder(OrderDTO orderDTO)
	 * insert into order_detail values()
	 * */
	
	/**
	 * ���� ȸ���� �ڽ��� �ֹ���� ����
	 * OrderDTO viewMyOrder(String userId)
	 * select * from order_detail where userid=?
	 * */
	
	/**
	 * �ֹ���Ͽ��� �ֹ� ���
	 * int cancelMyOrder(String userId)
	 * delete from order_detail where userid=?
	 * */
	
	/////**���� �����ڱ��**/////////////////////////////////////
	/**
	 * �����ڰ� ���θ� ��ü �ֹ���� ����
	 * List<OrderDTO> selectAllOrder()
	 * select * from order_detail order by orderno
	 * */
}
