package kosta.model.service;

public interface ProductService {

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

}
