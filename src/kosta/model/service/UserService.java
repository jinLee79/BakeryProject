package kosta.model.service;

public interface UserService {

	/**
	 * ���(ȸ������ ������)
	 * int signUp(UserDTO userDTO)
	 * */
	
	/**
	 * ȸ�����Խ� ���̵� �ߺ� üũ
	 * int confirmId(String userId)
	 * */
	
	/**
	 * �α��� ���: 
	 * boolean loginCheck(String userId, String userPwd)
	 * */
	
	/**
	 * ȸ���� ȸ������ ����
	 * UserDTO viewMyInfo(String userId)
	 * */
	
	/**
	 * userId, userpwd Ȯ�� �� ȸ������(��й�ȣ, �̸�, ����, ��ȭ��ȣ) ����
	 * int updateMyInfo(UserDTO userDTO)
	 * */
	
	/**
	 * ȸ�� Ż��
	 * int deleteMyInfo(String userId)
	 * */

	/////**���� �����ڱ��**/////////////////////////////////////
	/**
	 * ȸ�� ��ü ��� �˻�
	 *  List<UserDTO> searchAllUsers()
	 * */
	
	/**
	 * �ֹ��ݾ׿� ���� ȸ�� ��� �±�(ȸ������ ����)
	 * int updateGrade(String userId, int orderTotal)
	 * */
	
}
