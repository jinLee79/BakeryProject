package kosta.model.dao;

public interface UserDAO {

	/**
	 * ���(ȸ������ ������)
	 * int signUp(UserDTO userDTO)
	 * insert into users values(?,?,?, ?, ?, 2000, green)
	 * */
	
	/**
	 * ȸ�����Խ� ���̵� �ߺ� üũ
	 * int confirmId(String userId)
	 * select userid from users where userid=?
	 * */
	
	/**
	 * �α��� ���: 
	 * boolean loginCheck(String userId, String userPwd)
	 * select * from users where userid=? and userpwd=?
	 * */
	
	/**
	 * ȸ���� ȸ������ ����
	 * UserDTO viewMyInfo(String userId)
	 * select * from users where userid=?
	 * */
	
	/**
	 * userId, userpwd Ȯ�� �� ȸ������(��й�ȣ, �̸�, ����, ��ȭ��ȣ) ����
	 * point, grade�� �����Ұ�
	 * int updateMyInfo(UserDTO userDTO)
	 * update users set userpwd=?, username=?, age=?,  phone=? where userid=? and userpwd=?
	 * */
	
	/**
	 * ȸ�� Ż��
	 * int deleteMyInfo(String userId)
	 * delete from users where userid=? and userpwd=?
	 * */

	/////**���� �����ڱ��**/////////////////////////////////////
	/**
	 * ȸ�� ��ü ��� �˻�
	 *  List<UserDTO> searchAllUsers()
	 *  select * from users order by userid
	 * */
	
	/**????
	 * �ֹ��ݾ׿� ���� ȸ�� ��� �±�(ȸ������ ����)
	 * int updateGrade(String userId, int orderTotal)
	 * update users set grade=? where
	 * 
	 * */
	

}
