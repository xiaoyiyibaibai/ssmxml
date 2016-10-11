package com.cn.hnust.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.pojo.Student;
/**
 * 学生信息管理
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/student")
public class StudentController {
	//学生查询
	@RequestMapping("queryStudent")
	public String queryStudent(Model model,String type) {

		System.out.println("学生类型="+type);
		//将学生信息显示到页面上
		List<Student> list  = new ArrayList<Student>();
		//模拟静态数据
		Student st1 = new Student();
		st1.setUsername("肖东红");
		st1.setAge(22);
		st1.setAddress("BJ");
		Student st2 = new Student();
		st2.setUsername("xiaodonghong");
		st2.setAge(26);
		st2.setAddress("XM");
		Student st3 = new Student();
		st3.setUsername("liminghao");
		st3.setAge(18);
		st3.setAddress("sd");
		list.add(st1);
		list.add(st2);
		list.add(st3);
		model.addAttribute("studentList", list);
		return "queryStudent";
	}
	// 学生查询, 返回json
	/**
	 * 使用@ResponseBody 注解将一个 map 转成 json 数据。
Map 中填充：
total：数据总数
rows：List<Student>
这时转成 datagrid 要求的 json 格式
	 * @param model
	 * @return
	 */
	@RequestMapping("queryStudentJson")
	public @ResponseBody Map<String,Object> queryStudentJson(Model model){
		//将学生信息显示到页面上
		List<Student> list  = new ArrayList<Student>();
		//模拟静态数据
		Student st1 = new Student();
		st1.setUsername("肖东红");
		st1.setAge(22);
		st1.setAddress("BJ");
		Student st2 = new Student();
		st2.setUsername("xiaodonghong");
		st2.setAge(26);
		st2.setAddress("XM");
		Student st3 = new Student();
		st3.setUsername("liminghao");
		st3.setAge(18);
		st3.setAddress("sd");
		list.add(st1);
		list.add(st2);
		list.add(st3);
		model.addAttribute("studentList", list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", list.size());
		map.put("rows", list);
		// 返回map数据，由于使用了@ResponseBody注解，自动将map转成json
		return map;
	}


	//学生修改
	//学生添加
}
