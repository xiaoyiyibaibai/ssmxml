package com.cn.hnust.controller;

import java.util.ArrayList;
import java.util.List;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.cn.hnust.pojo.Student;

/**
 * 基于Restful风格架构
 * @author xiaodonghong
 * 2016年10月11日 下午1:37:53
 */
@Controller
@RequestMapping(value="/rest")
public class RestController {
	/** 日志实例 */
	private static final Logger logger = Logger.getLogger(RestController.class);
	private static List<Student> stList = new ArrayList<Student>();
	@RequestMapping(value="/hello")
	public String hello(){
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
		return "{\"msg\":\"you say:'" + msg + "'\"}";
	}
	/**
	 * 对应请求：http://localhost:8080/springmvc/rest/student/12
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
	@RequestMapping(value="/student/{age:\\d+}",method=RequestMethod.GET)
	public @ResponseBody Student getStudent(@PathVariable("age") int age){
		logger.debug("获取学生的年龄="+age);
		Student st = new Student();
		st.setAddress("sd");
		st.setAge(21);
		st.setUsername("xdh");
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
	@RequestMapping(value="/student/{age:\\d+}",method=RequestMethod.DELETE)
	public @ResponseBody Object deleteStudent(@PathVariable("age") int age){
		logger.debug("删除年龄为"+age+"的学生");
		Student st = new Student();
		st.setAddress("sd");
		st.setAge(21);
		st.setUsername("xdh");
		JSONObject json = new JSONObject();
		json.put("msg", "删除用户成功！");
		return st;
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
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public @ResponseBody
	Object addStudent(Student person) {
		logger.info("注册人员信息成功id=" );
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("msg", "注册人员信息成功");
		stList.add(person);
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
	@RequestMapping(value = "/student", method = RequestMethod.PUT)
	public @ResponseBody
	Object updatePerson(Student person) {
		logger.info("更新人员信息id=" );
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("msg", "更新人员信息成功");
		stList.add(person);
		return jsonObject;
	}
/**
 * get类型的可以在url中直接访问。
 * http://localhost:8080/springmvc/rest/student?name=1222
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
	@RequestMapping(value = "/student", method = RequestMethod.PATCH)
	public @ResponseBody
	List<Student> listPerson(@RequestParam(value = "name", required = false, defaultValue = "") String name) {

		logger.info("查询人员name like " + name);
		List<Student> lstPersons = new ArrayList<Student>();

		Student st = new Student();
		st.setAddress("sd");
		st.setAge(21);
		st.setUsername("xdh");
		lstPersons.add(st);
		
		Student st2 = new Student();
		st2.setAddress("sd2");
		st2.setAge(212);
		st2.setUsername("xdh2");
		lstPersons.add(st2);
		
		Student st23 = new Student();
		st23.setAddress("sd23");
		st23.setAge(2123);
		st23.setUsername("xdh23");
		lstPersons.add(st23);

		return lstPersons;
	}

}
