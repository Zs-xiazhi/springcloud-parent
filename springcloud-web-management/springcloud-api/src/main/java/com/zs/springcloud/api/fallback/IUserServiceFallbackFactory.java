package com.zs.springcloud.api.fallback;

import com.zs.springcloud.api.IUserService;
import com.zs.springcloud.model.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Company
 * @Author Zs
 * 服务降级处理类，在降级中处理熔断
 *  针对hystrix的方法写再controller中的缺陷，就思考问题，consumer调用的是接口IUserService，provider是通过接口调用，
 *  那么如果出现异常，异常最终都会集中再接口处，那么能不能再接口中处理这个异常？
 *  实现FallBackFactory接口，再FallbackFactory中实现回退方法，实现解耦以及单个文件代码过大的问题
 *  注意：再springcloud2.0之前，一个项目中可以有多个FallbackFactory的实现类，但是再2.0之后，强制要求微服务，服务独立运行，
 *  因此一个consumer与provider之间只能有一个FallBackFactory实现类，如果写多个，就会失去作用
 *  使用这种方式需要在消费者的application.properties文件中配置
 *  feign.hystrix.enable=true
 *  告诉消费者启用了断熔，因为这些配置都是在api中，消费者调用api，api开启了断熔，消费者并不知道，因此需要开启
 * @Date Create in 2019/9/29
 **/
@Component
public class IUserServiceFallbackFactory implements FallbackFactory<IUserService> {
    @Override
    public IUserService create(Throwable throwable) {
        return new IUserService() {
            @Override
            public List<User> selectAllUser() {
                ArrayList<User> list = new ArrayList<>();
                User user = new User();
                user.setUsername("服务关闭");
                list.add(user);
                return list;
            }
        };
    }
}
