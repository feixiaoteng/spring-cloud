package com.rule;

import com.fei.rule.DTFRandomRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author feixiaoteng
 * @create 2019-07-07 13:59
 */
@Configuration
public class DTFRule {
    @Bean
    public IRule role() {
        return new DTFRandomRule();
    }
}
