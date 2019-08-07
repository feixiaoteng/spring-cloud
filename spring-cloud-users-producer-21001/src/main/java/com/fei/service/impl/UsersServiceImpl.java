package com.fei.service.impl;

import com.fei.entity.Users;
import com.fei.service.UsersService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author feixiaoteng
 * @create 2019-07-06 19:22
 */
@Service
public class UsersServiceImpl implements UsersService {
    private final static Map<Long, Users> USERS= new HashMap<>();
    static{
        USERS.put(1L,new Users(1, "代腾飞", "123456", "男", 18));
        USERS.put(2L,new Users(2, "许芳晴", "123456", "女", 19));
        USERS.put(3L,new Users(3, "张亚楠", "123456", "女", 20));
        USERS.put(4L,new Users(4, "张笑笑", "123456", "女", 18));
        USERS.put(5L,new Users(5, "王晗", "123456", "女", 19));
        USERS.put(6L,new Users(6, "王亚晴", "123456", "女", 20));
    }
    public Users get(Long id) {
        if(!USERS.isEmpty())
            return USERS.get(id);
        return null;
    }
}
