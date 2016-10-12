package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Student;

public interface IStudentService {

	List<Student> addStudentById(Student addStu);

	Student getStudentById();

	Student getStudentById(int userId);

}
