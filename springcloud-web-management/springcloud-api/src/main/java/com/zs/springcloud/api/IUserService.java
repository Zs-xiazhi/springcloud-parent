package com.zs.springcloud.api;

import com.zs.springcloud.api.fallback.IUserServiceFallbackFactory;
import com.zs.springcloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Company 使用feign来实现MVC模式的远程调用，consumer依赖本接口，通过接口中的方法映射provider的controller
 * @Author Zs
 * @Date Create in 2019/9/28
 **/
@FeignClient(value = "USER-PROVIDER", fallbackFactory = IUserServiceFallbackFactory.class)
public interface IUserService {

    /**
     * 获取所有用户信息
     * @return
     */
    @RequestMapping("/allUser")
    List<User> selectAllUser();
}
