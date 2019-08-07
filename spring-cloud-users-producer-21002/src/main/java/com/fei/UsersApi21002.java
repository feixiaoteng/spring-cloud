package com.fei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author feixiaoteng
 * @create 2019-07-06 16:03
 */
@SpringBootApplication
@EnableEurekaClient
public class UsersApi21002 {
    public static void main(String[] args) {
        SpringApplication.run(UsersApi21002.class,args);
    }
}
