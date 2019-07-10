package kosta.model.service;

import java.sql.SQLException;

import kosta.model.dao.UserDAO;
import kosta.model.dao.UserDAOImpl;
import kosta.model.dto.UserDTO;

public class UserService {
	//private static UserDTO UserDTO = null;
	private static UserDAO userDAO  = new UserDAOImpl();
	

	/**
	 * ���(ȸ������ ������)
	 * static int signUp(UserDTO userDTO)
	 * */
	
	/**
	 * ȸ�����Խ� ���̵� �ߺ� üũ
	 * int confirmId(String userId)
	 * */
	 public static int confirmId(String userId) throws SQLException {
		 return userDAO.confirmId(userId);
	 }
	
	/**
	 * �α��� ���: 
	 * UserDTO  loginCheck(String userId, String userPwd)
	 * */

		public static UserDTO loginCheck(String userId, String userPwd) throws SQLException {
			UserDTO userDto =userDAO.loginCheck(userId, userPwd);
			if(userDto ==null) throw new SQLException("������ Ȯ�����ּ���.");
			return userDto ;
		}
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
