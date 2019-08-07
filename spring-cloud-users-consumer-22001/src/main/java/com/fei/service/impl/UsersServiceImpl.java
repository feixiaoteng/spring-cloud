package com.fei.service.impl;

import com.fei.entity.Users;
import com.fei.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private RestTemplate restTemplate;
    /*@Autowired
    private DiscoveryClient discoveryClient;*/

    public Users get(Long id) {
       return restTemplate.getForObject("HTTP://spring-cloud-users-producer/users/"+id, Users.class);
       /* List<ServiceInstance> instances = this.discoveryClient.getInstances("eureka-client-server");
        if (instances.isEmpty()) {
            return null;
        }
        ServiceInstance serviceInstance = instances.get(0);
        String url = serviceInstance.getHost() + ":" + serviceInstance.getPort();
        return restTemplate.getForObject("HTTP://" + url + "/users/" + id, Users.class);*/
    }
}