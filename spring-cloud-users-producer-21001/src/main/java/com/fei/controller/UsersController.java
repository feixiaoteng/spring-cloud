package com.fei.controller;

import com.fei.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feixiaoteng
 * @create 2019-07-06 19:19
 */
@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("users/{id}")
    public Object get(@PathVariable("id") Long id) {
        System.out.println("21001id = " + id);
        return usersService.get(id);
    }
}
