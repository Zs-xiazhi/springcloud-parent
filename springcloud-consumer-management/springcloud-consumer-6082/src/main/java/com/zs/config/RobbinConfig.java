package com.zs.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/28
 **/
@Configuration
public class RobbinConfig {

    @Bean
    public IRule random() {
        return new RandomRule();
    }
}
