package kosta.model.dao;

public interface ProductDAO {

	/**
	 * 상품 전체검색
	 * List<ProductDTO> selectAllProduct()
	 * */
	
	/**
	 * 키워드로 상품 검색(회원, 비회원, 관리자 모두 가능)
	 * ProductDTO searchByKeyword(String keyWord)
	 * */
	
	/**
	 * 상품 정렬 (이름/높은가격순/낮은가격순/조회수)
	 * List<ProductDTO> sort(String keyField)
	 * select * from product order by ?
	 * */
	
	/**
	 * 조회수 증가
	 * ProductDTO incrementByReadnum(String productCode, boolean flag)
	 * */
	
	/**
	 * 상품 등록(관리자ID만 가능)
	 * int insert(ProductDTO productDTO)
	 * */
	
	/**
	 * 모델번호에 해당하는 상품 수정(관리자ID만 가능)
	 * int updateProduct(ProductDTO productDTO)
	 * */
	
	/**
	 * 상품 삭제(관리자ID만 가능)
	 * int deleteProduct(String productCode)
	 * */
}
