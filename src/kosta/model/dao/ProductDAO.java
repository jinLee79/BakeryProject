package kosta.model.dao;

public interface ProductDAO {

	/**
	 * 상품 전체검색(메인페이지에 띄우기) 
	 * List<ProductDTO> selectAllProduct()
	 * select * from product order by productcode
	 * */
	
	/**
	 * 상품이름 키워드로 상품 검색(회원, 비회원, 관리자 모두 가능)
	 * ProductDTO searchByKeyword(String keyWord)
	 * select * from product where productname like ?
	 * */
	
	/**
	 * 상품 정렬 (이름/높은가격순/낮은가격순/조회수)
	 * List<ProductDTO> sort(String keyField)
	 * select * from product order by ?
	 * */
	
	/**
	 * 조회수 증가
	 * ProductDTO incrementByReadnum(String productCode, boolean flag)
	 * update product set readnum = readnum + 1 where productcode=?
	 * */
	
	
	/////**이하 관리자기능**/////////////////////////////////////
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
}
