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
	 * 등록(회원가입 폼에서)
	 * static int signUp(UserDTO userDTO)
	 * */
	public static int signUp(UserDTO userDTO) throws SQLException {
		int result = userDAO.signUp(userDTO);
		if(result !=1) throw new SQLException("회원가입에 오류가 생겼습니다. 다시 시도해주세요.");
		return result;
	}
	
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
		public static UserDTO viewMyInfo(String userId) throws SQLException{
			UserDTO userDTO = userDAO.viewMyInfo(userId);
			if(userDTO == null) throw new SQLException("오류발생. 아이디에 해당하는 정보 없음. 다시 시도해주세요.");
			return userDTO;
		}
	
	/**
	 * 회원정보수정
	 * int updateMyInfo(UserDTO userDTO)
	 * */
		public static int updateMyInfo(UserDTO userDTO)throws SQLException {
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
			public static List<UserDTO> searchAllUsers()throws SQLException {
				List<UserDTO> list=userDAO.searchAllUsers();
				return list;
			}
		
		/**
		 * 주문금액에 따른 회원 등급 승급(회원정보 수정)
		 * int updateGrade(String userId, int orderTotal)
		 * */
}
