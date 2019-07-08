package kosta.listener;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import kosta.controller.Controller;

/**
 * Application Lifecycle Listener implementation class HandlerMappingListener
 */
@WebListener
public class HandlerMappingListener implements ServletContextListener {

   
    public void contextDestroyed(ServletContextEvent e)  { }

    public void contextInitialized(ServletContextEvent e)  { 
    	//������ start�� �� ���� ��ü�� �����ؼ� Map�� ����
    	Map<String, Controller> map = new HashMap<>();
    	//1. properties���� �ε�
    	ServletContext application = e.getServletContext();
    	String fileName = application.getInitParameter("fileName");
    	//System.out.println("fileName : "+fileName);
    	
    	ResourceBundle rb = ResourceBundle.getBundle(fileName); 
    	
    	//2. key�� value�� �и��ϸ鼭 value�� ��ü�� ����� Map�� ����
    	Iterator<String> it= rb.keySet().iterator();
    	while(it.hasNext()) {
    		String key = it.next();
    		String value = rb.getString(key);
    	
			try {
				Controller classObj = (Controller) Class.forName(value).newInstance();
				map.put(key, classObj);
				System.out.println(classObj);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
    	}//whileEnd
    	
    	//3. Map�� application ������ ����
    	application.setAttribute("map", map);
    }
	
}
