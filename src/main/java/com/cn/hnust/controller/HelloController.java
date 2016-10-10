package com.cn.hnust.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonProcessingException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String message = "Hello SpringMVC";
		//通过request对象将信息在页面上展示
		//req.setAttribute("message", message);
		ModelAndView view =  new ModelAndView();
		//相当于request.setAttribute()，将数据传到页面展示
		//model数据
		view.addObject("message", message);
		//设置视图
		view.setViewName("hello");
		//已经在springmvc.xml中添加了前后缀了，即/WEB-INF/jsp/hello.jsp
		return view;
	}

}
