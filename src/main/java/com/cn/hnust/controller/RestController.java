package com.cn.hnust.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.annotation.WebServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;



/**
 * 基于Restful风格架构
 * @author xiaodonghong
 * 2016年10月11日 下午1:37:53
 */
@Controller
@RequestMapping(value="/rest")
public class RestController {
	@Resource
	private IUserService userService;
	/** 日志实例 */
	private static final Logger logger = LoggerFactory.getLogger(RestController.class);
	private static List<User> stList = new ArrayList<User>();
	@RequestMapping(value="/hello")
	public @ResponseBody String hello(){
		return "你好！hello";
	}
	/**
	 * http://localhost:8080/springmvc/rest/say/12222
	 * @param msg
	 * @return
	 * 2016年10月11日 下午2:04:58
	 */
	@RequestMapping(value="/say/{msg}",produces="application/json;charset=UTF-8")
	public @ResponseBody String say(String msg){
		logger.debug("浏览");
		return "{\"msg\":\"you say:'" + msg + "'\"}";
	}
	/**
	 * 对应请求：http://localhost:8080/springmvc/rest/user/12
	 * 
	 * getPerson:function(){
				$.ajax({
					url: dekota.url + 'student/101/',
					type: 'GET',
					dataType: 'json'
				}).done(function(data, status, xhr) {
					$.UIkit.notify("获取人员信息成功", {status:'success',timeout:1000});
				}).fail(function(xhr, status, error) {
					$.UIkit.notify("请求失败！", {status:'danger',timeout:2000});
				});
			},
	 * @param age
	 * @return
	 * 2016年10月11日 下午2:04:35
	 */
	@RequestMapping(value="/user/{age:\\d+}",method=RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable("age") int id){
		logger.debug("获取学生的年龄="+id);
		User st = userService.getUserById(id);
		return st;
	}	
	/**
	 * delPerson:function(){
				$.ajax({
					url: dekota.url + 'student/109',
					type: 'DELETE',
					dataType: 'json'--返回值
				}).done(function(data, status, xhr) {
					$.UIkit.notify(data.msg, {status:'success',timeout:1000});
				}).fail(function(xhr, status, error) {
					$.UIkit.notify("请求失败！", {status:'danger',timeout:2000});
				});
			},
	 * @param age
	 * @return
	 * 2016年10月11日 下午2:13:37
	 */
	@RequestMapping(value="/user/{id:\\d+}",method=RequestMethod.DELETE)
	public @ResponseBody Object deleteUser(@PathVariable("id") int id){
		logger.debug("删除id为"+id+"的用户");
		User user = userService.getUserById(id);
		userService.deleteUser(id);
		JSONObject json = new JSONObject();
		json.put("msg", "删除用户成功！");
		json.put("user", user);
		return json;
	}	
	/**
	 * ajax中调用
	 * addPerson:function(){
				$.ajax({
					url: dekota.url + 'student',
					type: 'POST',
					dataType: 'json',--返回值类型
					data: {age: 1,username:'张三',address:'sw',}
				}).done(function(data, status, xhr) {
					$.UIkit.notify(data.msg, {status:'success',timeout:1000});
				}).fail(function(xhr, status, error) {
					$.UIkit.notify("请求失败！", {status:'danger',timeout:2000});
				});
			},
	 * @param person
	 * @return
	 * 2016年10月11日 下午2:11:43
	 */
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public @ResponseBody
	Object addUser(User person) {
		logger.info("注册人员信息成功id=" );
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("msg", "注册人员信息成功");
		userService.addUser(person);
		return jsonObject;
	}
	/**
	 * updatePerson:function(){
				$.ajax({
					url: dekota.url + 'student',
					type: 'POST',//注意在传参数时，加：_method:'PUT'　将对应后台的PUT请求方法
					dataType: 'json',
					data: {_method:'PUT',age: 1,username:'张三',address:'sw',}
				}).done(function(data, status, xhr) {
					$.UIkit.notify(data.msg, {status:'success',timeout:1000});
				}).fail(function(xhr, status, error) {
					$.UIkit.notify("请求失败！", {status:'danger',timeout:2000});
				});
			},
	 * @param person
	 * @return
	 * 2016年10月11日 下午2:14:40
	 */
	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public @ResponseBody
	Object updatePerson(User person) {
		logger.info("更新人员信息id=" );
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("msg", "更新人员信息成功");
		userService.updateUser(person);
		return jsonObject;
	}
/**
 * get类型的可以在url中直接访问。
 * http://localhost:8080/springmvc/rest/user?name=233
 * 
 * listPerson:function(){
				$.ajax({
					url: dekota.url + 'student',
					type: 'POST',//注意在传参数时，加：_method:'PATCH'　将对应后台的PATCH请求方法
					dataType: 'json',
					data: {_method:'PATCH',name: '张三'}
				}).done(function(data, status, xhr) {
					$.UIkit.notify("查询人员信息成功", {status:'success',timeout:1000});
				}).fail(function(xhr, status, error) {
					$.UIkit.notify("请求失败！", {status:'danger',timeout:2000});
				});
			}
 * @param name
 * @return
 * 2016年10月11日 下午2:09:26
 */
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public @ResponseBody
	List<User> listPerson(@RequestParam(value = "name", required = false, defaultValue = "") String name) {

		logger.info("查询人员name like " + name);
		List<User> lstPersons = this.userService.findAllUser();

		return lstPersons;
	}

}
