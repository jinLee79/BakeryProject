package kosta.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import kosta.model.dto.OrderDTO;
import kosta.model.dto.ProductDTO;
import kosta.util.DbUtil;

public class OrderDAOImpl implements OrderDAO
{
	@Override
	public int insertOrder(OrderDTO orderDTO) throws SQLException
	{
		Connection con = null;
		PreparedStatement ps = null;
		int rs = 0;
		String sql = "insert into orders values(?, ?, ?, ?, ?, ?)";
		
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, orderDTO.getOrderNo());
			ps.setString(2, orderDTO.getOrderDate());
			ps.setString(3, orderDTO.getReceivingDate());
			ps.setInt(4, orderDTO.getOrderTotal());
			ps.setString(5, orderDTO.getOrderState());
			ps.setString(6, orderDTO.getUserId());
			rs = ps.executeUpdate();
			
			return rs;
		}
		finally
		{
			DbUtil.dbClose(ps, con);
		}
	}

	@Override
	public List<OrderDTO> viewMyOrder(String userId) throws SQLException
	{
		List<OrderDTO> list = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from orders where userid=?";
	
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				OrderDTO dto = new OrderDTO(rs.getInt("orderNo"),
						rs.getString("userId"), rs.getString("orderDate"),
						rs.getString("receivingDate"), rs.getInt("orderTotal"),
						rs.getString("orderState"));
				list.add(dto);
			}
			return list;
		}
		finally
		{
			DbUtil.dbClose(rs, ps, con);
		}
	}

	@Override
	public int cancelMyOrder(String userId) throws SQLException
	{
		Connection con = null;
		PreparedStatement ps = null;
		int rs = 0;
		String sql = "delete from orders where userid=?";
		
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			rs = ps.executeUpdate();
			
			return rs;
		}
		finally
		{
			DbUtil.dbClose(ps, con);
		}
	}

	@Override
	public List<OrderDTO> selectAllOrder() throws SQLException
	{
		List<OrderDTO> list = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from orders order by orderno";
	
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				OrderDTO dto = new OrderDTO(rs.getInt("orderNo"),
						rs.getString("userId"), rs.getString("orderDate"),
						rs.getString("receivingDate"), rs.getInt("orderTotal"),
						rs.getString("orderState"));
				list.add(dto);
			}
			return list;
		}
		finally
		{
			DbUtil.dbClose(rs, ps, con);
		}
	}

	@Override
	public int updateOrderState(OrderDTO orderDTO) throws SQLException
	{
		Connection con = null;
		PreparedStatement ps = null;
		int rs = 0;
		String sql = "update orders set orderstate=? where orderno=?";
		
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, orderDTO.getOrderState());
			ps.setInt(2, orderDTO.getOrderNo());		
			rs = ps.executeUpdate();
			
			return rs;
		}
		finally
		{
			DbUtil.dbClose(ps, con);
		}
	}

}
