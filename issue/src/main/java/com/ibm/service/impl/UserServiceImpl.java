package com.ibm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.User;
import com.ibm.mapper.UserMapper;
import com.ibm.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return userMapper.findByName(name);
	}

}
