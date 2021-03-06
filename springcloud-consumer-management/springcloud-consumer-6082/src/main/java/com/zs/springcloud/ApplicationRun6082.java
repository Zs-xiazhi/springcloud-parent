package com.zs.springcloud;

import com.zs.config.RobbinConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientName;

/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/28
 **/
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "USER-PROVIDER",configuration = RobbinConfig.class)
public class ApplicationRun6082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class, args);
    }
}
