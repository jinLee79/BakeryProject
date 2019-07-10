package kosta.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dto.ProductDTO;

public interface ProductDAO {

	/**
	 * ��ǰ ��ü�˻�(������������ ����) 
	 * List<ProductDTO> selectAllProduct()
	 * select * from product order by productcode
	 * */
	List<ProductDTO> selectAllProduct() throws SQLException;
	
	/**
	 * ��ǰ�ڵ�� ��ǰ �˻�
	 * ProductDTO srchByProductCode(String productCode)
	 * select * from product where productcode=?
	 * */
	ProductDTO srchByProductCode(String productCode) throws SQLException;
	
	
	/**
	 * ��ǰ�̸� Ű����� ��ǰ �˻�(ȸ��, ��ȸ��, ������ ��� ����)
	 * List<ProductDTO> searchByKeyword(String keyWord)
	 * select * from product where productname like ?
	 * */
	List<ProductDTO> srchByKeyword(String keyWord) throws SQLException;
	
	/**
	 * ��ǰ ���� (�̸�/�������ݼ�/�������ݼ�/��ȸ��)
	 * List<ProductDTO> sort(String keyField)
	 * select * from product order by ?
	 * */
	List<ProductDTO> sort(String keyField) throws SQLException;

	
	/////**���� �����ڱ��**/////////////////////////////////////
	/**
	 * ��ǰ ���
	 * int insert(ProductDTO productDTO)
	 * insert into product values(?, ?, ?, ?, 0, ?)
	 * */
	int insert(ProductDTO productDTO) throws SQLException;
	/**
	 * �𵨹�ȣ�� �ش��ϴ� ��ǰ ����
	 * int updateProduct(ProductDTO productDTO)
	 * update product set productname=?, sellprice=?, description=?. fname=? where productcode=?
	 * */
	int updateProduct(ProductDTO productDTO) throws SQLException;
	/**
	 * ��ǰ ����
	 * int deleteProduct(String productCode)
	 * delete from product where productcode=?
	 * */
	int deleteProduct(String productCode) throws SQLException;
}
