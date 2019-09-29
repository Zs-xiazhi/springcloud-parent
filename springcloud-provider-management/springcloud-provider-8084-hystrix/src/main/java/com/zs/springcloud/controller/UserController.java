package com.zs.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zs.springcloud.api.UserService;
import com.zs.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.List;


/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/29
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @Company
     * @Author Zs
     *  消费者调用api接口，api接口映射到生产者的controller
     *  @HystrixCommand(fallbackMethod = "selectAllUserFallback")
     *  @HystrixCommand:表示这是一个熔断器的方法
     *      fallbackMethod：表示回退的方法
     *      当主方法发生异常时，就会调用回退方法。
     *  缺点：
     *  1.这种方式会造成，每一个controller方法都有一个fallback方法，就会造成单个文件过大，
     *      如果这个controller有20个主方法，加上回退方法就要写40个方法
     *  2.代码的耦合度非常高，不便于维护，
     * @Date Create in 2019/9/29
     * @param
     * @return
     **/
    @RequestMapping("/allUser")
    @HystrixCommand(fallbackMethod = "selectAllUserFallback")
    public List<User> selectAllUser() throws UnknownServiceException {
        List<User> users = userService.selectAllUser();
        if (users.size() > 0) {
            throw new UnknownServiceException("数据异常");
        }
        return users;
    }

    /**
     * 回退方法，参数要与主方法的参数保持一致
     * @return
     */
    public List<User> selectAllUserFallback() {
        ArrayList<User> list = new ArrayList<>();
        User user = new User();
        user.setUsername("服务关闭");
        list.add(user);
        return list;
    }
}
