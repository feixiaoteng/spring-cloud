package com.fei.config;

import com.fei.filter.ErrorFilter;
import com.fei.filter.PostFilter;
import com.fei.filter.PreFilter;
import com.fei.filter.RoutingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author feixiaoteng
 * @create 2019-07-07 23:59
 */
@Configuration
public class AppConfig {
    @Bean
    public ErrorFilter errorFilter(){
        return new ErrorFilter();
    }
    @Bean
    public PreFilter preFilter(){
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter(){
        return new PostFilter();
    }
    @Bean
    public RoutingFilter routingFilter(){
        return new RoutingFilter();
    }
}

