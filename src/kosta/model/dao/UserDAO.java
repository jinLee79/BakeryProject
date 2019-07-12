package kosta.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.model.dto.UserDTO;

public interface UserDAO {

	/**
	 * 등록(회원가입 폼에서)
	 * insert into users values(?,?,?, ?, ?, 2000, green)
	 * */
	int signUp(UserDTO userDTO) throws SQLException;
	
	/**
	 * 회원가입시 아이디 중복 체크
	 * select userid from users where userid=?
	 * */
	 int confirmId(String userId) throws SQLException;
	 
	/**
	 * 로그인 기능: 
	 * select * from users where userid=? and userpwd=?
	 * */
	 UserDTO loginCheck(String userId, String userPwd) throws SQLException;
	
	/**
	 * 회원이 회원정보 보기
	 * select * from users where userid=?
	 * */
	 UserDTO viewMyInfo(String userId) throws SQLException;
	 
	/**
	 * userId, userpwd 확인 시 회원정보(비밀번호, 이름, 나이, 전화번호) 수정
	 * point, grade는 수정불가
	 * update users set userpwd=?, username=?, age=?,  phone=? where userid=? and userpwd=?
	 * */
	 int updateMyInfo(UserDTO userDTO) throws SQLException;

	 
	/////**이하 관리자기능**/////////////////////////////////////
	/**
	 * 회원 전체 목록 검색
	 *  select * from users order by userid
	 * */
	 List<UserDTO> searchAllUsers() throws SQLException;
	 
	/**????
	 * 주문금액에 따른 회원 등급 승급(회원정보 수정)
	 * int updateGrade(String userId, int orderTotal)
	 * update users set grade=? where
	 * */
	

}
