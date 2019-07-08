package kosta.model.dao;

public interface ProductDAO {

	/**
	 * ��ǰ ��ü�˻�
	 * List<ProductDTO> selectAllProduct()
	 * */
	
	/**
	 * Ű����� ��ǰ �˻�(ȸ��, ��ȸ��, ������ ��� ����)
	 * ProductDTO searchByKeyword(String keyWord)
	 * */
	
	/**
	 * ��ǰ ���� (�̸�/�������ݼ�/�������ݼ�/��ȸ��)
	 * List<ProductDTO> sort(String keyField)
	 * select * from product order by ?
	 * */
	
	/**
	 * ��ȸ�� ����
	 * ProductDTO incrementByReadnum(String productCode, boolean flag)
	 * */
	
	/**
	 * ��ǰ ���(������ID�� ����)
	 * int insert(ProductDTO productDTO)
	 * */
	
	/**
	 * �𵨹�ȣ�� �ش��ϴ� ��ǰ ����(������ID�� ����)
	 * int updateProduct(ProductDTO productDTO)
	 * */
	
	/**
	 * ��ǰ ����(������ID�� ����)
	 * int deleteProduct(String productCode)
	 * */
}
