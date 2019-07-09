package kosta.model.service;

public interface ProductService {

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

}
