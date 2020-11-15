package com.ibm.service;

import com.ibm.entity.User;

public interface UserService {
	public User findByName(String name);
}
