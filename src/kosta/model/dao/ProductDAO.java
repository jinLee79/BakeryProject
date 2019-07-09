package kosta.model.dao;

public interface ProductDAO {

	/**
	 * ��ǰ ��ü�˻�(������������ ����) 
	 * List<ProductDTO> selectAllProduct()
	 * select * from product order by productcode
	 * */
	
	/**
	 * ��ǰ�̸� Ű����� ��ǰ �˻�(ȸ��, ��ȸ��, ������ ��� ����)
	 * ProductDTO searchByKeyword(String keyWord)
	 * select * from product where productname like ?
	 * */
	
	/**
	 * ��ǰ ���� (�̸�/�������ݼ�/�������ݼ�/��ȸ��)
	 * List<ProductDTO> sort(String keyField)
	 * select * from product order by ?
	 * */
	
	/**
	 * ��ȸ�� ����
	 * ProductDTO incrementByReadnum(String productCode, boolean flag)
	 * update product set readnum = readnum + 1 where productcode=?
	 * */
	
	
	/////**���� �����ڱ��**/////////////////////////////////////
	/**
	 * ��ǰ ���
	 * int insert(ProductDTO productDTO)
	 * insert into product values(?, ?, ?, ?, 0, ?)
	 * */
	
	/**
	 * �𵨹�ȣ�� �ش��ϴ� ��ǰ ����
	 * int updateProduct(ProductDTO productDTO)
	 * update product set productname=?, sellprice=?, description=?. fname=? where productcode=?
	 * */
	
	/**
	 * ��ǰ ����
	 * int deleteProduct(String productCode)
	 * delete from product where productcode=?
	 * */
}
