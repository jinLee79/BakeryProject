package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kosta.model.dto.ProductDTO;

public class InsertController implements Controller
{
	/**
	 *	 ����ϱ�(����÷��)
	 */

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String url = "error.jsp";
		ModelAndView mv = new ModelAndView();
		
		ServletContext application = request.getServletContext();
		String saveDir = application.getRealPath("/save");
		int maxSize = 1024 * 1024 * 100; // 100M
		String encoding = "UTF-8";
		
		MultipartRequest m = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
		
		//�Ѿ���� �� �ޱ�
		String productCode = m.getParameter("code");
		String productName = m.getParameter("name");
		String sellPrice = m.getParameter("price");
		String description = m.getParameter("des");
		String fName = m.getFilesystemName("file");
		
		ProductDTO dto = new ProductDTO(productCode, productName, Integer.parseInt(sellPrice), description, fName);
		//���� ����÷�ΰ� �Ǿ��ٸ�... �����̸�, ����ũ�⸦ ����
		
		if(m.getFilesystemName("file") != null)
		{
			//�����̸�
			dto.setfName(m.getFilesystemName("file"));
			//����ũ��
			dto.setfSize((int)m.getFile("file").length());
		}
		//
		
		try
		{
			ElectronicsService.insert(elec);
			mv.setPath("elec");
			mv.setRedirect(true);
		}
		catch(SQLException e)
		{
			request.setAttribute("errorMsg", e.getMessage());
			mv.setPath(url);
		}
		return mv;

}
