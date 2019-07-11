package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.dto.ProductDTO;
import kosta.model.service.ProductService;



public class AdminMainListController implements Controller
{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String url = "error.jsp";
		try { //����ó���� controller���� ó����
			//���� -> dao -> �� ����� list�� �����ϰ� list.jsp�� �̵�
			List<ProductDTO> list = ProductService.selectAllProduct();
			Integer rand[] = new Integer[6];
			List<ProductDTO> randList = new ArrayList<>();
			rand[0] = (int)(Math.random() * list.size());
			randList.add(list.get(rand[0]));
			int i = 0;
			boolean check = false;
			for(i = 1; i < rand.length; ++i)
		    {
				rand[i] = (int)(Math.random() * list.size());	
				
				for(int j = 0; j < i; ++j)
				{
					if(rand[i] == rand[j])
					{
						--i;
						check = true;
						break;
					}
				}
				if(check == false)
				{
					randList.add(list.get(rand[i]));					
				}
				else
				{
					check = false;
				}
		    }
			request.setAttribute("list", randList);
			url="AdminIndex.jsp";
		} catch(SQLException e) {
			request.setAttribute("errorMsg", e.getMessage());
		}
		ModelAndView mv = new ModelAndView(); //�̵������ �����ϴ� ModelAndView
		mv.setPath(url);
		return mv;
	}

}
