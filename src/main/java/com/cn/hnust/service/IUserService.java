package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.User;

public interface IUserService {
	public User getUserById(int userId);

	void updateUser(User user);

	int addUser(User user);

	int deleteUser(int userId);

	List<User> findAllUser();
}
