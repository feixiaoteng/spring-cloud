package com.fei;

import com.rule.DTFRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author feixiaoteng
 * @create 2019-07-07 12:13
 */
@SpringBootApplication
@EnableDiscoveryClient
/**
 * name:服务名称
 * configuration:负载策略配置类
 */
@RibbonClient(name="spring-cloud-users-producer",configuration = {DTFRule.class})
@EnableFeignClients(basePackages = {"com.fei.api"})
@EnableHystrix
@EnableHystrixDashboard
public class UsersConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(UsersConsumerApp.class,args);
    }
}
