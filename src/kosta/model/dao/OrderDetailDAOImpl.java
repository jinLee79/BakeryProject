package kosta.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import kosta.model.dto.OrderDTO;
import kosta.model.dto.OrderDetailsDTO;
import kosta.util.DbUtil;

public class OrderDetailDAOImpl implements OrderDetailDAO
{

	@Override
	public int insertOrder(OrderDTO orderDTO) throws SQLException
	{
		Connection con = null;
		PreparedStatement ps = null;
		int rs = 0;
		String sql = "insert into order_detail values()";
		
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);	
			rs = ps.executeUpdate();
			return rs;
		}
		finally
		{
			DbUtil.dbClose(ps, con);
		}
	}

	@Override
	public OrderDTO viewMyOrder(String userId) throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}




}
