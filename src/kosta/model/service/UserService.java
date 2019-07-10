package kosta.model.service;

import java.sql.SQLException;

import kosta.model.dao.UserDAO;
import kosta.model.dao.UserDAOImpl;

public class UserService {
	static UserDAO userDAO = new UserDAOImpl();

	/**
	 * 등록(회원가입 폼에서)
	 * static int signUp(UserDTO userDTO)
	 * */
	
	/**
	 * 회원가입시 아이디 중복 체크
	 * int confirmId(String userId)
	 * */
	 public static int confirmId(String userId) throws SQLException {
		 int result =userDAO.confirmId(userId);
		 return result;
	 }
	
	/**
	 * 로그인 기능: 
	 * boolean loginCheck(String userId, String userPwd)
	 * */
	
	/**
	 * 회원이 회원정보 보기
	 * UserDTO viewMyInfo(String userId)
	 * */
	
	/**
	 * userId, userpwd 확인 시 회원정보(비밀번호, 이름, 나이, 전화번호) 수정
	 * int updateMyInfo(UserDTO userDTO)
	 * */
	
	/**
	 * 회원 탈퇴
	 * int deleteMyInfo(String userId)
	 * */

	/////**이하 관리자기능**/////////////////////////////////////
	/**
	 * 회원 전체 목록 검색
	 *  List<UserDTO> searchAllUsers()
	 * */
	
	/**
	 * 주문금액에 따른 회원 등급 승급(회원정보 수정)
	 * int updateGrade(String userId, int orderTotal)
	 * */
	
}
