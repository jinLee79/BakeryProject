package kosta.model.service;

public interface AdminService {
	
	/**
	 * ȸ�� ��ü ��� �˻�
	 *  List<UserDTO> searchAllUsers()
	 *  select * from users order by userid
	 * */
	
	/**????
	 * �ֹ��ݾ׿� ���� ȸ�� ��� �±�(ȸ������ ����)
	 * int updateGrade(String userId, int orderTotal)
	 * update users set grade=? where
	 * 
	 * */
	
	
	/**
	 * ��ǰ ���
	 * int insert(ProductDTO productDTO)
	 * insert into product values(?, ?, ?, ?, 0, ?)
	 * */
	
	/**
	 * �𵨹�ȣ�� �ش��ϴ� ��ǰ ����
	 * int updateProduct(ProductDTO productDTO)
	 * update product set productname=?, sellprice=?, description=?. fname=? where productcode=?
	 * */
	
	/**
	 * ��ǰ ����
	 * int deleteProduct(String productCode)
	 * delete from product where productcode=?
	 * */

	/**
	 * �����ڰ� ���θ� ��ü �ֹ���� ����
	 * List<OrderDTO> selectAllOrder()
	 * */
	
	/**
	 * �ֹ� ���� ����
	 * int updateOrderState(OrderDTO orderDTO)
	 * */
	
	
}
