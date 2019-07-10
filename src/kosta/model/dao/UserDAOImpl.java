package kosta.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
				if(rs.next()){
				   result=1;
				}
		 } finally {
				DbUtil.dbClose(rs, ps, con);
		 }
		return result;
	 }

	@Override
	public int signUp(UserDTO userDTO) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean loginCheck(String userId, String userPwd) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDTO viewMyInfo(String userId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateMyInfo(UserDTO userDTO) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMyInfo(String userId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserDTO> searchAllUsers() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}



}
