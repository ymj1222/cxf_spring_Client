package com.ymj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymj.entity.Users;
import com.ymj.service.UsersService;
import com.ymj.webservice.UsersWebService;


@Service
public class UsersServiceImpl implements UsersService<Users> {
	@Autowired
	private UsersWebService usersWebService;

	@Override
	public List<Users> queryAll() {
		List<Users> stuList = usersWebService.query();
		return stuList;
	}
	@Override
	public void add() {
		usersWebService.add();
	}
	@Override	
	public void delete() {
		usersWebService.delete();
	}
	@Override
	public void update() {
		usersWebService.update();
	}
}
