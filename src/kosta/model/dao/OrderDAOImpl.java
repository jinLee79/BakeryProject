package kosta.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kosta.dao.String;
import kosta.dto.DeptDTO;
import kosta.dto.EmpDTO;
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
		String sql = "insert into orders values(null, sysdate, ?, ?, '결제완료', ?)";
		
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, orderDTO.getReceivingDate());
			ps.setInt(2, orderDTO.getOrderTotal());
			ps.setString(3, orderDTO.getUserId());
			rs = ps.executeUpdate();
			
			return rs;
		}
		finally
		{
			DbUtil.dbClose(ps, con);
		}
	}
	
	/**
	 * userId에 해당하는 주문목록 검색
	 * */
	@Override
	public OrderDTO viewMyOrder(String userId) throws SQLException
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		OrderDTO orderDTO = null;
		String sql = "select orders.orderno, orderdate, receivingdate, orderstate, ordertotal, productcode, quantity" + 
				"from orders join order_detail on orders.orderno = order_detail.orderno and userid=?";
	
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int orderno = rs.getInt("orderno");
				String orderdate = rs.getString("orderdate");
				String receivingdate = rs.getString("receivingdate");
				String orderstate = rs.getString("orderstate");
				int ordertotal = rs.getInt("ordertotal");
				orderDTO = new OrderDTO(orderno, userId, orderdate, receivingdate, ordertotal,orderstate);
			}
				OrderDTO dto = new OrderDTO(rs.getInt("orderNo"),
						rs.getString("userId"), rs.getString("orderDate"),
						rs.getString("receivingDate"), rs.getInt("orderTotal"),
						rs.getString("orderState"));
				list.add(dto);
			}
			
			if(rs.next()) {
				int dno = rs.getInt("deptno");
				String loc = rs.getString("loc");
				String dname = rs.getString("dname");
				dto = new DeptDTO(dno,loc,dname);
				
				 List<EmpDTO> empList = dto.getEmplist();
				 empList.add( new EmpDTO(rs.getInt("empno"), rs.getString("ename"), rs.getString("job"), rs.getInt("sal")));
				
				 while(rs.next()) {
					 empList.add( new EmpDTO(rs.getInt("empno"), rs.getString("ename"), rs.getString("job"), rs.getInt("sal")));
				}
			
			
			
			
			
			
			
			
			
			
			return list;
		}
		finally
		{
			DbUtil.dbClose(rs, ps, con);
		}
	}

////////////////**이하 관리자 기능**///////////////////////////////////////////////////////
	@Override
	public List<OrderDTO> selectAllOrder() throws SQLException
	{
		List<OrderDTO> list = new ArrayList<>();
		
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
