package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	/**
	 * url的访问地址：http://localhost:8080/springmvc//user/showUser?id=9
	 * @param request
	 * @param model
	 * @return
	 * 2016年10月12日 下午2:16:49
	 */
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
}
