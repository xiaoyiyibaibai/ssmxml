package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}
	@Override
	public int addUser(User user) {
		return this.userDao.insert(user);
	}
	@Override
	public int deleteUser(int userId){
		return this.userDao.deleteByPrimaryKey(userId);

	}
	@Override
	public void updateUser(User user){
		this.userDao.updateByPrimaryKey(user);
	}
	@Override
	public List<User> findAllUser(){
		List<User> userList = this.userDao.selectAllUser();
		return userList;
	}
}
