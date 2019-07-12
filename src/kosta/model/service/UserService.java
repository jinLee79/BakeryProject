package kosta.model.service;

import java.sql.SQLException;

import java.util.List;

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
	public static int signUp(UserDTO userDTO) throws SQLException {
		int result = userDAO.signUp(userDTO);
		if(result !=1) throw new SQLException("ȸ�����Կ� ������ ������ϴ�. �ٽ� �õ����ּ���.");
		return result;
	}
	
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
		public static UserDTO viewMyInfo(String userId) throws SQLException{
			UserDTO userDTO = userDAO.viewMyInfo(userId);
			if(userDTO == null) throw new SQLException("�����߻�. ���̵� �ش��ϴ� ���� ����. �ٽ� �õ����ּ���.");
			return userDTO;
		}
	
	/**
	 * ȸ����������
	 * int updateMyInfo(UserDTO userDTO)
	 * */
		public static int updateMyInfo(UserDTO userDTO)throws SQLException {
			int result;
			result =userDAO.updateMyInfo(userDTO);
			return result;
		}
		
	/**
	 * ȸ�� Ż��
	 * int deleteMyInfo(String userId)
	 * */

		/////**���� �����ڱ��**/////////////////////////////////////
		/**
		 * ȸ�� ��ü ��� �˻�
		 *  List<UserDTO> searchAllUsers()
		 * */
			public static List<UserDTO> searchAllUsers()throws SQLException {
				List<UserDTO> list=userDAO.searchAllUsers();
				return list;
			}
		
		/**
		 * �ֹ��ݾ׿� ���� ȸ�� ��� �±�(ȸ������ ����)
		 * int updateGrade(String userId, int orderTotal)
		 * */
}
