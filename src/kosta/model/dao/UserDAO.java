package kosta.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dto.UserDTO;

public interface UserDAO {

	/**
	 * ���(ȸ������ ������)
	 * insert into users values(?,?,?, ?, ?, 2000, green)
	 * */
	int signUp(UserDTO userDTO) throws SQLException;
	
	/**
	 * ȸ�����Խ� ���̵� �ߺ� üũ
	 * select userid from users where userid=?
	 * */
	 int confirmId(String userId) throws SQLException;
	 
	/**
	 * �α��� ���: 
	 * select * from users where userid=? and userpwd=?
	 * */
	 UserDTO loginCheck(String userId, String userPwd) throws SQLException;
	
	/**
	 * ȸ���� ȸ������ ����
	 * select * from users where userid=?
	 * */
	 UserDTO viewMyInfo(String userId) throws SQLException;
	 
	/**
	 * userId, userpwd Ȯ�� �� ȸ������(��й�ȣ, �̸�, ����, ��ȭ��ȣ) ����
	 * point, grade�� �����Ұ�
	 * update users set userpwd=?, username=?, age=?,  phone=? where userid=? and userpwd=?
	 * */
	 int updateMyInfo(UserDTO userDTO) throws SQLException;

	 
	/////**���� �����ڱ��**/////////////////////////////////////
	/**
	 * ȸ�� ��ü ��� �˻�
	 *  select * from users order by userid
	 * */
	 List<UserDTO> searchAllUsers() throws SQLException;
	 
	/**????
	 * �ֹ��ݾ׿� ���� ȸ�� ��� �±�(ȸ������ ����)
	 * int updateGrade(String userId, int orderTotal)
	 * update users set grade=? where
	 * */
	

}
