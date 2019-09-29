package com.zs.springcloud;

import com.zs.config.RuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/28
 **/
@SpringBootApplication
@EnableFeignClients
@RibbonClient(name = "USER-PROVIDER", configuration = RuleConfig.class)
public class ApplicationRun6083 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6083.class, args);
    }
}
