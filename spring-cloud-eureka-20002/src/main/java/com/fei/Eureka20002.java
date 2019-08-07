package com.fei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka20002 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka20002.class, args);
    }
}
