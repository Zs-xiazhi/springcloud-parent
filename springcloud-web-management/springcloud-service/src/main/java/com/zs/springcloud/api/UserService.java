package com.zs.springcloud.api;

import com.zs.springcloud.mapper.UserMapper;
import com.zs.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/26
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAllUser() {
        return userMapper.selectAll();
    }
}
