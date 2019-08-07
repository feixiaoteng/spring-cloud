package com.fei.api;

import com.fei.callback.UsersApiCallback;
import com.fei.entity.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "spring-cloud-users-producer",fallbackFactory = UsersApiCallback.class)//服务名称
public interface UsersApi {
	@GetMapping("/users/{id}")//服务地址
	public Users get(@PathVariable("id")Long id);
}