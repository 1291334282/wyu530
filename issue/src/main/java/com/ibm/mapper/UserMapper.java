package com.ibm.mapper;

import com.ibm.entity.User;

public interface UserMapper {
	public User findByName(String name);
//	public int addUser();
}
