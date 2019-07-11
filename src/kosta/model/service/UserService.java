package kosta.model.service;

import java.sql.SQLException;

import kosta.model.dao.UserDAO;
import kosta.model.dao.UserDAOImpl;
import kosta.model.dto.UserDTO;

public class UserService {
	//private static UserDTO UserDTO = null;
	private static UserDAO userDAO  = new UserDAOImpl();
	

	/**
	 * 등록(회원가입 폼에서)
	 * static int signUp(UserDTO userDTO)
	 * */
	
	/**
	 * 회원가입시 아이디 중복 체크
	 * int confirmId(String userId)
	 * */
	 public static int confirmId(String userId) throws SQLException {
		 return userDAO.confirmId(userId);
	 }
	
	/**
	 * 로그인 기능: 
	 * UserDTO  loginCheck(String userId, String userPwd)
	 * */

		public static UserDTO loginCheck(String userId, String userPwd) throws SQLException {
			UserDTO userDto =userDAO.loginCheck(userId, userPwd);
			if(userDto ==null) throw new SQLException("정보를 확인해주세요.");
			return userDto ;
		}
	/**
	 * 회원이 회원정보 보기
	 * UserDTO viewMyInfo(String userId)
	 * */
	
	/**
	 * 회원정보수정
	 * int updateMyInfo(UserDTO userDTO)
	 * */
		public int updateMyInfo(UserDTO userDTO)throws SQLException {
			int result;
			result =userDAO.updateMyInfo(userDTO);
			return result;
		}
		
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
