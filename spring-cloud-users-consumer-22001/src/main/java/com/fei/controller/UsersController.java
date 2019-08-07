package com.fei.controller;

import com.fei.api.UsersApi;
import com.fei.entity.Users;
import com.fei.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
	@Autowired
	private UsersApi usersApi;
	@GetMapping("users/{id}")
	public Users get(@PathVariable("id")Long id){
		return usersApi.get(id);
	}
}