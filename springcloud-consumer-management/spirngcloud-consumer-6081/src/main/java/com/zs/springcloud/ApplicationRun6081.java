package com.zs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/28
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun6081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6081.class, args);
    }
}
