package kosta.model.service;

import java.sql.SQLException;

import kosta.model.dao.UserDAO;
import kosta.model.dao.UserDAOImpl;

public class UserService {
	static UserDAO userDAO = new UserDAOImpl();

	/**
	 * ���(ȸ������ ������)
	 * static int signUp(UserDTO userDTO)
	 * */
	
	/**
	 * ȸ�����Խ� ���̵� �ߺ� üũ
	 * int confirmId(String userId)
	 * */
	 public static int confirmId(String userId) throws SQLException {
		 int result =userDAO.confirmId(userId);
		 return result;
	 }
	
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
