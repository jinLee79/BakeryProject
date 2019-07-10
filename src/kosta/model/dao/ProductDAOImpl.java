package kosta.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import kosta.model.dto.ProductDTO;
import kosta.util.DbUtil;

public class ProductDAOImpl implements ProductDAO
{

	@Override
	public List<ProductDTO> selectAllProduct() throws SQLException
	{
		List<ProductDTO> list = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from product order by productcode";
		
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				ProductDTO dto = new ProductDTO(rs.getString("productCode"),
						rs.getString("productName"), rs.getInt("sellPrice"),
						rs.getString("description"), rs.getString("fName"));
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
	public List<ProductDTO> searchByKeyword(String keyWord) throws SQLException
	{
		List<ProductDTO> list = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from product where productname like ?";
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, keyWord);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				ProductDTO dto = new ProductDTO(rs.getString("productCode"),
						rs.getString("productName"), rs.getInt("sellPrice"),
						rs.getString("description"), rs.getString("fName"));
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
	public List<ProductDTO> sort(String keyField) throws SQLException
	{
		List<ProductDTO> list = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from product order by ?";
	
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, keyField);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				ProductDTO dto = new ProductDTO(rs.getString("productCode"),
						rs.getString("productName"), rs.getInt("sellPrice"),
						rs.getString("description"), rs.getString("fName"));
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
	public int insert(ProductDTO productDTO) throws SQLException
	{
		Connection con = null;
		PreparedStatement ps = null;
		int rs = 0;
		String sql = "insert into product values(?, ?, ?, ?, ?)";
		
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, productDTO.getProductCode());
			ps.setString(2, productDTO.getProductName());
			ps.setInt(3, productDTO.getSellPrice());
			ps.setString(4, productDTO.getDescription());
			ps.setString(5, productDTO.getfName());
			
			rs = ps.executeUpdate();
			return rs;
		}
		finally
		{
			DbUtil.dbClose(ps, con);
		}
	}

	@Override
	public int updateProduct(ProductDTO productDTO) throws SQLException
	{
		Connection con = null;
		PreparedStatement ps = null;
		int rs = 0;
		String sql = "update product set productname=?, sellprice=?, description=?. fname=? where productcode=?";
		
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, productDTO.getProductName());
			ps.setInt(2, productDTO.getSellPrice());
			ps.setString(3, productDTO.getDescription());
			ps.setString(4, productDTO.getfName());
			ps.setString(5, productDTO.getProductCode());
			
			rs = ps.executeUpdate();
			return rs;
		}
		finally
		{
			DbUtil.dbClose(ps, con);
		}
	}

	@Override
	public int deleteProduct(String productCode) throws SQLException
	{
		Connection con = null;
		PreparedStatement ps = null;
		int rs = 0;
		String sql = "delete from product where productcode=?";
		
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, productCode);			
			rs = ps.executeUpdate();
			return rs;
		}
		finally
		{
			DbUtil.dbClose(ps, con);
		}
	}
}
