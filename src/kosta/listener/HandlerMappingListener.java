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
    	//서버가 start될 때 사용될 객체를 생성해서 Map에 저장
    	Map<String, Controller> map = new HashMap<>();
    	//1. properties파일 로딩
    	ServletContext application = e.getServletContext();
    	String fileName = application.getInitParameter("fileName");
    	//System.out.println("fileName : "+fileName);
    	
    	ResourceBundle rb = ResourceBundle.getBundle(fileName); 
    	
    	//2. key와 value를 분리하면서 value를 객체로 만들어 Map에 저장
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
    	
    	//3. Map을 application 영역에 저장
    	application.setAttribute("map", map);
    }
	
}
