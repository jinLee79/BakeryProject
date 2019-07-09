package kosta.model.service;

public interface AdminService {
	
	/**
	 * 회원 전체 목록 검색
	 *  List<UserDTO> searchAllUsers()
	 *  select * from users order by userid
	 * */
	
	/**????
	 * 주문금액에 따른 회원 등급 승급(회원정보 수정)
	 * int updateGrade(String userId, int orderTotal)
	 * update users set grade=? where
	 * 
	 * */
	
	
	/**
	 * 상품 등록
	 * int insert(ProductDTO productDTO)
	 * insert into product values(?, ?, ?, ?, 0, ?)
	 * */
	
	/**
	 * 모델번호에 해당하는 상품 수정
	 * int updateProduct(ProductDTO productDTO)
	 * update product set productname=?, sellprice=?, description=?. fname=? where productcode=?
	 * */
	
	/**
	 * 상품 삭제
	 * int deleteProduct(String productCode)
	 * delete from product where productcode=?
	 * */

	/**
	 * 관리자가 쇼핑몰 전체 주문목록 보기
	 * List<OrderDTO> selectAllOrder()
	 * */
	
	/**
	 * 주문 상태 변경
	 * int updateOrderState(OrderDTO orderDTO)
	 * */
	
	
}
