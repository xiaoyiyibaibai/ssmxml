package com.cn.hnust.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String message = "Hello SpringMVC";
		//通过request对象将信息在页面上展示
		//req.setAttribute("message", message);
		ModelAndView view =  new ModelAndView();
		//
		return null;
	}

}
