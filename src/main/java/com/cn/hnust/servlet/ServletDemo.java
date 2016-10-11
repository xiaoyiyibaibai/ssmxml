package com.cn.hnust.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
/**
 * 为了验证web无配置
 * @author xiaodonghong
 *
 * 2016年10月11日 下午8:38:38
 */
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*   
 <!-- DemoServlet -->  
  <servlet>  
 <servlet-name>demoServlet</servlet-name>  
 <servlet-class>web.function.servlet.DemoServlet</servlet-class>  
 <load-on-startup>2</load-on-startup>  
    </servlet>  
<servlet-mapping>  
 <servlet-name>demoServlet</servlet-name>  
 <url-pattern>/demo_servlet</url-pattern>  
</servlet-mapping> 

	 */ 
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("代用demo的servlet方法！");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		System.out.println("servlet的初始化init");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("servlet的destroy方法！");
	}
}
