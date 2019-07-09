package kosta.model.dao;

public interface OrderDAO {

	/**dao, actionmapping.properties이거 이름바꿔야되고
	
	
	
	/**
	 * 장바구니에서 상품 선택해서 주문하기
	 * int insertOrder(OrderDTO orderDTO)
	 * insert into orders values()
	 * if
	 * insert into order_detail values()
	 * */
	
	/**
	 * 개별 회원이 자신의 주문목록 보기
	 * OrderDTO viewMyOrder(String userId)
	 * select * from orders where userid=?
	 * */
	
	/**
	 * 주문목록에서 주문 취소
	 * int cancelMyOrder(String userId)
	 * delete from orders where userid=?
	 * */
	


	주문이 들어오면 orders에 데이터 들어가고, 자동으로 연관된 데이터가 order_detail로 삽입되야돼
	
	
	
	/////**이하 관리자기능**/////////////////////////////////////

	/**
	 * 관리자가 쇼핑몰 전체 주문목록 보기
	 * List<OrderDTO> selectAllOrder()
	 * select * from orders order by orderno
	 * */
	
	/**
	 * 주문 상태값 변경
	 * int updateOrderState(OrderDTO orderDTO)
	 * update orders set orderstate=? where 
	 * */

	
}
