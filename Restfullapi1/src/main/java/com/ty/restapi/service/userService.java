package com.ty.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.restapi.repository.UserDao;

@Service
public class userService {

	@Autowired
	private UserDao dao;
}
