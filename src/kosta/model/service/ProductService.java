package kosta.model.service;

public interface ProductService {

	/**
	 * 상품리스트 전체 보기
	 * selectAllProduct
	 * */
	/**
	 * 키워드로 상품 검색(회원, 비회원, 관리자 모두 가능.. 가격순-> 요청 시 서버에서 정렬순서 바꾸기)
	 * searchByKeyword(String keyword, 
	 * */
	
	/**
	 * 상세보기 클릭 시 조회수 증가
	 * incrementByReadnum
	 * */
	
	/**
	 * 상품 등록(관리자ID만 가능)
	 * insert(String userId, ProductDTO productDTO)
	 * */
	
	/**
	 * 모델번호에 해당하는 상품 수정(관리자ID만 가능)
	 * update(ProductDTO productDTO)
	 * */
	
	/**
	 * 상품 삭제(관리자ID만 가능)
	 * delete
	 * */
}
}
