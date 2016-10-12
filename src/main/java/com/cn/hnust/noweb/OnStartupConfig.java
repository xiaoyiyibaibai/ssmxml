package com.cn.hnust.noweb;

import javax.servlet.ServletRegistration.Dynamic;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
/**
 * 服务器启动入口类
 * 实现 WebApplicationInitializer 接口，是项目的入口，作用类似于web.xml
 * @author xiaodonghong
 *
 * 2016年10月11日 下午8:24:00
 */
public class OnStartupConfig /*implements WebApplicationInitializer*/  {
	private static final String SERVLET_NAME = "Spring-mvc";
	private static final long MAX_FILE_UPLOAD_SIZE = 1024 * 1024 * 5; // 5 Mb
	private static final int FILE_SIZE_THRESHOLD = 1024 * 1024; // After 1Mb
	private static final long MAX_REQUEST_SIZE = -1L; // No request size limit
	//@Override
	public void onStartup(ServletContext container) throws ServletException {
		initializeSpringConfig(container);

		initializeLog4jConfig(container);

		initializeSpringMVCConfig(container);

		registerServlet(container);

		registerListener(container);

		registerFilter(container);

	}

	/**
	 * 引入spring的listener配置
	 * @param container
	 * 2016年10月11日 下午8:42:14
	 */
	private void initializeSpringConfig(ServletContext container) {
		
	}
	
	private void initializeSpringMVCConfig(ServletContext container) {
		
	}
	private void initializeLog4jConfig(ServletContext container) {
		
	}

	private void registerListener(ServletContext container) {
		
	}
	private void registerServlet(ServletContext container) {
		
	}
	private void registerFilter(ServletContext container) {
		
	}
	private void addServlet(ServletContext container) {
		// 构建一个application context
		AnnotationConfigWebApplicationContext ac = createWebContext(SpringMVC.class, ViewConfiguration.class);
		// 注册spring mvc 的 servlet
		//Dynamic dynamic = servletContext.addServlet(SERVLET_NAME, new DispatcherServlet(we
		Dynamic dynamic = (Dynamic) container.addServlet(SERVLET_NAME, new DispatcherServlet(ac));
		// 添加springMVC 允许访问的Controller后缀
		dynamic.addMapping("/");
		// 全部通过请用 “/”
		dynamic.setLoadOnStartup(1);
		dynamic.setMultipartConfig(new MultipartConfigElement(null, MAX_FILE_UPLOAD_SIZE, MAX_REQUEST_SIZE, FILE_SIZE_THRESHOLD));
		
	}
	private AnnotationConfigWebApplicationContext createWebContext(Class ... annotatedClasses) {
		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(annotatedClasses);

		return webContext;
	}

	/*下面谈谈动态注册Servlet，但不要希望太高，只能在初始化时进行注册。在运行时为了安全原因，无法完成注册。在初始化情况下的注册Servlet组件有两种方法：
	1.实现ServletContextListener接口,在contextInitialized方法中完成注册.
	2.在jar文件中放入实现ServletContainerInitializer接口的初始化器
	先说在ServletContextListener监听器中完成注册。*/
	public void contextInitialized(ServletContextEvent sce) { 

		ServletContext sc = sce.getServletContext(); 

		// Register Servlet 
		ServletRegistration sr = sc.addServlet("DynamicServlet", 
				"web.servlet.dynamicregistration_war.TestServlet"); 
		sr.setInitParameter("servletInitName", "servletInitValue"); 
		sr.addMapping("/*"); 

		// Register Filter 
		FilterRegistration fr = sc.addFilter("DynamicFilter", 
				"web.servlet.dynamicregistration_war.TestFilter"); 
		fr.setInitParameter("filterInitName", "filterInitValue"); 
		fr.addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST), 
				true, "DynamicServlet"); 

		// Register ServletRequestListener 
		sc.addListener("web.servlet.dynamicregistration_war.TestServletRequestListener"); 
	}
}
