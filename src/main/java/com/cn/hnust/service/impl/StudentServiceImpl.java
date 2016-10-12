package com.cn.hnust.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.Student;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IStudentService;
import com.cn.hnust.service.IUserService;

@Service(value="studentServiceImpl")
public class StudentServiceImpl implements IStudentService {
	public static List<Student>  stuList = new ArrayList<Student>();
	@Override
	public Student getStudentById() {
		Student st1 = new Student();
		st1.setUsername("肖东红");
		st1.setAge(22);
		st1.setAddress("BJ");
		return st1;
	}
	@Override
	public List<Student> addStudentById(Student addStu) {
		stuList.add(addStu);
		return stuList;
	}
	@Override
	public Student getStudentById(int userId) {
		Student st1 = new Student();
		st1.setUsername("肖东红");
		st1.setAge(22);
		st1.setAddress("BJ");
		return st1;
	}

}
