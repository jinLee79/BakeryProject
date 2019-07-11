package kosta.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dao.ProductDAO;
import kosta.model.dao.ProductDAOImpl;
import kosta.model.dto.ProductDTO;

public class ProductService {
	
	static ProductDAO productDAO = new ProductDAOImpl();

	/**
	 * 상품 전체검색(메인페이지에 띄우기) 
	 * List<ProductDTO> selectAllProduct()
	 * select * from product order by productcode
	 * */
	public static List<ProductDTO> selectAllProduct() throws SQLException
	{
		List<ProductDTO> list = productDAO.selectAllProduct();
		return list;
	}
	
	/**
	 * 상품코드로 상품 검색
	 * */
	public static ProductDTO srchByProductCode(String productCode) throws 

SQLException{
		ProductDTO productDTO = productDAO.srchByProductCode(productCode);
		if(productDTO==null) {
			throw new SQLException(productCode+"번에 해당하는 제품이 없

습니다.");
		}
		return productDTO;
	}
	
	/**
	 * 상품이름 키워드로 상품 검색(회원, 비회원, 관리자 모두 가능)
	 * ProductDTO srchByKeyword(String keyWord)
	 * select * from product where productname like ?
	 * */
	
	/**
	 * 상품 정렬 (이름/높은가격순/낮은가격순/조회수)
	 * List<ProductDTO> sort(String keyField)
	 * select * from product order by ?
	 * */
	

}
