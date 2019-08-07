package com.fei.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author feixiaoteng
 * @create 2019-07-08 11:17
 */

@Component
public class JdbcConfig {
    @Value("${fei.jdbc.name}")
    private String name;
    @Value("${fei.jdbc.flag}")
    private String flag;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String toString() {
        return "JdbcConfig--->{" + "name='" + name + '\'' + ", flag='" + flag + '\'' + '}';
    }
}
