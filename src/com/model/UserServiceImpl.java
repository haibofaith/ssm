package com.model;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.IUserDao;
@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
}
