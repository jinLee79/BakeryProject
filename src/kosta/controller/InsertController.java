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
	 *	 등록하기(파일첨부)
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
		
		//넘어오는 값 받기
		String productCode = m.getParameter("code");
		String productName = m.getParameter("name");
		String sellPrice = m.getParameter("price");
		String description = m.getParameter("des");
		String fName = m.getFilesystemName("file");
		
		ProductDTO dto = new ProductDTO(productCode, productName, Integer.parseInt(sellPrice), description, fName);
		//만약 파일첨부가 되었다면... 파일이름, 파일크기를 저장
		
		if(m.getFilesystemName("file") != null)
		{
			//파일이름
			dto.setfName(m.getFilesystemName("file"));
			//파일크기
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
