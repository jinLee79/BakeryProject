package kosta.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dao.ProductDAO;
import kosta.model.dao.ProductDAOImpl;
import kosta.model.dto.ProductDTO;

public class ProductService {
	
	static ProductDAO productDAO = new ProductDAOImpl();

	/**
	 * ��ǰ ��ü�˻�(������������ ����) 
	 * List<ProductDTO> selectAllProduct()
	 * select * from product order by productcode
	 * */
	public static List<ProductDTO> selectAllProduct() throws SQLException
	{
		List<ProductDTO> list = productDAO.selectAllProduct();
		return list;
	}
	
	/**
	 * ��ǰ�ڵ�� ��ǰ �˻�
	 * */
	public static ProductDTO srchByProductCode(String productCode) throws 

SQLException{
		ProductDTO productDTO = productDAO.srchByProductCode(productCode);
		if(productDTO==null) {
			throw new SQLException(productCode+"���� �ش��ϴ� ��ǰ�� ��

���ϴ�.");
		}
		return productDTO;
	}
	
	/**
	 * ��ǰ�̸� Ű����� ��ǰ �˻�(ȸ��, ��ȸ��, ������ ��� ����)
	 * ProductDTO srchByKeyword(String keyWord)
	 * select * from product where productname like ?
	 * */
	
	/**
	 * ��ǰ ���� (�̸�/�������ݼ�/�������ݼ�/��ȸ��)
	 * List<ProductDTO> sort(String keyField)
	 * select * from product order by ?
	 * */
	

}
