package com.cn.hnust.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import com.mangofactory.swagger.annotations.ApiIgnore;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;



/**
 * 基于Restful风格架构
 * @author xiaodonghong
 * 其中@ApiOperation和@ApiParam为添加的API相关注解，个参数说明如下： 
@ApiOperation(value = “接口说明”, httpMethod = “接口请求方式”, response = “接口返回参数类型”, notes = “接口发布说明”；其他参数可参考源码； 
@ApiParam(required = “是否必须参数”, name = “参数名称”, value = “参数具体描述”
@ApiIgnore 在swagger中忽略该接口（不显示该接口）。
@ApiResponses:接口访问消息的显示码code在400等情况下的中文显示。
 * 2016年10月11日 下午1:37:53
 */
@Controller
@RequestMapping(value="/rest")
@Api(description="Restful风格测试", value = "Restful风格测试类",position=1)
public class RestController {
	@Resource
	private IUserService userService;
	/** 日志实例 */
	private static final Logger logger = LoggerFactory.getLogger(RestController.class);
	@RequestMapping(value="/hello")
	@ApiOperation(httpMethod="GET" ,notes="你好！",value="欢迎页面")
	@ApiIgnore
	public  String hello(){
		//不配置@responseBody，则该hello，自动去查找hello.jsp页面。http://localhost:8080/springmvc/rest/hello
		//httpMethod="GET"：当@RequestMapping无限请求类型时，所有请求类型，都会显示出来。设置httpMethod，在swagger中，只显示里面的请求类型。
		
		System.out.println();
		
		return "hello";
	}
	/**
	 * http://localhost:8080/springmvc/rest/say/12222
	 * @param msg
	 * @return
	 * 2016年10月11日 下午2:04:58
	 */
	@RequestMapping(value="/say/{msg}",produces="application/json;charset=UTF-8")
	@ApiOperation(httpMethod="GET" ,notes="你好！",value="输出内容")
	public @ResponseBody String say(@ApiParam(value="内容") @PathVariable("msg") String msg){
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
	@ApiOperation(httpMethod="GET" ,notes="根据用户id获取用户！",value="获取用户", produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value="/user/{id:\\d+}",method=RequestMethod.GET)
	public @ResponseBody User getUser(@ApiParam(value="用户id值") @PathVariable("id") int id){
		logger.debug("获取学生的id="+id);
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
	@ApiOperation(httpMethod="DELETE" ,notes="根据用户id删除用户！",value="删除用户", produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value="/user/{id:\\d+}",method=RequestMethod.DELETE)
	public @ResponseBody Object deleteUser(@ApiParam(value="用户id值") @PathVariable("id") int id){
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
	@ApiOperation(httpMethod="POST" ,notes="添加用户！",value="添加用户", produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public @ResponseBody
	Object addUser(@ApiParam(value="用户信息",required=true) User person) {
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
	@ApiOperation(httpMethod="PUT" ,notes="更新用户！",value="更新用户", produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	@ApiResponses(value = {  
			@ApiResponse(code = 200, message = "更新成功"),  
			@ApiResponse(code = 201, message = "成功创建"),  
			@ApiResponse(code = 401, message = "未授权"),  
			@ApiResponse(code = 403, message = "禁止访问"),  
			@ApiResponse(code = 404, message = "找不到页面"),  
			@ApiResponse(code = 500, message = "内部报错")}  
			)  
	public @ResponseBody 
	Object updatePerson(@ApiParam(value="用户信息",required=true,allowMultiple=true,name="User")@RequestBody User person) {
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
	@ApiOperation(httpMethod="GET" ,notes="用户列表！",value="用户列表", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	List<User> listPerson() {
		/*		@RequestMapping(value = "/user", method = RequestMethod.GET)
		@ApiOperation(httpMethod="PUT" ,notes="用户列表！",value="用户列表", produces = MediaType.APPLICATION_JSON_VALUE)
		两者不一致的时候，不会再swagger中显示。
		 *
		 */
		List<User> lstPersons = this.userService.findAllUser();

		return lstPersons;
	}
	

}
