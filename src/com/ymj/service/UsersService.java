package com.ymj.service;

import java.util.List;

import com.ymj.entity.Users;

public interface UsersService<T> {
	public List<Users> queryAll();
	public void add();
	public void delete();
	public void update();
}
