package kosta.model.service;

public interface UserService {

	/**
	 * 등록(회원가입 폼에서)
	 * int signUp(UserDTO userDTO)
	 * insert into users values(?,?,?, ?, ?, 2000, green)
	 * */
	
	/**
	 * 회원가입시 아이디 중복 체크
	 * int confirmId(String userId)
	 * select userid from users where userid=?
	 * */
	
	/**
	 * 로그인 기능: 
	 * boolean loginCheck(String userId, String userPwd)
	 * select * from users where userid=? and userpwd=?
	 * */
	
	/**
	 * 회원이 회원정보 보기
	 * UserDTO viewMyInfo(String userId)
	 * select * from users where userid=?
	 * */
	
	/**
	 * userId, userpwd 확인 시 회원정보(비밀번호, 이름, 나이, 전화번호) 수정
	 * point, grade는 수정불가
	 * int updateMyInfo(UserDTO userDTO)
	 * update users set userpwd=?, username=?, age=?,  phone=? where userid=? and userpwd=?
	 * */
	
	/**
	 * 회원 탈퇴
	 * int deleteMyInfo(String userId)
	 * delete from users where userid=? and userpwd=?
	 * */
	
}
