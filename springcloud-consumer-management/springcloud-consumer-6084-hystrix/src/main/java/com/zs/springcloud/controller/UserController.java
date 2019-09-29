package com.zs.springcloud.controller;

import com.zs.springcloud.api.IUserService;
import com.zs.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/29
 **/
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/allUser")
    public List<User> selectAllUser() {
        return userService.selectAllUser();
    }
}
