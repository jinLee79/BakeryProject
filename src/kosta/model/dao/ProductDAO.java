package kosta.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dto.ProductDTO;

public interface ProductDAO {

	/**
	 * 상품 전체검색(메인페이지에 띄우기) 
	 * List<ProductDTO> selectAllProduct()
	 * select * from product order by productcode
	 * */
	List<ProductDTO> selectAllProduct() throws SQLException;
	
	/**
	 * 상품코드로 상품 검색
	 * ProductDTO srchByProductCode(String productCode)
	 * select * from product where productcode=?
	 * */
	ProductDTO srchByProductCode(String productCode) throws SQLException;
	
	
	/**
	 * 상품이름 키워드로 상품 검색(회원, 비회원, 관리자 모두 가능)
	 * List<ProductDTO> searchByKeyword(String keyWord)
	 * select * from product where productname like ?
	 * */
	List<ProductDTO> srchByKeyword(String keyWord) throws SQLException;
	
	/**
	 * 상품 정렬 (이름/높은가격순/낮은가격순/조회수)
	 * List<ProductDTO> sort(String keyField)
	 * select * from product order by ?
	 * */
	List<ProductDTO> sort(String keyField) throws SQLException;

	
	/////**이하 관리자기능**/////////////////////////////////////
	/**
	 * 상품 등록
	 * int insert(ProductDTO productDTO)
	 * insert into product values(?, ?, ?, ?, 0, ?)
	 * */
	int insert(ProductDTO productDTO) throws SQLException;
	/**
	 * 모델번호에 해당하는 상품 수정
	 * int updateProduct(ProductDTO productDTO)
	 * update product set productname=?, sellprice=?, description=?. fname=? where productcode=?
	 * */
	int updateProduct(ProductDTO productDTO) throws SQLException;
	/**
	 * 상품 삭제
	 * int deleteProduct(String productCode)
	 * delete from product where productcode=?
	 * */
	int deleteProduct(String productCode) throws SQLException;
}
