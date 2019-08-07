package com.fei.controller;

import com.fei.config.JdbcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feixiaoteng
 * @create 2019-07-08 11:24
 */
@RestController
public class TestController {
    @Autowired
    private JdbcConfig jdbcConfig;
    @GetMapping(value = "test")
    public String test(){
        return this.jdbcConfig.toString();
    }
}
