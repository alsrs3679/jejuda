package com.jejuda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jejuda.mapper.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public String test(int no) {
		System.out.println("dao 접근전");
		String t = userDao.test(no);
		System.out.println("dao 접근후");

		return t;
	}

}
