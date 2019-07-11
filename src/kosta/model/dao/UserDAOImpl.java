package kosta.model.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kosta.model.dto.UserDTO;
import kosta.util.DbUtil;

public class UserDAOImpl implements UserDAO {
	

	//회원가입시 아이디 중복 체크
	@Override
	 public int confirmId(String userId) throws SQLException {
		 Connection con = null;
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 int result = 0;
		 String sql = "select userid from users where userid=?";
		 try {
				con = DbUtil.getConnection();
				ps = con.prepareStatement(sql);
				ps.setString(1, userId);
				rs = ps.executeQuery();
				if(rs.next()) result=1;
	     } finally {
				DbUtil.dbClose(rs, ps, con);
		 }
		return result;
	 }
	

	 // 등록(회원가입 폼에서)
	@Override
	public int signUp(UserDTO userDTO) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql ="insert into users values(?,?,?, ?, ?, 2000, green)";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, userDTO.getUserId());
			ps.setString(2, userDTO.getUserPwd());	
			ps.setString(3, userDTO.getUserName());
			ps.setInt(4, userDTO.getAge());
			ps.setString(5, userDTO.getPhone());
			result = ps.executeUpdate();
		} finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}

	@Override
	public UserDTO loginCheck(String userId, String userPwd) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		UserDTO dto = null;
		String sql = "select * from users where userid=? and userpwd=?";
		
		try {
			System.out.println("userid = " + userId);
			System.out.println("userPwd = " + userPwd);
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, userPwd);
			rs = ps.executeQuery();
			
		
			if(rs.next()) {
				dto = new UserDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7));
			}

		}
		finally {
			DbUtil.dbClose(rs, ps, con);
		}
		
		return dto;
	}
	
	
	//회원이 회원정보 보기
	@Override
	public UserDTO viewMyInfo(String userId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UserDTO userDTO = null;
		String sql ="select * from users where userid=?";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			rs = ps.executeQuery();
			while(rs.next()) {
				userDTO = new UserDTO(rs.getString("userid"), rs.getString("userpwd"),
						 rs.getString("username"), rs.getInt("age"),
						 rs.getString("phone"), rs.getString("grade"), rs.getInt("point"));
			}
		} finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return userDTO;
	}
	
	//수정 userId, userpwd 확인 시 회원정보(비밀번호, 이름, 나이, 전화번호)  
	//point, grade는 수정불가
	@Override
	public int updateMyInfo(UserDTO userDTO) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql ="update users set userpwd=?, username=?, age=?,  phone=? where userid=? and userpwd=?";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, userDTO.getUserPwd());
			ps.setString(2,  userDTO.getUserName());
			ps.setInt(3,  userDTO.getAge());
			ps.setString(4,  userDTO.getPhone());
			ps.setString(5,  userDTO.getUserId());
			ps.setString(6,  userDTO.getUserPwd());
			result = ps.executeUpdate();
		} finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}
	//회원 탈퇴
	@Override
	public int deleteMyInfo(String userId, String userPwd) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql ="delete from users where userid=? and userpwd=?";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2,  userPwd);
			result = ps.executeUpdate();
		} finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}
	
/////**이하 관리자기능**/////////////////////////////////////
	/**
	 * 회원 전체 목록 검색
	 *  select * from users order by userid
	 * */
	@Override
	public List<UserDTO> searchAllUsers() throws SQLException {
		List<UserDTO> list = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from users";
		
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				UserDTO dto = new UserDTO(rs.getString("userId"),rs.getString("userPwd"), rs.getString("userName"),
						rs.getInt("age"), rs.getString("phone"), rs.getString("grade"), rs.getInt("point"));
				
				list.add(dto);
			}
			return list;
		}
		finally
		{
			DbUtil.dbClose(rs, ps, con);
		}
	}
}