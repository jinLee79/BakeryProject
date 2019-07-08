package kosta.model.dao;

import java.util.List;

public interface UserDAO {

	/**
	 * 등록(회원가입)
	 * int signUp(UserDTO userDTO)
	 * */
	
	/**
	 * 로그인 기능: 
	 * boolean loginCheck(String userId, String userPwd)
	 * */
	
	/**
	 * 회원 전체 목록 검색(관리자)
	 *  List<UserDTO> searchAllUsers()
	 * */
	
	/**
	 * 회원 수정
	 * int updateUsers(UserDTO userDTO)
	 * */
	
	/**
	 * 회원 탈퇴
	 * int deleteUsers(String userId)
	 * */

}
