package com.fei.callback;

import com.fei.api.UsersApi;
import com.fei.entity.Users;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author feixiaoteng
 * @create 2019-07-07 15:44
 */
@Component
public class UsersApiCallback implements FallbackFactory<UsersApi> {
    @Override
    public UsersApi create(Throwable throwable) {
        return new UsersApi() {
            @Override
            public Users get(Long id) {
                return new Users("服务器已关闭");
            }
        };
    }
}
