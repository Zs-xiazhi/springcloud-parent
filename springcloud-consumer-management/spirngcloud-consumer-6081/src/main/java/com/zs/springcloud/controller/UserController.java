package com.zs.springcloud.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/28
 **/
@RestController
public class UserController {

    private static final String URL="http://USER-PROVIDER";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/allUser")
    public List<User> selectAllUser() {
        return restTemplate.getForObject(URL+"/allUser", List.class);
    }
}
