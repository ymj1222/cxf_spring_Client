package com.ymj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ymj.entity.Users;
import com.ymj.service.UsersService;


@Controller
public class UsersController {
	@Autowired
	private UsersService<Users> usersService;

	

	@RequestMapping("/query")
	public String query(Model model) {
		List<Users> usersList = usersService.queryAll();
		model.addAttribute("usersList", usersList);
		return "users";
	}
	@RequestMapping("/add")
	public String add(Model model) {
		usersService.add();
		return "forward:query";
	}
	@RequestMapping(value = "/delete")
	public String delete() {
		usersService.delete();
		return "forward:query";
	}
	@RequestMapping(value = "/update")
	public String updateSave() {
		usersService.update();
		return "forward:query";
	}
}
